package carros;

public class Motor {
	
	Carro carro;
	boolean motorLigado = false;
	double fatorInjecao = 1;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		if(!motorLigado) {
			return 0;
		}
		return (int) Math.round(fatorInjecao * 3000);
	}
	
	
}
