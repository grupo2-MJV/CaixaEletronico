package com.Grupo2.CaixaEletronico.model;

import java.util.Date;

public class ContaCorrente {

    private Integer numeroDaConta;
    private Integer getNumeroAgencia;
    private String nomeDoCliente;
    private Date dataDeNascimento;
    private Double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(Integer numeroDaConta, Integer getNumeroAgencia, String nomeDoCliente, Date dataDeNascimento, Double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.getNumeroAgencia = getNumeroAgencia;
        this.nomeDoCliente = nomeDoCliente;
        this.dataDeNascimento = dataDeNascimento;
        this.saldo = saldo;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
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

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
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

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
