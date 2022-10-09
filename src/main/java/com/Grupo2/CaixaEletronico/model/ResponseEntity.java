package com.Grupo2.CaixaEletronico.model;

public class ResponseEntity {
    
    String Nome;
    String Saldo;
    String contaCorrente;
    String Msg;
    String codeReturn;

    
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

    
}
