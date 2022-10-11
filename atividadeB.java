import java.util.Scanner;

public class atividadeB {
	
	public static int imprimeNumeros(int n, int y) {
		
		System.out.println(y);
		if(n > y) {
			return imprimeNumeros(n, y+1);
		}
		else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int y = 0;
		
		System.out.println("Digite um número inteiro: ");
		int n = entrada.nextInt();
		System.out.println();
		
		System.out.println("Ordem crescente de 0 até o valor digitado:");
		atividadeB.imprimeNumeros(n,y);
		
		entrada.close();
	}

}
