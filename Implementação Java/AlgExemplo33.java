import java.util.Scanner;
public class AlgExemplo33{
	public static void main (String[] args){

		Scanner ler=new Scanner(System.in);

		double num1, num2, num3, num4, num5, valSoma, valMedia, valDobro;

		System.out.println("Entre com 5 n�meros");
		num1=ler.nextDouble();
		num2=ler.nextDouble();
		num3=ler.nextDouble();
		num4=ler.nextDouble();
		num5=ler.nextDouble();

		valSoma=(num1+num2+num3+num4+num5);
		 System.out.println("O valor da soma dos n�meros digitados � "+valSoma);

		valMedia=(num1+num2+num3+num4+num5)/5;
		  System.out.println("O valor da m�dia dos n�meros digitados � "+valMedia);

		valDobro=(num1+num2+num3+num4+num5)*2;
		  System.out.println("O valor do dobro dos n�meros digitados � "+valDobro);

    }
}