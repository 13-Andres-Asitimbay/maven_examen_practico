package examen.finall.programacion;

public class PolizaVip extends Poliza{
	
	private String beneficio;

	public String getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - A�o Vigencia: " + a�oVigencia + " - C�digo de p�liza: " + codigoPoliza + " - Valor: " + valorPoliza;
	}
	
}
