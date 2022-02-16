public class Fatorial {
	int i;
	static int fat= 1;
	String result;
    
	public Fatorial(int num) {
		this.i = num;
	}

	public String fatorial() {

		try {
			
			int j=0;
			
			if (i < 0) {
				throw new Exception(" O numero deve ser um inteiro positivo maior que zero");
			}

			if ((i == 0) || (i == 1)) {
				return String.valueOf(fat);
			}

			while (i > 1) {
				
				//calcular fatorial
				fat *= i;
				i--;
				
			}
			return String.valueOf( fat);
			
		} catch (Exception e) {
			return e.getMessage();
		}

	}
}
