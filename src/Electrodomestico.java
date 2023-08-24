
public class Electrodomestico {
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	private static final String[] COLORES = {"blanco", "negro", "rojo", "azul", "gris"};
	
	private final double def_precioBase=100;
	private final String def_color=COLORES[0];
	private final char def_consumoEnergetico='F';
	private final double def_peso=5;
	
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase=def_precioBase;
		this.color=def_color;
		this.consumoEnergetico=def_consumoEnergetico;
		this.peso=def_peso;
	}

	//Constructor con solo 2 atributos y el resto predeterminados
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color=def_color;
		this.consumoEnergetico=def_consumoEnergetico;
		this.peso = peso;
	}

	//Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = colorCheker(color);
		this.consumoEnergetico = energeticChecker(consumoEnergetico);
		this.peso = peso;
	}
	
	
	//Getters para mostrar como funcionan los constructores y los metodos
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	// Para comprobar que el color es correcto si no  pone por defecto
    private String colorCheker(String color) {
        color = color.toLowerCase();
        for (int i = 0; i < COLORES.length; i++) {
			if (color.equals(COLORES[i])) {
                return color;
            }
		}
        return def_color;
    }

    // Para comprobar que el valor energetico es correcto si no  pone por defecto
    private char energeticChecker(char consumo) {
        if (consumo >= 65 && consumo <= 70) {
            return consumo;
        } else {
            return def_consumoEnergetico;
        }
    }
	
	
	
}
