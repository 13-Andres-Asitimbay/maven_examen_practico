package examen.finall.programacion;

public class Poliza implements Comparable<Poliza>{
	
	protected String nombre;
	protected String descripcion;
	protected String a�oVigencia;
	protected String codigoPoliza;
	protected int valorPoliza;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getA�oVigencia() {
		return a�oVigencia;
	}
	
	public void setA�oVigencia(String a�oVigencia) {
		this.a�oVigencia = a�oVigencia;
	}
	
	public String getCodigoPoliza() {
		return codigoPoliza;
	}
	
	public void setCodigoPoliza(String codigoPoliza) {
		this.codigoPoliza = codigoPoliza;
	}
	
	public int getValorPoliza() {
		return valorPoliza;
	}
	
	public void setValorPoliza(int valorPoliza) {
		this.valorPoliza = valorPoliza;
	}

	@Override
	public int compareTo(Poliza o) {
		// TODO Auto-generated method stub
		if (this.valorPoliza < o.getValorPoliza()) {
			return 1;

		} else if (this.valorPoliza == o.getValorPoliza()) {
			return 0;

		} else {
			return -1;

		}

	}
	
}
