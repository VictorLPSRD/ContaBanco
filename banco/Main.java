

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Inicializando arrays vazios
        String[] Usuarios = {};
        String[] senhas = {}; 

        while (true) {
            Limpar.limparTerminal();
            System.out.println("BEM VINDO");
            System.out.println("=============");
            System.out.println("\nEscolha a operação:\n");
            System.out.println("1 - ENTRAR");
            System.out.println("2 - REGISTRAR");
            System.out.println("3 - Sair\n");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            if (opcao == 1) {
                if (Usuarios.length > 0) {
                    // O array de Usuários contém elementos
                    // Chama o método da classe Entrar para realizar a verificação
                    Entrar.verificar(scanner, Usuarios, senhas);
                } else {
                    // O array de Usuários está vazio
                    System.out.println("Nenhum usuário registrado.");
                }

            } else if (opcao == 2) {
                System.out.println("Você escolheu registrar um usuário:\n");
                // Chama o método de adicionar usuário e recebe os arrays atualizados
                String[][] result = Registra.adicionaruser(scanner, Usuarios, senhas);
                Usuarios = result[0];  // Atualiza o array de Usuarios
                senhas = result[1];    // Atualiza o array de senhas
            } else {
                System.out.println("Saindo...");
                break; // Termina o loop quando a opção for sair
            }
        }
    }
}
