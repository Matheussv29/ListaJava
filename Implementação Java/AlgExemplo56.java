import java.util.Scanner;
	public class AlgExemplo56
	{
		public static void main (String args[]){
         Scanner leitura = new Scanner(System.in);

         int num, somaPositivo=0, somaNegativo=0, qntPositivo=0, qntNegativo=0 , cont = 0 ;


     	do{

			System.out.println("Entre com um n�mero");
        	num = leitura.nextInt();

			if (num<0 && num != 0)
        	{
        		somaNegativo+=num;
       			qntNegativo++;
       			num++;
        	}
        	else if (num>0 && num != 0)
       		{
       			somaPositivo+=num;
       			qntPositivo++;

       		}
       		cont++;
        }while (cont<15);
          		System.out.println("A soma dos  n�meros positivos �: " + somaPositivo);
          		System.out.println("A quantidade dos  n�meros positivos �: " + qntPositivo);
          		System.out.println("A soma dos  n�meros negativos �: " + somaNegativo);
          		System.out.println("A quantidade dos  n�meros negativos �: " + qntNegativo);


	}
}