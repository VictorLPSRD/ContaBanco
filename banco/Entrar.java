
import java.util.Scanner;

import contas.Conta;
import contas.ContaCorrente;

public class Entrar {

    // Método para verificar login
    public static void verificar(Scanner scanner, String[] usuarios, String[] senhas) {
        System.out.print("Informe seu usuário: ");
        String usuarioDigitado = scanner.nextLine();

        System.out.print("Informe sua senha: ");
        String senhaDigitada = scanner.nextLine();

        // Verificar se o usuário existe
        int verificar = -1;
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(usuarioDigitado)) {
                verificar = i;
                break;
            }
        }

        // Verifica se a senha também corresponde ao usuário encontrado
        Limpar.limparTerminal();
        if (verificar != -1 && senhas[verificar].equals(senhaDigitada)) {
            System.out.println("Login realizado com sucesso!");
            boolean continuar = true;

            while (continuar) {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1 - Abrir Conta Corrente");
                System.out.println("2 - Abrir Conta Poupança");
                System.out.println("3 - Sair");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu abrir uma Conta Corrente.");
                        System.out.print("Digite o número da conta: ");
                        scanner.nextLine(); // Para consumir a quebra de linha deixada por nextInt()
                        String ncontaCorrente = scanner.nextLine();
                        Conta contaCorrente = new ContaCorrente(ncontaCorrente, 1000.0, 50.0);

                        System.out.println("Conta Corrente criada com sucesso!");
                        System.out.println("Operações disponíveis:");
                        System.out.println("1 - Depositar");
                        System.out.println("2 - Sacar");
                        System.out.println("3 - Consultar Saldo");

                        int operacao = scanner.nextInt();
                        switch (operacao) {
                            case 1:
                                System.out.print("Digite o valor para depósito: ");
                                double deposito = scanner.nextDouble();
                                contaCorrente.depositar(deposito);
                                System.out.println("Depósito realizado com sucesso!");
                                break;
                            case 2:
                                System.out.print("Digite o valor para saque: ");
                                double saque = scanner.nextDouble();
                                if (contaCorrente.sacar(saque)) {
                                    System.out.println("Saque realizado com sucesso!");
                                } else {
                                    System.out.println("Saldo insuficiente para saque.");
                                }
                                break;
                            case 3:
                                System.out.println("Saldo atual: " + contaCorrente.consultarSaldo());
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                        break;

                    case 2:
                        System.out.println("Você escolheu abrir uma Conta Poupança.");
                        // Lógica para abrir Conta Poupança
                        break;

                    case 3:
                        System.out.println("Saindo...");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                        break;
                }
            }

        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
    }
}
