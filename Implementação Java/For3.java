import java.util.Scanner;
public class For3{
	public static void main (String[] args){

		Scanner ler=new Scanner(System.in);

		int val=0, qntI=0, qntP=0, somaP=0, somaI=0, i;

		double  mediaP=0, mediaI=0;

		for (i=0;i<5;i++){
			System.out.println("Entre com um n�mero");
			System.out.println("N�o aceitar 0");
			val=ler.nextInt();

			if (val%2==0 && val!=0){
		    qntP=qntP+1;
			somaP=somaP+val;
			}

			else {
			somaI=somaI+val;
			qntI=qntI+1;
			}
	    }

	    mediaP=somaP/qntP;
	    mediaI=somaI/qntI;
	    System.out.println("A m�dia de valores par � "+mediaP);
	    System.out.println("A m�dia de valores impar � "+mediaI);
	}
}