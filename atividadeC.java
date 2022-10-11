import java.util.Scanner;

public class atividadeC {
	
	public static int potenciaKN(int k, int n) {
		if(n == 1) {
			return k;
		}
		return k * potenciaKN(k, n - 1);
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de K(base): ");
		int k = entrada.nextInt();
		System.out.print("Digite o valor de N(expoente): ");
		int n = entrada.nextInt();
		System.out.println();
		
		System.out.println("O resultado de " + k + " elevado a " + n + " é igual: " + atividadeC.potenciaKN(k, n));
		
		entrada.close();
	}	
}
