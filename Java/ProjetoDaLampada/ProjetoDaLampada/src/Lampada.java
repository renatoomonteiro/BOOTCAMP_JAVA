
public class Lampada {

		//PROPRIEDADES (VARIÁVEIS)
		private int potencia;
		private boolean ligado;

		//MÉTODOS CONSTRUTOR
		public Lampada(int potencia){
			this.potencia = potencia;
			this.desligar();
		}		
		
		
		//MÉTODOS GETTERS E SETTERS
		public int getPotencia() {
			return potencia;
		}

		public boolean isLigado() {
			return ligado;
		}

		//MÉTODOS
		void ligar(){
			ligado = true;
		}
		
		void desligar(){
			ligado = false;
		}
	
}
