package examen.finall.programacion;

public class PolizaGeneral extends Poliza{
	
	private String codigoDescuento;
	private String numeroSeguro;
	
	public String getCodigoDescuento() {
		return codigoDescuento;
	}
	
	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}
	
	public String getNumeroSeguro() {
		return numeroSeguro;
	}
	
	public void setNumeroSeguro(String numeroSeguro) {
		this.numeroSeguro = numeroSeguro;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - A�o Vigencia: " + a�oVigencia + " - C�digo de p�liza: " + codigoPoliza + " - Valor: " + valorPoliza;
	}
	
}
