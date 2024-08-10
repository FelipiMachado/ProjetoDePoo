package projetoPt2;
import java.util.Scanner;

public class Cadastro {

    public static Scanner leitor = new Scanner(System.in);
	public static void main(String[] args) {
		
		  
 		 userNormal novoUser = userNormal.ler();
//------------------------------------------------------------------------------------------------

//		 userModer novoModer = userModer.ler();

		 novoUser.Imprimir();
//		 novoModer.Imprimir(novoModer);
		
	}
}

