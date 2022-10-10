package com.Grupo2.CaixaEletronico.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;

import com.Grupo2.CaixaEletronico.model.ContaCorrente;
import com.Grupo2.CaixaEletronico.model.ExtratoResponse;
import com.Grupo2.CaixaEletronico.model.ResponseEntity;

@SpringBootTest
public class ContaCorrenteServicesTest {

    @InjectMocks
    ContaCorrenteServices contaCorrenteServices;

    @Mock
    ExtratoResponse extratoResponse;

    @Mock
    ContaCorrente contaCorrente;

    @Test
    void consultarExtrato_quandoDataSaoValidas() throws Exception {
        String dataInicio = "21/03/2022";
        String dataFinal = "10/10/2022";

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        ExtratoResponse extratoResponse = new ExtratoResponse();
        Date dataInit = formato.parse(dataInicio);
        Date dataFim = formato.parse(dataFinal);
        extratoResponse.setDataInicio(dataInit);
        extratoResponse.setDataFinal(dataFim);

        var response = contaCorrenteServices.consultarExtrato(dataInicio, dataFinal);

        assertNotNull(response);
        assertEquals(extratoResponse.getDataInicio(), response.getDataInicio());
        assertEquals(extratoResponse.getDataFinal(), response.getDataFinal());

    }

    @Test
    void transferirSaldo_quandoValorTransfIsOk() throws Exception {
        String numeroCc = "123456789";
        String numeroCt = "987654321";
        Double valorTransferencia = 500D;

        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setContaCorrente(numeroCc);
        responseEntity.setNome(contaCorrente.getNomeDoCliente());
        responseEntity.setSaldo(String.valueOf(contaCorrente.getSaldo()));
        responseEntity.setContaCorrenteTransf(numeroCt);
        responseEntity.setNomeClienteTransf("NOME CLIENTE TRANSF");
        responseEntity.setValorTransf(String.valueOf(valorTransferencia));


        var response = contaCorrenteServices.transferirSaldo(numeroCc, numeroCt, valorTransferencia);

        assertNotNull(response);
        assertEquals(responseEntity.getNomeClienteTransf(), response.getNomeClienteTransf());
        assertEquals(responseEntity.getValorTransf(), response.getValorTransf());
        assertEquals(responseEntity.getNome(), response.getNome());
    }
}