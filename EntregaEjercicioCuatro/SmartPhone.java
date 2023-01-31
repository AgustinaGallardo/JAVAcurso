package EntregaEjercicioCuatro;

public class SmartPhone extends SmartDevice{

	String sistemaOperativo;
	String ModeloCamara;
	int pixelesCamara;
	
	
	public SmartPhone() { super();}
	
	public SmartPhone(String empresa,String modelo,int numSerie,double precio,
			          String sistemaOperativo,String ModeloCamara,int pixelesCamara) {
	                  super(empresa,modelo,numSerie,precio);		
		this.sistemaOperativo=sistemaOperativo;
		this.ModeloCamara=ModeloCamara;
		this.pixelesCamara=pixelesCamara;
	}
	
    public SmartPhone(String sistemaOperativo,String ModeloCamara,int pixelesCamara) {
		
		this.sistemaOperativo=sistemaOperativo;
		this.ModeloCamara=ModeloCamara;
		this.pixelesCamara=pixelesCamara;
	}
	
    @Override
    public String toString() {
    	return "sistema operativo : " + sistemaOperativo + ", Modelo de la camara: "
    	+ ModeloCamara + " cuenta con " + pixelesCamara + "pixeles";
    }
    
	
}
