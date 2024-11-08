package BaseDesorganizada;

import java.util.ArrayList;
import java.util.Scanner;

//- Implementação do esqueleto das classes necessárias no projeto;

public class userNormal extends Usuarios{
    
	private String vistoPorUltimo;
   
	private ArrayList<userNormal> amigos = new ArrayList<>();
	private ArrayList<userNormal> perfisFavoritos = new ArrayList<>();
	private ArrayList<Mensagem> mensagem = new ArrayList<>();
   
    public static Scanner leitor = new Scanner(System.in);

//  construtores
    
    public String getVistoPorUltimo() {
		return vistoPorUltimo;
	}

	public void setVistoPorUltimo(String vistoPorUltimo) {
		this.vistoPorUltimo = vistoPorUltimo;
	}

	public ArrayList<Mensagem> getMensagem() {
		return mensagem;
	}

	public void setMensagem(ArrayList<Mensagem> mensagem) {
		this.mensagem = mensagem;
	}

	public void setAmigos(ArrayList<userNormal> amigos) {
		this.amigos = amigos;
	}

	public void setPerfisFavoritos(ArrayList<userNormal> perfisFavoritos) {
		this.perfisFavoritos = perfisFavoritos;
	}

	public userNormal(String vistoPorUltimo, String nome, String email, String senha, String descricao) {
		// TODO Auto-generated constructor stub
    	super(nome, email, senha ,descricao);
    	this.vistoPorUltimo = vistoPorUltimo;
    	
	}

    //Atualizar dados
    public String alterarNome() {
        return this.setNome(leitor.nextLine());
    };

    public String alterarEmail() {
    return this.setNome(leitor.nextLine());
    };

    public String alterarDescricao() {
        String descricao = this.getDescricao();
         descricao = leitor.nextLine();
         return descricao;
    };

    public ArrayList<userNormal> getAmigos() {
        return amigos;
    };

    public ArrayList<userNormal> getPerfisFavoritos() {
        return perfisFavoritos;
    };

    //Visitar sala
    public boolean visitarSala(String sala, boolean permissaoAdministrador) {
   
        if (permissaoAdministrador) {
       
        System.out.println("Visitando a sala: " + sala);
            return true;
           
        } else {
       
            System.out.println("Permissão negada para visitar a sala: " + sala);
            return false;
        }
    }
   
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada: " + mensagem);
    }

    public void reagirComEmoji(String emoji) {
        System.out.println("Reagindo com emoji: " + emoji);
    }

    public void enviarAudio(String audio) {
        System.out.println("Áudio enviado: " + audio);
    }

    public void enviarVideo(String video) {
        System.out.println("Vídeo enviado: " + video);
    }

    public void enviarFoto(String foto) {
        System.out.println("Foto enviada: " + foto);
    }
   
//  - Implementação de um método que imprime os dados de um objeto já preenchido (como exemplo de dado de código em aula).

    public void Imprimir() {
        System.out.println("----------usuario Cadastrado com sucesso!----------------\n");
        super.imprimir();

    }
    
	public static userNormal ler() {
		userNormal novoUser = new userNormal("","","","","");
		
		  System.out.println("");
		
		  System.out.println("Novo usuario Normal !");
		  
		  System.out.print("Digite o seu nome: ");
		  novoUser.setNome(leitor.nextLine());
		  
		  System.out.print("Digite o seu email: ");
		  novoUser.setEmail(leitor.nextLine());
		  
		  System.out.print("Digite a sua Senha: ");
		  novoUser.setSenha(leitor.nextLine());
		  
		  System.out.print("Digite o sua Descrição: ");
		  novoUser.setDescricao(leitor.nextLine());
		  
		  System.out.println("");
		  return novoUser;
	}
   
//  -Implementação de um método que lê os dados e cria um objeto em cada classe (como exemplo de dado de código em aula);
}