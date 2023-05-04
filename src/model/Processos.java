/*
RESUMO      : Classe dos Processos
PROGRAMADORA: Luiza Felix
DATA        : 03/05/2023
 */

package model;

public class Processos {
	public String nome;
	public int retorno;
	
	public Processos() {
		nome = "processo" + (int) (Math.random()*1001 + 1000) + ".exe";
		retorno = (int) (Math.random()*21 + 5);
		System.out.println(nome + ";" + retorno + " entrou na fila");
	}

}
