package com.Grupo2.CaixaEletronico.model;

import com.Grupo2.CaixaEletronico.services.ContaCorrenteServices;

import java.util.Date;
import java.util.Objects;

public class ContaCorrente {

    private ContaCorrenteServices services;

    public ContaCorrente(ContaCorrenteServices services) {
        this.services = services;
    }

    private String numeroDaConta;
    private Integer getNumeroAgencia;
    private String nomeDoCliente = "fulano de tal";
    private Date dataDeNascimento;
    private Double saldo = 5000.0D;
    private ExtratoResponse extratoResponse;


    public ContaCorrente(String numeroDaConta, Integer getNumeroAgencia, String nomeDoCliente, Date dataDeNascimento,
        Double depositoInicial, ExtratoResponse extratoResponse) {
        this.numeroDaConta = numeroDaConta;
        this.getNumeroAgencia = getNumeroAgencia;
        this.nomeDoCliente = nomeDoCliente;
        this.dataDeNascimento = dataDeNascimento;
        services.depositar(depositoInicial);
        this.extratoResponse = extratoResponse;
    }


    public ContaCorrente() {
    }


    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Integer getGetNumeroAgencia() {
        return getNumeroAgencia;
    }

    public void setGetNumeroAgencia(Integer getNumeroAgencia) {
        this.getNumeroAgencia = getNumeroAgencia;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Double getSaldo() {
        return saldo;
    }

    
    public boolean ValidaConta(String cc) throws Exception {
    	
    	if (Objects.isNull(cc)) {
			throw new Exception("O numero da conta corrente é obrigatórioo para realizar transações.");
		}
		if (cc.matches(".*[a-zA-Z]+.*")) {
			throw new Exception("O numero da conta corrente não contém letras ou caracteres especiais.");
		}
		
    	String contaCorrenteDigitos = cc.replaceAll("\\D", "").trim();
		if (contaCorrenteDigitos.length() != 9) {
			throw new Exception("O número da conta corrente possue 9 digitos");
		}
		return true;
    }


    public ExtratoResponse getExtratoResponse() {
        return extratoResponse;
    }


    public void setExtratoResponse(ExtratoResponse extratoResponse) {
        this.extratoResponse = extratoResponse;
    }

}
