import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		boolean continueRecevingInput = true;
		Fila filaMaiuscula = new Fila(999);
		Fila filaMinuscula = new Fila(999);

		while(continueRecevingInput == true) {
			System.out.print("Digite um caracter: ");
			String retorno = entrada.nextLine();
        	if(retorno.isEmpty()) {
        		continueRecevingInput = false;	
        	}
        	else{
        		char n = retorno.charAt(0);
        		if(Character.isLowerCase(n)) {
        			filaMinuscula.push(n);
        		}
        		else{
        			filaMaiuscula.push(n);
        		}
        	}
		}
		
		System.out.println();
		System.out.println("Fila de Maiúscula: ");
		for (int i = 0; i < filaMaiuscula.size(); i++) {
			System.out.println(filaMaiuscula.front());
			filaMaiuscula.pop();
		}
		
		System.out.println();
		System.out.println("Fila de Maiúscula: ");
		for (int j = 0; j < filaMinuscula.size(); j++) {
			System.out.println(filaMinuscula.front());
			filaMinuscula.pop();
		}
		
		entrada.close();
	}

}
