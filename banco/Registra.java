

import java.util.Arrays;
import java.util.Scanner;

public class Registra {

    public static String[][] adicionaruser(Scanner scanner, String[] Usuarios, String[] senhas) {
        System.out.print("Informe seu usuário: ");
        String Useradd = scanner.nextLine();
        
        System.out.print("Informe sua senha: ");
        String senhaadd = scanner.nextLine(); 

        // Aumentando o tamanho dos arrays para acomodar o novo usuário
        Usuarios = Arrays.copyOf(Usuarios, Usuarios.length + 1);
        senhas = Arrays.copyOf(senhas, senhas.length + 1);

        // Adicionando o novo usuário e senha nas últimas posições dos arrays
        Usuarios[Usuarios.length - 1] = Useradd;
        senhas[senhas.length - 1] = senhaadd;

        System.out.println("Usuário registrado com sucesso!");

        // Retornando um array 2D com os arrays atualizados
        return new String[][] {Usuarios, senhas};
    }
}
