package clases_importantes;

import java.util.*;

public class gregorian_calendar {

	public static void main(String[] args) {

		// esta clase construye una fecha con el día, el mes y el año.Pertenece a la
		// clase java.util
		// Es de tipo Date. Para los meses empieza a contar desde 0. Por ejemplo,
		// Enero 0 ; Febrero 1 .....

		int year;
		int month;
		int day;

		year = 1992;
		month = 10;
		day = 04;
		
		Date nacimiento;

		GregorianCalendar calendario = new GregorianCalendar(year, month - 1, day);

		//el método getTime() devuelve un valor de tipo date.
		nacimiento = calendario.getTime();

		System.out.println(nacimiento);

	}

}
