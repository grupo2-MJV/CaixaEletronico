package com.Grupo2.CaixaEletronico.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Grupo2.CaixaEletronico.model.ContaCorrente;
import com.Grupo2.CaixaEletronico.model.ExtratoResponse;
import com.Grupo2.CaixaEletronico.model.ResponseEntity;

public class ContaCorrenteServices {


    ContaCorrente contaCorrente = new ContaCorrente();

    public Double sacar(Double valor) {
        var saldo = contaCorrente.getSaldo();
        if (saldo < valor) {
            throw new IllegalArgumentException("O valor de saque não pode ser maior que o saldo em conta.");
        } else {
            saldo -= valor;
        }
        return saldo;
    }

    public ExtratoResponse consultarExtrato(String dataInicio, String dataFinal) throws Exception {
        if(dataInicio == null || dataFinal == null){
            throw new Exception("Não é possivel consultar extrato sem a indicação de periodo.");
        }
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInit = formato.parse(dataInicio);
        Date dataFim = formato.parse(dataFinal);
        
        if (dataFim.before(dataInit)) {
           throw new Exception("Não existe extrato para o periodo de dias informado, por favor tente novamente.");
        }

        List<String> movimentos = new ArrayList<>();
        movimentos.add("Caso o cliente tenha movimentações elas vão aparecer nessa lista.");
        Double saldoInicio = 8767.00;

        ExtratoResponse extratoResponse = new ExtratoResponse();
        extratoResponse.setDataInicio(dataInit);
        extratoResponse.setDataFinal(dataFim);
        extratoResponse.setSaldoInicio(saldoInicio);
        extratoResponse.setSaldoAtual(contaCorrente.getSaldo());
        extratoResponse.setMovimentacoes(movimentos);
        return extratoResponse;
    }

    public ResponseEntity consultarSaldo(String numeroCc) throws Exception {
        if (contaCorrente.ValidaConta(numeroCc) == true) {
            var saldo = String.valueOf(contaCorrente.getSaldo());
            var nome = contaCorrente.getNomeDoCliente();
            ResponseEntity responseEntity = new ResponseEntity();
            responseEntity.setSaldo(saldo);
            responseEntity.setNome("nome do Cliente");
            responseEntity.setContaCorrente(numeroCc);
            return responseEntity;
        }
        throw new Exception("numero de conta inválido, verifique corretamente os digitos.");
        
    }

    public ResponseEntity transferirSaldo(String numeroCc, String numeroCt, Double valorTransferencia) throws Exception {
        if (contaCorrente.ValidaConta(numeroCc) == true && contaCorrente.ValidaConta(numeroCt) == true) {
            var saldo = contaCorrente.getSaldo();
            if (saldo < valorTransferencia) {
            throw new IllegalArgumentException("O valor de transferencia não pode ser maior que o saldo em conta.");
            } else {
            saldo -= valorTransferencia;
            }
            ResponseEntity responseEntity = new ResponseEntity();
            responseEntity.setContaCorrente(numeroCc);
            responseEntity.setNome(contaCorrente.getNomeDoCliente());
            responseEntity.setSaldo(String.valueOf(saldo));
            responseEntity.setContaCorrenteTransf(numeroCt);
            responseEntity.setNomeClienteTransf("NOME CLIENTE TRANSF");
            responseEntity.setValorTransf(String.valueOf(valorTransferencia));

            return responseEntity;
        } 
        throw new Exception("Algo de errado aconteceu na sua transferencia, tente novamente!");
    }

    

}
