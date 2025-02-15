
public class Main {

	public static void main(String[] args) {
		
		//Lampada() é o método construtor;
		Lampada minhaLampada = new Lampada(20);
		Lampada minhaLampada2 = new Lampada(10);
		Lampada minhaLampada3 = new Lampada(60);
				
		//minhaLampada.desligar();
		
		//minhaLampada.ligar();
		
		System.out.println("Minha lâmpada de " +
		minhaLampada.getPotencia() + " está ligada? " + 
				"\n"+minhaLampada.isLigado()+"\n");
		
		}

}
