package EntregaEjercicioCuatro;

public class SmartWatch extends SmartDevice{
	
	boolean sumergible;
	boolean gps;
	boolean coneccionBluetoo;
	String tipoAlarma;
	String controlMusica;

	
	public  SmartWatch() { super();}
	
	public  SmartWatch(boolean sumergible,boolean gps,boolean coneccionBluetoo,String tipoAlarma,String controlMusica) 
	{   this.sumergible= sumergible;
		this.gps=sumergible;
		this.coneccionBluetoo= coneccionBluetoo;
		this.tipoAlarma=tipoAlarma;
	    this.controlMusica=controlMusica;
	}
	
	public  SmartWatch(String empresa,String modelo,int numSerie,double precio,
			           boolean sumergible,boolean gps,boolean coneccionBluetoo,
			           String tipoAlarma,String controlMusica) {
		                super(empresa,modelo,numSerie,precio);
	{   this.sumergible= sumergible;
		this.gps=sumergible;
		this.coneccionBluetoo= coneccionBluetoo;
		this.tipoAlarma=tipoAlarma;
	    this.controlMusica=controlMusica;
	}
	}
	
	 @Override
	    public String toString() {
	    	return "Empresa: " + empresa + " Modelo: " + modelo + "/ Numero de serie: "+ numSerie +
	    			"/ precio: " + precio;
	}
}
	

