import java.util.Locale;
import java.util.Scanner;

public class App {

    //Logica de programação Vetor
// Programa que leia N numeros inteiros e armazene em vetor.
	//Em seguida mostrar na tela os numeros negativos lidos.
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		double [] vet = new double[N];
		
		for (int i=0; i<N; i++) {
			vet[i]= sc.nextDouble();
		}
	   for (int i=0; i<N; i++) {
		   System.out.printf("%.2f%n",vet[i]);
	   
	   }						
			sc.close();
		

    }
}
