import java.util.Scanner;
 public class AlgExemplo34{
 	public static void main (String[] args){

 		Scanner ler=new Scanner (System.in);

 		int num, somP=0, somN=0, i=0;

 		while (i<10){
 			System.out.println("Entre com um n�mero");
 			num=ler.nextInt();

 			if (num>=0){
 			System.out.println("Positivo");
 			somP=somP+num;
 		}
 		else {
 			System.out.println("Negativo");
 			somN=somN+num;
 		}

 		i++;
 		}
 		System.out.println("A soma dos n�meros positivos � "+somP);
 		System.out.println("A soma dos n�meros negativos � "+somN);

 		}
 	}





