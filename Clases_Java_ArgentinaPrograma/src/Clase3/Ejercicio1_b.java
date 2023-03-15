package Clase3;

public class Ejercicio1_b {

	public static void main(String[] args) {
		
		int vector[]= {29, 07, 13};
		int vectorOrdenado[] = new int [vector.length];
		
		if (vector[0]>vector[1] && vector[0]>vector[2]) {
			vectorOrdenado[0] = vector[0];
		}else if(vector[1]>vector[0] && vector[1]>vector[2]){
			vectorOrdenado[0] = vector[1];
		}else {
			vectorOrdenado[0] = vector[2];
		}System.out.println("El numero mayor es " + vectorOrdenado[0]);
		
		if (vector[0]<vector[1] && vector[0]<vector[2]) {
			vectorOrdenado[2] = vector[0];
		}else if(vector[1]<vector[0] && vector[1]<vector[2]){
			vectorOrdenado[2] = vector[1];
		}else {
			vectorOrdenado[2] = vector[2];
		}System.out.println("El numero menor es " + vectorOrdenado[2]);
		
		vectorOrdenado[1] = (vector[0]+ vector[1]+ vector [2])-(vectorOrdenado[0] + vectorOrdenado[2]);
		System.out.println("El numero del medio es " + vectorOrdenado[1]);
		System.out.println(vectorOrdenado);
	}
}