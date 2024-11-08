package BaseDesorganizada;

public class Mensagem {
	
	public String conteudoPublico;
	public userNormal conteudoPrivado;
	public userNormal usuarioDestinado;
	
	public void imprimir() {
		System.out.println(conteudoPublico);
	}
}
