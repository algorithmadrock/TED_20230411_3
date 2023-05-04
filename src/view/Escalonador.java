/*
RESUMO      : Classe de execução do algoritmo escalonador
PROGRAMADORA: Luiza Felix
DATA        : 03/05/2023
 */

package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.filas.Fila;
import controller.Controller;
import model.Processos;

public class Escalonador {
	public static void main(String[] args) throws Exception {
		Fila alocacao = new Fila();
		
		
		JOptionPane.showMessageDialog(null, "Ao confirmar, o código criará 5 processos com nomes aleatórios e que terão que retornar a fila de escalonamento entre 5 a 25 vezes. \nNesssa simulação, o tempo de 'execução' de cada processo é o mesmo, simulando o funcionamento do escalonador RoundRobin");
		
		for (int i = 1; i<=5; i++) {
			Processos processo = new Processos();
			alocacao.insert(processo);
		}
		
		while(!alocacao.vazia()) {
			Controller.escalonador(alocacao);
		}
		
	}

}
