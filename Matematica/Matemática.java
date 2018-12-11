
public class Matemática {

	public static double calculoOperacoes(double a, double b, char c) {
		double s = 0;
		
		switch (c) {
			case '+':
				s = a + b;
			break;

			case '-':
				s = a - b;
			break;
		
			case '*':
				s = a * b;
			break;
			
			case '/':
				try {
					s = a / b;
				} catch (ArithmeticException e) {
					System.out.println(e.getMessage());
				}
			break;
				
			default:
				throw new IllegalArgumentException("Operação inválida");
		}
		
		return s;
	}
	
	public static long fatorial(int num) {
		long fat = 1;
		
		if(num < 0) throw new IllegalArgumentException("Não permitido numero negativo");
		else for(int i = 1; i <= num; fat *= i++);
		
		return fat;
	}
}
