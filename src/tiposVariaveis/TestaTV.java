package tiposVariaveis;

public class TestaTV {

	public static void main(String[] args) {
		
		SmartTv tv1 = new SmartTv();
		
		
		System.out.println("TV está ligada? " + tv1.ligada);
		System.out.println("Canal Atual: " + tv1.canal);
		System.out.println("Volume Atual: " + tv1.volume);
		
		tv1.ligar();
		System.out.println("TV está ligada? " + tv1.ligada);
		
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		tv1.aumentarVolume();
		
		
		tv1.diminuirVolume();
		tv1.diminuirVolume();
		tv1.diminuirVolume();
		
		tv1.aumentarCanal();
		tv1.aumentarCanal();
		tv1.aumentarCanal();
		
		tv1.diminuirCanal();
		tv1.diminuirCanal();
		tv1.diminuirCanal();
		
		tv1.mudarCanal(9);
		
		
		

	}

}
