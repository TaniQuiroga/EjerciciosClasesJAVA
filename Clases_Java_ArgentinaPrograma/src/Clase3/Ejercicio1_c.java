package Clase3;

public class Ejercicio1_c {

	public static void main(String[] args) {
		
		int vector[]= {27, 28, 29, 1, 5, 7, 13};
		int numero = 10;
		int suma = 0;
		
		for(int i=0; i< vector.length; i++){
			if (vector[i] > numero){
				suma= suma + vector[i];
			}
		}System.out.println("La suma de los numeros mayores a 10 es " +suma);

	}

}
