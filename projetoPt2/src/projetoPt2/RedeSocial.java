package projetoPt2;
import java.util.ArrayList;
public class RedeSocial {
 
	public String nome;
	public String endereco;
	public ArrayList<userNormal> usuariosNormais = new ArrayList<>();
	public ArrayList<userModer> usuariosModeradores = new ArrayList<>();
	public ArrayList<userAdmin> usuariosAdministradores = new ArrayList<>();
	public ArrayList<Publicacoes> publicacoes = new ArrayList<>();
	public ArrayList<Sala> salas = new ArrayList<>();
	public ArrayList<Mensagem> mensagens = new ArrayList<>();
	public String configuracoes;
	
	//métodos
	
	public void Status() {
		System.out.println("a rede tá aberta");
	}
	
	public void procurarUser() {
		System.out.println("Achei O usuario "+ this.nome);
	}
	
	public void removerUser() {
		System.out.println("usuario "+ this.nome + " foi removido");
	}
	
	public void procurarSala(Sala sala) {
		System.out.println("encontrei a sala: "+ this.nome);
	}
	
	public void removerSala(Sala sala) {
		System.out.println("removi a sala: "+ this.nome);
	}
	
	public void Configuracoes() {
		System.out.println("configurado meu Chefe");
	}
	

}
