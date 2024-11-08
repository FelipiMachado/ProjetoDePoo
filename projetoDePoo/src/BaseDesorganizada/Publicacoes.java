package BaseDesorganizada;

public class Publicacoes {
	
	public String conteudo;
	public String usuarioQuePublicou;

	public Publicacoes(String conteudo, String userpubli) {
		this.conteudo = conteudo;
		this.usuarioQuePublicou = userpubli;
	}
	
	public void imprimir() {
		System.out.println("Conteudo da publicação: "+ this.conteudo);
		System.out.println("Usuario que publicou "+this.usuarioQuePublicou);
	}
}
