package com.Grupo2.CaixaEletronico.model;

import java.util.Date;
import java.util.List;

public class ExtratoResponse {
    
    private Date dataInicio;
    private Date dataFinal;
    private List<String> movimentacoes;
    private Double saldoInicio;
    private Double saldoAtual;

    public ExtratoResponse() {
        super();
    }

    public ExtratoResponse(Date dataInicio, Date dataFinal, List<String> movimentacoes, Double saldoInicio, Double saldoAtual) {
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.movimentacoes = movimentacoes;
        this.saldoInicio = saldoInicio;
        this.saldoAtual = saldoAtual;
    }

    public Date getDataInicio() {

        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    public Date getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    public List<String> getMovimentacoes() {
        return movimentacoes;
    }
    public void setMovimentacoes(List<String> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }
    public Double getSaldoInicio() {
        return saldoInicio;
    }

    public void setSaldoInicio(Double saldoInicio) {
        this.saldoInicio = saldoInicio;
    }
    public Double getSaldoAtual() {
        return saldoAtual;
    }
    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

}
