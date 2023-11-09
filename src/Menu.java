import java.util.Scanner;

public class Menu {
	public Menu() {
		exibirMenu();
	}
	
	private static void exibirMenu() {
		System.out.println("------------------- SISTEMA BANCARIO ----------------------");
		System.out.println("[1] - OPCOES DE GERENCIAMENTO DO BANCO");
		System.out.println("[2] - OPCOES DE GERENCIAMENTO DO AGENCIA");
		System.out.println("[3] - OPCOES DE GERENCIAMENTO DO FUNCIONARIO");
		System.out.println("[4] - OPCOES DE GERENCIAMENTO DO CONTA");
		System.out.println("[5] - OPCOES DE GERENCIAMENTO DO CLIENTE");
		System.out.println("");
		System.out.println("[6] - OPCOES DE ACESSO A MINHA CONTA");
		System.out.println("[7] - DESEJA SAIR?");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		escolha();
	}
	
	private static void escolha() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("DIGITE SUA ESCOLHA: ");
			int esc = scan.nextInt();
			if (esc == 1) {
				System.out.println("voce escolheu para banco");
			} else if (esc == 2) {
				System.out.println("voce escolheu para agencia");
			} else if (esc == 3) {
				System.out.println("voce escolheu para funcionario");
			} else if (esc == 4) {
				System.out.println("voce escolheu para conta");
			} else if (esc == 5) {
				System.out.println("voce escolheu para cliente");
			} else if (esc == 6) {
				System.out.println("voce escolheu para gerenciar sua conta");
			} else if (esc == 7) {
				System.out.println("saindo...");
				break;
			} else {
				System.out.println("digite opcao valida");
			}
		}
	}
}
