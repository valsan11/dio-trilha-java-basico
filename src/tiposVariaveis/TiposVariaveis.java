package tiposVariaveis;

public class TiposVariaveis {

	  public static void main(String[] args) {
		  
		  short numeroCurto = 1;
		  int numeroNormal = numeroCurto;
		  short numeroCurto2 = (short)numeroNormal;
		  
		  final  int NUMERO = 1;
		  //NUMERO =2;
		  System.out.println("Hello, World!" + NUMERO);
		  
		  int a = 6;
		  int b = 6;
		  
		  String resposta = a==b ? "verdadeiro": "falso";
		  System.out.println(resposta);
	  }
}
