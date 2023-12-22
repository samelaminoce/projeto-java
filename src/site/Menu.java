package site;



import java.util.Scanner;

import site.util.Cores;


public class Menu {

	public static void main(String[] args) {
		 exibirMenu();
    }

    private static void exibirMenu() {
        int escolha;
        Scanner scanner = new Scanner(System.in);

        do {
        	System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND);
        	
            System.out.println("\n*** Ateliê Look Perfeito ***\n");
            System.out.println("1. Ver Catálogo de Roupas e Acessórios");
            System.out.println("2. Adicionar ao Carrinho");
            System.out.println("3. Ver Carrinho");
            System.out.println("4. Finalizar Compra");
            System.out.println("5. Sair");
            System.out.print("\n Escolha uma opção: ");

            try {
                escolha = scanner.nextInt();
                scanner.nextLine();
                processarEscolha(escolha);
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.nextLine();
                escolha = 0;
            }
        } while (escolha != 5);
        scanner.close();
    }

    private static void processarEscolha(int escolha) {
        switch (escolha) {
            case 1:
         
                System.out.println("Catálogo de Roupas");
                
                break;
            case 2:
            
                System.out.println("Adicionando ao Carrinho");
                break;
            case 3:
           
                System.out.println("Carrinho de Compras");
                break;
            case 4:
             
                System.out.println("Compra Finalizada");
                break;
            case 5:
                System.out.println("Saindo da Loja. Até logo!");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}

  