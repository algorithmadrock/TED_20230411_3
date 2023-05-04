/*
RESUMO      : Classe do Escalonador de processos Round Robin
PROGRAMADORA: Luiza Felix
DATA        : 03/05/2023
 */

package controller;

import br.edu.fateczl.filas.Fila;
import model.Processos;

public class Controller {
	public static void escalonador(Fila exe) throws Exception {
		Processos process = (Processos) exe.remove();
		process.retorno -=1;
		
		if (process.retorno>0) {
			exe.insert(process);
		} else {
			System.err.println(process.nome +  "encerrou sua execucao.");
		}
	}

}
