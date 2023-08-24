import java.util.*;

public class Password {
	
	private int longitud=8;
	private String contrasenya;
	
	public Password(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasenya=this.generatePassword(this.longitud);
	}
	
	public String getContrasenya() {
		return contrasenya;
	}


	private String generatePassword(int longitud) {
		String password="";
		
		Random random = new Random();
		
		if(longitud>=2) {
	        // Generar un número aleatorio en el rango de 65 a 90
			for (int i = 0; i < longitud/2; i++) {
				int randomLetterNumber=random.nextInt(26)+65;
				char randomLetter=  (char)randomLetterNumber;
				password += randomLetter;
				password += (char)random.nextInt(10)+48;
			}
		}else {
			password="Qu3C14s3D3c0NTr4s3NY4t13NeMEn0Sd32CaR4ct3r3S";
		}
		return password;
	}
	
}
