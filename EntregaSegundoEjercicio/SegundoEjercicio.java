package EntregaSegundoEjercicio;

import java.util.Scanner;

public class SegundoEjercicio {

		
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un numero: ");

	        int numero = scanner.nextInt();

	        double iva = numero * 0.20;

	        double numSumaIva = numero + iva;

	        System.out.println("El resultado con IVA es: " + numSumaIva);
	    }	
		
		
		
	
	

}
