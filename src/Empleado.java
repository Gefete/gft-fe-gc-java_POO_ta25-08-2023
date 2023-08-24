
public class Empleado {
	private String nombre;
    private double sueldo;

    // Constructor
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // Método para imprimir los datos del empleado
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
    }

    // Método para verificar si debe pagar impuestos
    public void verificarImpuestos() {
        if (sueldo > 3000) {
            System.out.println("Debe pagar impuestos.");
        } else {
            System.out.println("No debe pagar impuestos.");
        }
    }
}
