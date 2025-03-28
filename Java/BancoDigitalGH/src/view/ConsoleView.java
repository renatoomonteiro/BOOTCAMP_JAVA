package view;

import controller.AccountController;
import java.util.Scanner;

public class ConsoleView {
    private static AccountController accountController = new AccountController();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Olá!\nSeja bem vindo ao Banco Digital!\n");
    	
    	while (true) {
            System.out.println("1. Criar conta");
            System.out.println("2. Saldo");
            System.out.println("3. Depósito");
            System.out.println("4. Saque");
            System.out.println("5. Apagar conta");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    viewAccount();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    deleteAccount();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção inválida!\nTente outro número.\n");
            }
        }
    }

    private static void createAccount() {
        System.out.println("Informe o número da conta:");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("Nome do cliente:");
        String owner = scanner.nextLine();
        System.out.println("Saldo inicial:");
        double balance = scanner.nextDouble();
        accountController.createAccount(id, owner, balance);
    }

    private static void viewAccount() {
        System.out.println("Informe o número da conta:");
        int id = scanner.nextInt();
        accountController.viewAccount(id);
    }

    private static void deposit() {
        System.out.println("Informe o número da conta:");
        int id = scanner.nextInt();
        System.out.println("Informe o valor do depósito:");
        double amount = scanner.nextDouble();
        accountController.deposit(id, amount);
    }

    private static void withdraw() {
        System.out.println("Informe o número da conta:");
        int id = scanner.nextInt();
        System.out.println("Informe o valor que deseja sacar:");
        double amount = scanner.nextDouble();
        accountController.withdraw(id, amount);
    }

    private static void deleteAccount() {
        System.out.println("Informe o número da conta:");
        int id = scanner.nextInt();
        accountController.deleteAccount(id);
    }
}