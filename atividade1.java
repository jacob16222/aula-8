import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um vetor para armazenar os nomes
        String[] nomes = new String[5];

        // Solicitando ao usuário que insira os nomes
        System.out.println("Por favor, insira 5 nomes:");

        // Loop para inserir os nomes no vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Apresentando os valores armazenados no vetor
        System.out.println("\nValores armazenados no vetor:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }
    }
}
		 

 