import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numeros = new int [3][3];
		int maisvalor = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int l = 0 ; l < 3; l++)
		{
			for(int c = 0 ; c < 3 ; c++)
			{
				System.out.println("\nDigite um numero: ");
				numeros[l][c] = leia.nextInt();
				
				if(numeros[l][c] > 10)
				{
					maisvalor++;
				}
			}
		}
		
		System.out.println("\nOs numeor digitados maior que 10 são: "+ maisvalor);

	}

}
