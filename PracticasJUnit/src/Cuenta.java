
public class Cuenta {

	private String titular;
	private double cantidad;
	
	Cuenta(){
		this.cantidad=0;
		this.titular=null;
	}
	
	Cuenta(String tit, double can){
		this.titular=tit;
		this.cantidad=can;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public void ingresar(double cantidad) {
		if(cantidad>0) {
			this.cantidad+=cantidad;
		}
	}
	public void retirar(double cantidad) {
		this.cantidad-=cantidad;
		
		if(this.cantidad<0) {
			this.cantidad=0;
		}
	}
}
