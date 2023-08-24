
public class Operaciones {
	private int valor1;
    private int valor2;

    // Constructor
    public Operaciones(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    // Suma
    public int calcularSuma() {
        return valor1 + valor2;
    }

    // Resta
    public int calcularResta() {
        return valor1 - valor2;
    }

    // Multiplicación
    public int calcularMultiplicacion() {
        return valor1 * valor2;
    }

    // División
    public double calcularDivision() {
        return (double) valor1 / valor2;
    }
}
