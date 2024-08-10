package projetoPt2;

import java.util.ArrayList;
import java.util.Scanner;

//- Implementação do esqueleto das classes necessárias no projeto;

public class userNormal {

// - Implementação dos atributos das classes considerando atributos simples e associações com outras classes;
    public String nome;
    public String email;
    public String senha;
    public String descricao;
    public String vistoPorUltimo;
   
    public ArrayList<userNormal> amigos = new ArrayList<>();
    public ArrayList<userNormal> perfisFavoritos = new ArrayList<>();
    public ArrayList<Mensagem> mensagem = new ArrayList<>();
   
    public static Scanner leitor = new Scanner(System.in);

//  construtores
    
    public userNormal(String nome, String email, String senha, String descricao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.descricao = descricao;
    };

    //Atualizar dados
    public String alterarNome() {
        return this.nome = leitor.nextLine();
    };

    public String alterarEmail() {
    return this.nome = leitor.nextLine();
    };

    public String alterarDescricao() {
        return this.descricao = leitor.nextLine();
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
    System.out.println("Usuário cadastrado com sucesso!");
    System.out.println("Nome de usuário: "+this.nome);
    System.out.println("Email do usuário: "+this.email);
    System.out.println("Bio:\n"+this.descricao+"\n");
    System.out.println("-------------------------------------------------\n");
    }

	public static userNormal ler() {
		userNormal novoUser = new userNormal("","","","");
		  System.out.println("Novo usuario Normal !");
		  
		  System.out.print("Digite o seu nome: ");
		  novoUser.nome = leitor.nextLine();
		  
		  System.out.print("Digite o seu email: ");
		  novoUser.email = leitor.nextLine();
		  
		  System.out.print("Digite o sua Bio: ");
		  novoUser.descricao = leitor.nextLine();
		  return novoUser;
	}
   
//  -Implementação de um método que lê os dados e cria um objeto em cada classe (como exemplo de dado de código em aula);
}