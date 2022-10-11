
class Fila {
	private char[] itens;
	private int fim; private
	int tam_max;
	
	public Fila(int n) {
		itens = new char[n];
		tam_max=n; 
		fim=0;
	}
	
	public void push(char valor) {
		itens [ fim ] = valor;
		fim++;
	}
	
	public void pop() {
		for(int i = 0; i < (fim-1); i++)
		itens[ i ] = itens[ i+1 ];
		itens[fim] = 0;
		}

	public char front() {
		return itens[ 0 ];
		}

	public boolean empty() {
		return ( fim == 0 );
		}

	public boolean full() {
		return (fim== tam_max );
		}
	
	public int size() {
		return fim;
		}
}