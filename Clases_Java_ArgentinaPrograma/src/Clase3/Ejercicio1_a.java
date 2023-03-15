package Clase3;

public class Ejercicio1_a {
	
	public static void main(String[] args) {
		
		String texto= "homosapiens, onomatopeya";
		char letra= 'o';
		int contador = 0;
		
		for(int i=0; i<texto.length(); i++) {
			if (texto.charAt(i) == letra) {
				contador++;
			}
			
		} System.out.println(contador);
	}

}
