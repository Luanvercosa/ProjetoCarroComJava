package carros;

public class Carro {
	
	Motor motor ;
	Carro(){
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		if(motor.fatorInjecao < 2.5) {
			motor.fatorInjecao += 0.4;
		
		}
		
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
		
	}
	
	
	
	void ligar() {
		system.out.println("HIC HIC HIC \n VRUMM!!")
		motor.motorLigado = true;
	}
	
	void desligar() {
		motor.motorLigado = false;
	}
	
	boolean estaligado() {
		return motor.motorLigado;
	}
}
