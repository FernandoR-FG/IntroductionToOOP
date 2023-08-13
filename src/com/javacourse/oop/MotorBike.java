package com.javacourse.oop;

public class MotorBike {
	//El principal problema de esta clase es que la otra tiene acceso directo a los state
	//Para evitar el acceso directo a estas variables se utiliza la encapsulacion 
	//La unica que puede acceder a sus variables es la propia clase las demas deberan acceder
	//solo a travez de los metodos propios de la clase
	
	//state
	// short speed; declarar la variable asi esta mal por el acceso debe ser:
	private int speed; //Para mostrar el valor de esta variable a las otras clases se crean metodos
	//La de arriba es una variable miembro
		
	//behaivor
	//Un tipo de metodos especiales son los constructores
	/*Sirven para inicializar o construir un objeto
	 * Tiene el mismo nombre que la clase 
	 * No tiene un tipo
	 * */
	MotorBike(){
		//Es necesario tener un constructor vacio para un objeto limpio
		this(5); //Hace una llamada al contructor con datos y asigna el valor
	}
	MotorBike(int speed){
		this.speed = speed; //Este constructor toma un valor y los asigna 
	}
	
	
	//Method
	/*
	 * Input - speed
	 * output - void
	 * name - setSpeed
	 * */
	
	//Los metodos getter an setter se pueden generar automaticamente utilizando eclipse
	
	//METODOS GENERADOS POR ECLIPSE
	
	public int getSpeed() {
		return speed;
	}
	
	/* La ventaja de la encapsulacion es que podemos prevenir codigo errado de otras clases
	 * evitando colocar data erronea dentro de los objetos 
	 * por ejemplo no se puede velocidad negativa entonces
	 * */
	public void setSpeed(int speed) {
		if(speed > 0) //Podemos tener varias verificaciones para evitar el error en data
			this.speed = speed;
	}
	
	//Metodos encapsulados ----  Nivel 2  de encapsulamiento
	public void increaseSpeed(int howMuch) {
		this.speed += howMuch;
	}
	public void decreaseSpeed(int howMuch) {
		/* para evitar validaciones repetidas podemos llamar desde aqui 
		 * directamente al metodo setSpeed y verificar que es positivo
		if(this.speed - howMuch > 0)
			this.speed -= howMuch;
		*/
		setSpeed(this.speed-howMuch);
	}
	
	//METODOS REALIZADO A MANO
	/*
	
	//Setter
	void setSpeed(int speed) { //Local variable
		this.speed = speed; //La variable de clase toma el valor del agumento enviado
		//System.out.println(speed); Hace referencia al valor enviado por el metodo
		//System.out.println(this.speed); this.speed hace referenciaa la variable de clase
	}
	
	//Getter
	int getSpeed() {
		return this.speed;
	}
	
	*/
	void start() {
		System.out.println("Bike start");
	}


}
