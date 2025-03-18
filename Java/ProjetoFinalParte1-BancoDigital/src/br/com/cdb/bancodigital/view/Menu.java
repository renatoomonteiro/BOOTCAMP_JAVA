package br.com.cdb.bancodigital.view;
import java.util.Scanner;

import br.com.cdb.bancodigital.service.ClienteService;

public class Menu {
	
	ClienteService clienteService = new ClienteService() ;
	
	Scanner input = new Scanner(System.in);
	
	public Menu() {
		System.out.println("\nBem vindo ao Banco Digital DCB!\n");
		menuCliente();
	}
	
	public void menuCliente() {
		boolean menuCliente = true;
		while(menuCliente) {
			System.out.println("\n1 - Cadastrar novo Cliente\n" +
							     "2 - Entrar com id do Clinte\n" +
								 "3 - Sair");
			
			int escolha = input.nextInt();
			switch(escolha) {
			case 1:
				input = new Scanner(System.in);
				System.out.println("\nInsira o seu nome: ");
				String nome = input.nextLine();
				//clienteService.addCliente(nome);
				System.out.println("\nInsira o seu CPF: ");
				String cpf = input.nextLine();
				//Verifica se o CPF é válido:
				clienteService.addCliente(cpf);
				if(clienteService.addCliente(cpf) == false) {
					System.err.println("\nCPF inválido!\nRevise e tente novamente!");
				}else {
					System.out.println("\nO CPF: " + cpf + " para o usuário(a) " + nome + " foi inserido com sucesso!");
				}
			}
		}
	}
}
