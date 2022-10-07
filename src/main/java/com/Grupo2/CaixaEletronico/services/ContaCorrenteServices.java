package com.Grupo2.CaixaEletronico.services;

import com.Grupo2.CaixaEletronico.model.ContaCorrente;

public class ContaCorrenteServices {


    ContaCorrente contaCorrente = new ContaCorrente();

    public Double sacar(Double valor) {
        var saldo = contaCorrente.getSaldo();
        if (saldo < valor) {
            throw new IllegalStateException();
        } else {
            saldo -= valor;
        }
        return saldo;
    }



}
