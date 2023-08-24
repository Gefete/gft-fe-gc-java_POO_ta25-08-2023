
public class Persona1 {
	private String nombre;

	//Constructor predeterminado
    public Persona1() {
	}

    //Trae el nombre desde donde llaman al metodo
	public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}
