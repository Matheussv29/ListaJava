import java.util.Scanner;
 public class AlgExemplo35{
 	public static void main (String[] args){

 		Scanner ler=new Scanner (System.in);

 		int num, som40=0, i=0;

 		while (i<10){
 			System.out.println("Entre com um n�mero");
 			num=ler.nextInt();

 			if (num<40){
 				som40=som40+num;
 		}
 		else {
 			System.out.println("MAIOR");
 		}

 		i++;
 		}
 		System.out.println("A soma dos n�meros inferiores a 40 � "+som40);

	}
 	}