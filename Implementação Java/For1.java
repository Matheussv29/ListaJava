import java.util.Scanner;
public class For1{
	public static void main (String[] args){

		Scanner ler=new Scanner(System.in);

		int val=0, qntI=0, qntP=0, somaP=0, somaI=0, i;

		for (i=0;i<10;i++){
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
	    System.out.println("A quantidade de valores impar � "+qntI);
	    System.out.println("A quantidade de valores par � "+qntP);
	    System.out.println("A soma de valores impar � "+somaI);
	    System.out.println("A soma de valores par � "+somaP);
	}
}