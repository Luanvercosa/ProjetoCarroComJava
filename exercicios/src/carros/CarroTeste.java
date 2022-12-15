package carros;

public class CarroTeste {
	public static void main(String[] args) {
		
			Carro gol = new Carro();
			System.out.println(gol.estaligado());
			
			gol.ligar();
			System.out.println(gol.estaligado());
			gol.acelerar();
			System.out.println(gol.motor.giros());
		
		
	}
}
