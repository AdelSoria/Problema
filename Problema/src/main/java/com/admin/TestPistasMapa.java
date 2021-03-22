package com.admin;

import java.time.LocalDateTime;

import com.dto.Pista;

public class TestPistasMapa {

	public static void main(String[] args) {
	
		
		AdminPistasMapa adminPistasMapa = new AdminPistasMapa();
		
		Pista rieles = new Pista();
		rieles.setNombre("1");
		
		rieles.setDuracion(60);
		
		
		Pista rieles1 = new Pista();
		rieles1.setNombre("2");
	
		rieles1.setDuracion(30);
		
		Pista rieles2 = new Pista();
		rieles2.setNombre("3");

		rieles2.setDuracion(70);
		

		Pista rieles3 = new Pista();
		rieles3.setNombre("4");
		
		rieles3.setDuracion(90);
		
		Pista rieles4 = new Pista();
		rieles4.setNombre("5");
		
		rieles4.setDuracion(50);
		
		Pista rieles5 = new Pista();
		rieles5.setNombre("6");
	
		rieles5.setDuracion(15);
		
		adminPistasMapa.agregar(rieles);
		adminPistasMapa.agregar(rieles1);
		adminPistasMapa.agregar(rieles2);
		adminPistasMapa.agregar(rieles3);
		adminPistasMapa.agregar(rieles4);
		adminPistasMapa.agregar(rieles5);
		
		adminPistasMapa.ordenar(LocalDateTime.of(2020, 8, 31, 9, 0), LocalDateTime.of(2020, 8, 31, 12, 0)
								,LocalDateTime.of(2020, 8, 31, 13, 0), LocalDateTime.of(2020, 8, 31, 17, 0));
		
		
	}

}
