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
		return "Nombre: " + nombre + " - Año Vigencia: " + añoVigencia + " - Código de póliza: " + codigoPoliza + " - Valor: " + valorPoliza;
	}
	
}
