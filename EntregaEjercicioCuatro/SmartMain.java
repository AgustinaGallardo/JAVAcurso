package EntregaEjercicioCuatro;

public class SmartMain {
	
	public static void Main (String[] args) {
	
	SmartPhone phone = new SmartPhone("Apple","Modelo5",555);
	
		
	SmartWatch reloj = new SmartWatch();
	reloj.coneccionBluetoo=true;
	reloj.controlMusica="AAD";
	reloj.empresa="Apple";
	reloj.modelo="AAANM43";
	reloj.gps=true;
	reloj.precio=2323d;
	reloj.sumergible=true;
	reloj.tipoAlarma="astric";
	reloj.numSerie=12312;
	
	System.out.println("El reloj es: " + reloj + "/  Y el celular es: " + phone);	
	
	}
}
