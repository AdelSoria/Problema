package com.dto;

/**
 * @author msoria
 *
 */
public class Pista {
	
	private String nombre;
	private long duracion;
	private String estado;
	public String getNombre() {
		return nombre;
	}
	public long getDuracion() {
		return duracion;
	}
	public String getEstado() {
		return estado;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDuracion(long duracion) {
		this.duracion = duracion;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Pista [nombre=" + nombre + ", duracion=" + duracion + ", estado=" + estado + "]"+ "\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pista other = (Pista) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	

	

}
