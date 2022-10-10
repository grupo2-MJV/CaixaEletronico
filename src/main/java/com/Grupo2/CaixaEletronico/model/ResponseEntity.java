package com.Grupo2.CaixaEletronico.model;

public class ResponseEntity {
    
    String Nome;
    String Saldo;
    String contaCorrente;
    String Msg;
    String codeReturn;
    String contaCorrenteTransf;
    String nomeClienteTransf;
    String valorTransf;

    public ResponseEntity() {
    }
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getSaldo() {
        return Saldo;
    }
    public void setSaldo(String saldo) {
        Saldo = saldo;
    }
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getMsg() {
        return Msg;
    }
    public void setMsg(String msg) {
        Msg = msg;
    }
    public String getCodeReturn() {
        return codeReturn;
    }
    public void setCodeReturn(String codeReturn) {
        this.codeReturn = codeReturn;
    }

    public String getContaCorrenteTransf() {
        return contaCorrenteTransf;
    }

    public void setContaCorrenteTransf(String contaCorrenteTransf) {
        this.contaCorrenteTransf = contaCorrenteTransf;
    }

    public String getNomeClienteTransf() {
        return nomeClienteTransf;
    }

    public void setNomeClienteTransf(String nomeClienteTransf) {
        this.nomeClienteTransf = nomeClienteTransf;
    }

    public String getValorTransf() {
        return valorTransf;
    }

    public void setValorTransf(String valorTransf) {
        this.valorTransf = valorTransf;
    }
    
}
