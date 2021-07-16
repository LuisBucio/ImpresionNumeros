import java.util.Scanner;

public class ImpresionNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu numero");
		int num1 = sc.nextInt();
		
		int sumpares = 0;
		int sumimpares = 0;
		
		for(int i = 0; i <= num1; i++) {

			if(i % 2 == 0) {
				int value1 = sumpares;
				sumpares = sumpares +i;
				
			}else {
				int value2 = sumimpares;
				sumimpares = sumimpares +i;

			}	

		}

		System.out.println("suma de pares " + sumpares);
		System.out.println("suma de impares  " + sumimpares);
		
	}

}
