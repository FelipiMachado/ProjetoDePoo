package BaseDesorganizada;

import java.util.ArrayList;

public class Usuarios {
    private String nome;
    private String email;
    private String senha;
    private String descricao;
    
	private ArrayList<Publicacoes> publicacoes = new ArrayList<>();
	private ArrayList<Sala> salas = new ArrayList<>();
	private ArrayList<Mensagem> mensagens = new ArrayList<>();
	
	
	public synchronized ArrayList<Publicacoes> getPublicacoes() {
		return publicacoes;
	}

	public synchronized void setPublicacoes(ArrayList<Publicacoes> publicacoes) {
		this.publicacoes = publicacoes;
	}

	public synchronized ArrayList<Sala> getSalas() {
		return salas;
	}

	public synchronized void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}

	public synchronized ArrayList<Mensagem> getMensagens() {
		return mensagens;
	}

	public synchronized void setMensagens(ArrayList<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}

	public Usuarios(String nome, String email, String senha, String descricao) {
        this.setNome(nome);
        this.email = email;
        this.senha = senha; 
        this.descricao = descricao;
    }
	
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
    public void imprimir() {
        System.out.println("Nome de usuário: "+this.getNome());
        System.out.println("Email do usuário: "+this.email);
        System.out.println("Senha: "+ this.senha);
        System.out.println("Descrição:\n"+this.descricao+"\n");
    }

	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		this.nome = nome;
		return nome;
	}
    
   
}

