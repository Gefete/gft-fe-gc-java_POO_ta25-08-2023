import java.util.Scanner;

public class Testclass {

	public static void main(String[] args) {
		
		
		
		//Test Alumno
			System.out.println("\n\nTest Alumno\n");
		
			// se crea instancia
	        Alumno alumno1 = new Alumno("Gerard", 20);
	
	        // y se llaman a los metodos
	        alumno1.printData();
	        alumno1.verifyYearsOld();
	        
	        System.out.println("------------------------------------------");
	        
	        
        //Test Empleado
	        System.out.println("\n\nTest Empleado");
	        
	        // se crea instancia
	        Empleado empleado1 = new Empleado("Maria", 3100);
	        
	        Empleado empleado2 = new Empleado("Gerard", 2000);

	        // Imprimir datos y verificar impuestos
	        System.out.println();
	        empleado1.imprimirDatos();
	        empleado1.verificarImpuestos();
	        
	        System.out.println();
	        empleado2.imprimirDatos();
	        empleado2.verificarImpuestos();
	        System.out.println("------------------------------------------");
	        
	        
        //Test Operacion
	        // Se crea instancia
	        Operaciones operaciones = new Operaciones(10, 5);
	        System.out.println("Valor1: 10  y el valor2: 5");

	        // Se calculan y muestran los resultados
	        System.out.println("Suma: " + operaciones.calcularSuma());
	        System.out.println("Resta: " + operaciones.calcularResta());
	        System.out.println("Multiplicación: " + operaciones.calcularMultiplicacion());
	        System.out.println("División: " + operaciones.calcularDivision());
	        System.out.println("------------------------------------------");
	        
	        
	    //Test PruebaPersona
	        Scanner scanner = new Scanner(System.in);
	        
	        //Crea dos instancias como marca el usuario
	        Persona1 persona1 = new Persona1();
	        Persona1 persona2 = new Persona1();

	        //Recoge datos de persona 1
	        System.out.print("Ingresa el nombre de la primera persona: ");
	        String nombre1 = scanner.nextLine();
	        persona1.setNombre(nombre1);

	      //Recoge datos de persona 2
	        System.out.print("Ingresa el nombre de la segunda persona: ");
	        String nombre2 = scanner.nextLine();
	        persona2.setNombre(nombre2);
	        
	        scanner.close();
	        
	        System.out.println();

	        //Metodos para saludar
	        persona1.saludar();
	        persona2.saludar();

	        System.out.println("------------------------------------------");
	        
	        
	    //Test Libro
	        Libro libro = new Libro();

	        // Con los set envias los datos al objeto
	        libro.setAutor("Stephen King");
	        libro.setTitulo("IT");
	        libro.setUbicacion("Biblioteca Tarragona");

	        // Con los get se muestran los atributos del objeto
	        System.out.println("Autor: " + libro.getAutor()+
	        		"\nTítulo: " + libro.getTitulo()+
	        		"\nUbicación: " + libro.getUbicacion());
	        
	        System.out.println("------------------------------------------");
	        
	        
	    //Test Coche
	        Coche coche = new Coche("Toyota", "Corolla", 2000, 150.5);

	        // Se muestran los atributos del objeto
	        System.out.println("Marca: " + coche.getMarca());
	        System.out.println("Modelo: " + coche.getModelo());
	        System.out.println("Cilindrada: " + coche.getCilindrada());
	        System.out.println("Potencia: " + coche.getPotencia());
	        
	        System.out.println("------------------------------------------");
	        
	    //Test Persona
	      //Constructor 1
			Persona persona11 = new Persona("90238893M");
			
			//Constructor 2
			Persona persona22 = new Persona("92438593N", "Jorge", 14, 'H');
	        
	        //Constructor 3
			Persona persona3 = new Persona("10048810V", "Maria",14, 'M', 70.5, 1.7);

	        System.out.println("persona 1:"
			        + "\nDNI: "+ persona11.getDni()
			        + "\nNombre: " + persona11.getNombre()
			        + "\nEdad: " + persona11.getEdad()
			        + "\nSexo: " + persona11.getSexo()
			        + "\nPeso: " + persona11.getPeso()
			        + "\nAltura: " + persona11.getAltura());
	        		

	        System.out.println();

	        System.out.println("persona 2:"
	        		+ "\nDNI: "+ persona22.getDni()
			        + "\nNombre: " + persona22.getNombre()
			        + "\nEdad: " + persona22.getEdad()
			        + "\nSexo: " + persona22.getSexo()
			        + "\nPeso: " + persona22.getPeso()
			        + "\nAltura: " + persona22.getAltura());

	        System.out.println();

	        System.out.println("persona 3:"
	        		+ "\nDNI: "+ persona3.getDni()
			        + "\nNombre: " + persona3.getNombre()
			        + "\nEdad: " + persona3.getEdad()
			        + "\nSexo: " + persona3.getSexo()
			        + "\nPeso: " + persona3.getPeso()
			        + "\nAltura: " + persona3.getAltura());
	        
	        System.out.println("------------------------------------------");
	        
        //Test Password
			Password password = new Password(8);
			System.out.println("Contraseña generada\n");
			System.out.println(password.getContrasenya());
			System.out.println("------------------------------------------");
			
			
			
		//Test Electrodomestico
			//Constructor 1
			Electrodomestico electrodomestico1 = new Electrodomestico();
			
			//Constructor 2
	        Electrodomestico electrodomestico2 = new Electrodomestico(200, 10);
	        
	        //Constructor 3
	        Electrodomestico electrodomestico3 = new Electrodomestico(300, "rojo", 'A', 15);

	        System.out.println("Electrodomestico 1:"
			        + "\nPrecio Base: "+ electrodomestico1.getPrecioBase()
			        + "\nColor: " + electrodomestico1.getColor()
			        + "\nConsumo Energetico: " + electrodomestico1.getConsumoEnergetico()
			        + "\nPeso: " + electrodomestico1.getPeso());

	        System.out.println();

	        System.out.println("Electrodomestico 2:"
	    	        + "\nPrecio Base: "+ electrodomestico2.getPrecioBase()
	    	        + "\nColor: " + electrodomestico2.getColor()
	    	        + "\nConsumo Energetico: " + electrodomestico2.getConsumoEnergetico()
	    	        + "\nPeso: " + electrodomestico2.getPeso());

	        System.out.println();

	        System.out.println("Electrodomestico 3:"
	    	        + "\nPrecio Base: "+ electrodomestico3.getPrecioBase()
	    	        + "\nColor: " + electrodomestico3.getColor()
	    	        + "\nConsumo Energetico: " + electrodomestico3.getConsumoEnergetico()
	    	        + "\nPeso: " + electrodomestico3.getPeso());
	        System.out.println("------------------------------------------");
        
    	//Test Serie
	        Serie serie1 = new Serie();
	        Serie serie2 = new Serie("Overlord", "Kugane Maruyama");
	        Serie serie3 = new Serie("RWBY", 8, "Fantasy", "Monty Oum");

	        System.out.println("Serie 1:"
		        +"\nTitulo: " + serie1.getTitulo()
		        +"\nTemporadas: " + serie1.getNumTemporadas()
		        +"\nEntregado: " + serie1.isEntregado()
		        +"\nGenero: " + serie1.getGenero()
		        +"\nCreador: " + serie1.getCreador());

	        System.out.println();

	        System.out.println("Serie 2:"
		        +"\nTitulo: " + serie2.getTitulo()
		        +"\nTemporadas: " + serie2.getNumTemporadas()
		        +"\nEntregado: " + serie2.isEntregado()
		        +"\nGenero: " + serie2.getGenero()
		        +"\nCreador: " + serie2.getCreador());

	        System.out.println();

	        System.out.println("Serie 3:"
		        +"\nTitulo: " + serie3.getTitulo()
		        +"\nTemporadas: " + serie3.getNumTemporadas()
		        +"\nEntregado: " + serie3.isEntregado()
		        +"\nGenero: " + serie3.getGenero()
		        +"\nCreador: " + serie3.getCreador());
	}

}
