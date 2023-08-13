package com.javacourse.oop;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creando las intancia de clase
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		
		//Llamando a los metodos de la clase o behaivor de los objetos
		/*ducati.start();
		honda.start();*/
		
		//Probando los atributos de clase llamados por cada instancia
		//Cambiando el state de los objetos
		ducati.setSpeed(150);
		System.out.println(ducati.getSpeed());
		honda.setSpeed(200);
		System.out.println(honda.getSpeed());
		//Se pueden cambiar las veces que sean necesarias
		ducati.setSpeed(50);
		honda.setSpeed(20);
		
		//En el segundo nivel de encapsulacion tenemos
		/*Obtener la velocidad de ducati e incrementarla en 100*/
		System.out.println("\nValor Inicial: "+ducati.getSpeed());
		int ducatiSpeed = ducati.getSpeed(); //obtenemos el valor de speed en ducati
		ducatiSpeed += 100; //Incrementamos la velocidad en 100
		ducati.setSpeed(ducatiSpeed); //Asignamos el nuevo valor aumentado en 100
		System.out.println("\nValor aumentado en 100: "+ducati.getSpeed());
		
		System.out.println("\nValor Inicial: "+honda.getSpeed());
		int hondaSpeed = honda.getSpeed(); //obtenemos el valor de speed en ducati
		hondaSpeed += 100; //Incrementamos la velocidad en 100
		honda.setSpeed(hondaSpeed); //Asignamos el nuevo valor aumentado en 100
		System.out.println("\nValor aumentado en 100: "+honda.getSpeed());
		
		//Como se observa en una gran cantidad de codigo y es muy similar para cada uno
		/* Por este motivo se lo puede encapsular dentro de la clase
		 * */
		ducati.increaseSpeed(200);
		System.out.println("\nValor aumentado en 200: "+ducati.getSpeed());
		ducati.decreaseSpeed(150);
		System.out.println("\nValor reducido: "+ducati.getSpeed());
	}

}
