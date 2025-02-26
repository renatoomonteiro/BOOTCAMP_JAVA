/*
 * POO - Polimorfismo
 * @Override -> notação que altera classe, método, etc.
 * Método toString
 * POO - ABSTRAÇÃO
 * */

package br.com.cdb.heranca;

import br.com.cdb.heranca.model.Aluno;
import br.com.cdb.heranca.model.Faxineiro;
import br.com.cdb.heranca.model.Funcionario;
import br.com.cdb.heranca.model.Pessoa;
import br.com.cdb.heranca.model.Professor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Pessoa fulano = new Pessoa("Fulano");
		
		//System.out.println(fulano);
		
		//fulano.nome = "Fulano";
		//fulano.cpf = 1234567890;
		
		//fulano.apresentacao();
		
		Aluno aluno1 = new Aluno("Javeiro", 123456);
		System.out.println(aluno1);
		
		Funcionario funcionario = new Funcionario("Funcionário");
		funcionario.nome = "";
		
		Professor prof = new Professor("Denilson");
		prof.cpf = 1234567898;
		prof.nome = "Denilson";
		prof.salario = 1;
		prof.numeroDeAulas = 10;
		prof.novoSalario(2, 30);
//		aluno1.apresentacao();		
//		funcionario.apresentacao();
		
		
		
		
		Faxineiro faxineiro = new Faxineiro("Denilson faxineiro");
		faxineiro.turno = "Noturno";
		
		//faxineiro.apresentacao();
		
		//System.out.print(faxineiro.nome);
		
		ArrayList<Pessoa> listaDaEscola = new ArrayList<>(); 
		
		//listaDaEscola.add(fulano);
		listaDaEscola.add(aluno1);
		listaDaEscola.add(funcionario);
		listaDaEscola.add(prof);
		listaDaEscola.add(faxineiro);
		
		for(Pessoa p : listaDaEscola){
			p.apresentacao();

			if(p instanceof Professor) {
				//Pegar métodos de classes filhas
				System.out.println("E tenho " + ((Professor)p).numeroDeAulas + " número de aulas.");
			}
		}
		
	}

}
