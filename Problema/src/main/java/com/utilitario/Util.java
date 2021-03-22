package com.utilitario;

import java.time.format.DateTimeFormatter;

/**
 * @author msoria
 *
 */
public class Util {
	public static DateTimeFormatter formato() {

		return DateTimeFormatter.ofPattern("h':'mm a");
	}

}
