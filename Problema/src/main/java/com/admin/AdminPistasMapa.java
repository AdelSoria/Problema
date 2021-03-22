package com.admin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.dto.Pista;
import com.utilitario.Util;


/**
 * @author msoria
 *
 */
public class AdminPistasMapa {
	
	private Map<String, Pista> pistas;
	
	public AdminPistasMapa(){
		pistas = new HashMap<String, Pista>();
	}
	
	/**
	 * @param pista
	 */
	public void agregar(Pista pista){
		pistas.put(pista.getNombre(), pista);		
	}
	
	
	/**
	 * @param sesionAmInicio
	 * @param sesionAmFin
	 * @param sesionPMInicio
	 * @param sesionPMFin
	 * @return
	 */
	public Map<String, Pista> ordenar(LocalDateTime sesionAmInicio,LocalDateTime sesionAmFin, LocalDateTime sesionPMInicio, LocalDateTime sesionPMFin){
		
		long sesionAM = ChronoUnit.MINUTES.between(sesionAmInicio, sesionAmFin);
		long sesionPM = ChronoUnit.MINUTES.between(sesionPMInicio, sesionPMFin);
		DateTimeFormatter f = Util.formato();

		System.out.println("--------Inicio Tiempo: "+ sesionAmInicio.format(f) + " "+ sesionAM + " minutos");
		System.out.println("--------Inicio Tiempo: "+ sesionPMInicio.format(f) + " "+ sesionPM + " minutos");
		
		for (Entry<String, Pista> pista : this.pistas.entrySet()) {
			
			if(pista.getValue().getDuracion() <= sesionAM) {
				imprimir(sesionAmInicio, pista);
				sesionAmInicio = sesionAmInicio.plusMinutes(pista.getValue().getDuracion());
				sesionAM = sesionAM-pista.getValue().getDuracion();
				pista.getValue().setEstado("Registrado");
				continue;			
			}
			
			if(pista.getValue().getDuracion() <= sesionPM) {
				imprimir(sesionPMInicio, pista);
				sesionPMInicio = sesionPMInicio.plusMinutes(pista.getValue().getDuracion());
				sesionPM = sesionPM-pista.getValue().getDuracion();
				pista.getValue().setEstado("Registrado");
				continue;			
			}
	
		}
		
		System.out.println("Pendientes AM : "+ sesionAM + " minutos    Pendientes PM : "+ sesionPM +" minutos");
		return this.pistas;
	
	}
	
	/**
	 * @param sesion
	 * @param pista
	 */
	public void imprimir(LocalDateTime sesion, Entry<String, Pista> pista) {

		DateTimeFormatter f = Util.formato();
        System.out.println(sesion.format(f) +" "+ pista.getValue().getNombre() + " " +  pista.getValue().getDuracion() +" min");
		System.out.println("------------------------------------------------");
	}

	@Override
	public String toString() {
		return "AdminPistasMapa [pistas=" + pistas + "]" ;
	}
	
	

}
