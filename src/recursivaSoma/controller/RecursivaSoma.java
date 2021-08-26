package recursivaSoma.controller;

public class RecursivaSoma {
		
	public RecursivaSoma() {
			super();
	}

	public int recursiva(int num, int aux) {
		if (aux == 0) { 
			return 1;
		} else {
			num=aux;
			aux = num-1;
			return num + recursiva(num, aux);
		}
	}
}
