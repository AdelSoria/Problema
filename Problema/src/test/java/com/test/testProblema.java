package com.test;

import java.time.LocalDateTime;
import java.util.Map;

import org.junit.Test;

import com.admin.AdminPistasMapa;
import com.dto.Pista;

import junit.framework.TestCase;

/**
 * @author msoria
 *
 */
public class testProblema extends TestCase {

	/**
	 * Test de verificacion de reservas ok
	 */
	@Test
	public void testOrdenarOk() {
		iniciar();

		Map<String, Pista> pistas = iniciar();
		System.out.println(pistas.toString());
		pistas.forEach((k, v) -> {
			assertEquals("message", "Registrado", v.getEstado());
		});

	}

	/**
	 * Test de verificacion de reservas con error
	 */
	@Test
	public void testOrdenarFail() {
		iniciar();

		Map<String, Pista> pistas = iniciarFail();
		System.out.println(pistas.toString());

		pistas.forEach((k, v) -> {
			assertEquals("message", "Registrado", v.getEstado());
		});
	}

	/**
	 * Carga de parametros para iniciar el metodo Ordenar
	 * @return
	 */
	public Map<String, Pista> iniciar() {
		AdminPistasMapa adminPistasMapa = new AdminPistasMapa();

		Pista rieles = new Pista();
		rieles.setNombre("1");
		rieles.setEstado("Pendiente");
		rieles.setDuracion(60);

		Pista rieles1 = new Pista();
		rieles1.setNombre("2");
		rieles1.setEstado("Pendiente");
		rieles1.setDuracion(30);

		Pista rieles2 = new Pista();
		rieles2.setNombre("3");
		rieles2.setEstado("Pendiente");
		rieles2.setDuracion(70);

		Pista rieles3 = new Pista();
		rieles3.setNombre("4");
		rieles3.setEstado("Pendiente");
		rieles3.setDuracion(90);

		Pista rieles4 = new Pista();
		rieles4.setNombre("5");
		rieles4.setEstado("Pendiente");
		rieles4.setDuracion(50);

		Pista rieles5 = new Pista();
		rieles5.setNombre("6");
		rieles5.setEstado("Pendiente");
		rieles5.setDuracion(15);

		adminPistasMapa.agregar(rieles);
		adminPistasMapa.agregar(rieles1);
		adminPistasMapa.agregar(rieles2);
		adminPistasMapa.agregar(rieles3);
		adminPistasMapa.agregar(rieles4);
		adminPistasMapa.agregar(rieles5);

		return adminPistasMapa.ordenar(LocalDateTime.of(2020, 8, 31, 9, 0), LocalDateTime.of(2020, 8, 31, 12, 0),
				LocalDateTime.of(2020, 8, 31, 13, 0), LocalDateTime.of(2020, 8, 31, 17, 0));

	}

	/**
	 * Carga de parametros para iniciar el metodo Ordenar
	 * @return
	 */
	public Map<String, Pista> iniciarFail() {
		AdminPistasMapa adminPistasMapa = new AdminPistasMapa();

		Pista rieles = new Pista();
		rieles.setNombre("1");
		rieles.setEstado("Pendiente");
		rieles.setDuracion(180);

		Pista rieles1 = new Pista();
		rieles1.setNombre("2");
		rieles1.setEstado("Pendiente");
		rieles1.setDuracion(60);

		Pista rieles2 = new Pista();
		rieles2.setNombre("3");
		rieles2.setEstado("Pendiente");
		rieles2.setDuracion(100);

		Pista rieles3 = new Pista();
		rieles3.setNombre("4");
		rieles3.setEstado("Pendiente");
		rieles3.setDuracion(200);

		Pista rieles4 = new Pista();
		rieles4.setNombre("5");
		rieles4.setEstado("Pendiente");
		rieles4.setDuracion(50);

		Pista rieles5 = new Pista();
		rieles5.setNombre("6");
		rieles5.setEstado("Pendiente");
		rieles5.setDuracion(15);

		adminPistasMapa.agregar(rieles);
		adminPistasMapa.agregar(rieles1);
		adminPistasMapa.agregar(rieles2);
		adminPistasMapa.agregar(rieles3);
		adminPistasMapa.agregar(rieles4);
		adminPistasMapa.agregar(rieles5);

		return adminPistasMapa.ordenar(LocalDateTime.of(2020, 8, 31, 9, 0), LocalDateTime.of(2020, 8, 31, 12, 0),
				LocalDateTime.of(2020, 8, 31, 13, 0), LocalDateTime.of(2020, 8, 31, 17, 0));

	}

	protected void setUp() throws Exception {
		super.setUp();

	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
