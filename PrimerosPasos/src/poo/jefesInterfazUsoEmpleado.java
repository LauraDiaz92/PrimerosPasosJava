package poo;

public interface jefesInterfazUsoEmpleado extends bonusInterfazUsoEmpleado {
	
	// Las clases que implementen esta interfaz van a tener un método: tomarDecisiones(). De esta forma
	//obligamos a otros programadores a implementar este método cuando creen una clase de tipo Jefatura
	//Los métodos de una interfaz tienen que ser siempre públicos y abstractos. SE PUEDEN OBVIAR
	
	String tomarDecisiones(String decision);
	
}
