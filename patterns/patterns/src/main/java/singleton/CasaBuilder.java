package singleton;

public class CasaBuilder{
	
	private String paredes;
	private String puertas;
	private String ventanas;
	public String getParedes() {
		return paredes;
	}
	public void setParedes(String paredes) {
		this.paredes = paredes;
	}
	public String getPuertas() {
		return puertas;
	}
	public void setPuertas(String puertas) {
		this.puertas = puertas;
	}
	public String getVentanas() {
		return ventanas;
	}
	public void setVentanas(String ventanas) {
		this.ventanas = ventanas;
	}
	
	private CasaBuilder(CasaBuilder builder) {
		this.paredes = builder.paredes;
		this.puertas = builder.puertas;
		this.ventanas = builder.ventanas;
	}
	public CasaBuilder(String string, String string2, String string3) {
		this.paredes=string;
		this.puertas=string2;
		this.ventanas=string3;
	}
	public CasaBuilder build() {
		return new CasaBuilder(this);
	}
	
}


