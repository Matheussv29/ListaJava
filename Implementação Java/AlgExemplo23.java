import java.util.Scanner;
    public class AlgExemplo23{
   	public static void main(String[] args){

   		Scanner ler=new Scanner (System.in);

   		int A,B,C;

   		System.out.println("Entre com 3 n�meros");
   		A=ler.nextInt();
   		B=ler.nextInt();
   		C=ler.nextInt();

   		if ( A==B && A==C && B==C){
   		 System.out.println("Equil�tero");
   		}
   		else if (A==B){
   			System.out.println("Is�celes");
   		}
   			else if (B==C){
   			System.out.println("Is�celes");
   		}
   			else if (A==C){
   			System.out.println("Is�celes");
   		}
   			else {
   			System.out.println("Escaleno");
   			}
   	}
    }