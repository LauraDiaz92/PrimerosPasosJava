package poo;

public class MiTaller {
	
	private String color;
	private String modelo;
	private String propietario;
	private String matricula;
	private int ruedas;
	
	public MiTaller(String color, String modelo, String mat, String prop) {
		propietario = prop;
		ruedas = 4;
		this.color = color;
		this.modelo = modelo;
		matricula = mat;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public int getRuedas() {
		return ruedas;
	}

	public String toString() {
		return "MiCoche [color=" + color + ", modelo=" + modelo + ", propietario=" + propietario + ", matricula="
				+ matricula + "]";
	}
	

	
	

}

	
