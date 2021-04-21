package br.com.erickfreire.programadejuroscompostosmodificado;


/**
 * Programa em Java que calcula Juros Compostos
 * @author Erick Freire
 * @version 1 - Criado em 21-04-2021 as 15:40
 */

public class ProgramaDeJurosCompostosModificado {

	public static void main(String[] args) {
		
		int total;
		int principal = 1000;
		int taxaDeJuros = 5;
		
		System.out.printf("%s%20s %n", "Ano", "Total de Deposito");
		
		
		
		for(int ano = 1; ano <= 6; ano++) {
			total = principal;
			
			total = ((principal * taxaDeJuros) + total);
			
			System.out.printf("%4d%,20d%n", ano, total);
			
			taxaDeJuros += 1;
		
		}
		
	}

}
