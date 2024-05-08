import java.util.Scanner;

public class atividade3 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Criando os vetores A e B
	        int[] vetorA = new int[5];
	        int[] vetorB = new int[5];
	        
	        // Preenchendo o vetor A
	        System.out.println("Digite os 5 valores para o vetor A:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite o valor " + (i + 1) + ": ");
	            vetorA[i] = scanner.nextInt();
	        }
	        
	        // Preenchendo o vetor B
	        System.out.println("Digite os 5 valores para o vetor B:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite o valor " + (i + 1) + ": ");
	            vetorB[i] = scanner.nextInt();
	        }
	        
	        // Juntando os vetores A e B em C
	        int[] vetorC = new int[10];
	        for (int i = 0; i < 5; i++) {
	            vetorC[i] = vetorA[i];
	            vetorC[i + 5] = vetorB[i];
	        }
	        
	        // Apresentando os vetores A, B e C
	        System.out.println("Vetor A:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print(vetorA[i] + " ");
	        }
	        System.out.println();
	        
	        System.out.println("Vetor B:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print(vetorB[i] + " ");
	        }
	        System.out.println();
	        
	        System.out.println("Vetor C:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(vetorC[i] + " ");
	        }
	        System.out.println();
	        
	        scanner.close();
	    }
	}

