package poo;

public interface jefesInterfazUsoEmpleado extends bonusInterfazUsoEmpleado {
	
	// Las clases que implementen esta interfaz van a tener un m�todo: tomarDecisiones(). De esta forma
	//obligamos a otros programadores a implementar este m�todo cuando creen una clase de tipo Jefatura
	//Los m�todos de una interfaz tienen que ser siempre p�blicos y abstractos. SE PUEDEN OBVIAR
	
	String tomarDecisiones(String decision);
	
}
