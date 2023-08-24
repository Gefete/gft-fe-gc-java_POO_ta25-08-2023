
public class Persona {
	final char def_Sexo='H';
	private String nombre="";
	private int edad=0;
	private String dni;
	private char sexo=def_Sexo;
	private double peso=0;
	private double altura=0;
	
	//Constructor 1
	public Persona(String dni) {
		this.dni=dni;
	}

	//Constructor 2
	public Persona(String dni, String nombre, int edad, char sexo) {
		this.dni=dni;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = checkSex(sexo);
	}

	//Constructor 3
	public Persona(  String dni, String nombre, int edad, char sexo, double peso, double altura) {
		this.dni=dni;
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = checkSex(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	//Se ha modificado este geter para que devuelva el texto completo
	public String getSexo() {
		if(this.sexo=='H') {
			return "Hombre";	
		}else {
			return "Mujer";
		}
		
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Metodo para comprobar si se ha introducido el caracter 
	//valido si no pone la constante predeterminada
	public char checkSex(char sex) {
		if(sex=='H' || sex=='M') {
			return sex;
		}else {
			return def_Sexo;
		}
	}
	
}
