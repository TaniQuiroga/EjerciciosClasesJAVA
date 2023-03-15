package Clase3;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String frase = "hola que tal";
		int desplazamiento = 2;
		
		String codificado = codificar(frase, desplazamiento);
		System.out.println("String codificado: " + codificado);
		
		String decodificado = decodificar(codificado, desplazamiento);
		System.out.println("String decodificado: "+ decodificado);
		
	}
	
	private static String codificar(String frase, int desplazamiento) {
		String abecedario = " abcdefghijklmnñopqrstuvwxyz";
		String textoCodificado = "";
		
		for (int i=0; i<frase.length(); i++) {
			char letraABuscar = frase.charAt(i);
			for (int t=0; t<abecedario.length(); t++) {
				if (abecedario.charAt(t) == letraABuscar) {
					textoCodificado += abecedario.charAt((t + desplazamiento) % abecedario.length());
				}
			}
		} return textoCodificado;
	}
	
	private static String decodificar(String frase, int desplazamiento) {
		return codificar(frase, 28 - desplazamiento);
	}

}