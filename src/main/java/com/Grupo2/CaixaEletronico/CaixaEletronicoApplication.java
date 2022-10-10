package com.Grupo2.CaixaEletronico;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Grupo2.CaixaEletronico.model.ExtratoResponse;
import com.Grupo2.CaixaEletronico.services.ContaCorrenteServices;

@SpringBootApplication
public class CaixaEletronicoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CaixaEletronicoApplication.class, args);

		ContaCorrenteServices cc = new ContaCorrenteServices();

		// BLOCO DE CONSULTAR EXTRATO
		/*String dataInicio = "02/10/2022";
		String dataFinal = "09/10/2022";

		ExtratoResponse extratoResponse = new ExtratoResponse();
		extratoResponse = cc.consultarExtrato(dataInicio, dataFinal);


		System.out.println("********* EXTRATO DETALHADO **********");
		System.out.println(" ");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dataInicio = dateFormat.format(extratoResponse.getDataInicio());
		dataFinal = dateFormat.format(extratoResponse.getDataFinal());
		System.out.println("Data inicial: " + dataInicio);
		System.out.println("Data final: " + dataFinal);
		System.out.println("Saldo inicial: "+extratoResponse.getSaldoInicio());
		System.out.println(extratoResponse.getMovimentacoes());
		System.out.println("Saldo final: "+extratoResponse.getSaldoAtual());
		System.out.println(" ");
		System.out.println("*************************************");
		*/



		//CONSULTAR SALDO ATUAL

		String numoroCc = "123456789";

		var saldo = cc.consultarSaldo(numoroCc);


		System.out.println("********* CONSULTAR SALDO **********");
		System.out.println(" ");
		System.out.println("Numero da conta: "+ saldo.getContaCorrente());
		System.out.println("Nome: "+ saldo.getNome());
		System.out.println("Saldo atual: R$"+saldo.getSaldo());
		System.out.println(" ");
		System.out.println("************************************");

	}
}