import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[5];
        int soma = 0;

        // Solicita ao usuário que insira os valores
        System.out.println("Informe 5 valores inteiros:");

        // Preenche o vetor com os valores informados pelo usuário
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            valores[i] = scanner.nextInt();
            soma += valores[i];
        }

        // Exibe a soma dos valores
        System.out.println("A soma dos valores informados é: " + soma);

        // Verifica se há algum valor maior que 15 e exibe
        boolean temMaiorQue15 = false;
        for (int valor : valores) {
            if (valor > 15) {
                temMaiorQue15 = true;
                break;
            }
        }

        if (temMaiorQue15) {
            System.out.println("Pelo menos um dos valores informados é maior que 15.");
        } else {
            System.out.println("Nenhum dos valores informados é maior que 15.");
        }

        scanner.close();
    }
}

