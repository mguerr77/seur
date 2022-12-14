package Modelo;

public class Envio {
	private String ciudadOrigen;
	private boolean origenNacional;
	private String ciudadDestino;
	private boolean destinoNacional;
	private String tipoEnvio;
	private int peso;
	
	
	public Envio() {
		// TODO Auto-generated constructor stub
	}


	public Envio(String ciudadOrigen, boolean origenNacional, String ciudadDestino, boolean destinoNacional,
			String tipoEnvio, int peso) {
		super();
		this.ciudadOrigen = ciudadOrigen;
		this.origenNacional = origenNacional;
		this.ciudadDestino = ciudadDestino;
		this.destinoNacional = destinoNacional;
		this.tipoEnvio = tipoEnvio;
		this.peso = peso;
	}


	public double calcularImporte()
	{
		double coste=0;
		if (this.destinoNacional && this.origenNacional)
		{
			coste=coste + 4; 
		}
		else
			coste=coste+7;
		
		if (this.tipoEnvio.equals("Paq 10 - Antes de las 10 h ") )
		{
			coste=coste + 5;
		}
		coste=coste + this.peso * 0.1;
		return coste; 
	}
	
	
	public String getCiudadOrigen() {
		return ciudadOrigen;
	}


	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}


	public boolean isOrigenNacional() {
		return origenNacional;
	}


	public void setOrigenNacional(boolean origenNacional) {
		this.origenNacional = origenNacional;
	}


	public String getCiudadDestino() {
		return ciudadDestino;
	}


	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}


	public boolean isDestinoNacional() {
		return destinoNacional;
	}


	public void setDestinoNacional(boolean destinoNacional) {
		this.destinoNacional = destinoNacional;
	}


	public String getTipoEnvio() {
		return tipoEnvio;
	}


	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Envio [ciudadOrigen=" + ciudadOrigen + ", origenNacional=" + origenNacional + ", ciudadDestino="
				+ ciudadDestino + ", destinoNacional=" + destinoNacional + ", tipoEnvio=" + tipoEnvio + ", peso=" + peso
				+ "]";
	}
	
	
	
	

}
