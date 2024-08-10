package projetoPt2;
import java.util.Scanner;

public class userModer {
    public String nome;
    public String email;
    public String senha;
    public String descricao;
    public String fotoDaSala;
    public String descricaoDaSala;
    public boolean permissaoParaOutraSala;
    public String informacoesDePerfil;
    public boolean usuarioNormal;

    public static Scanner scanear = new Scanner(System.in);
    
    public userModer(String nome, String email, String descricao, String senha) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
        this.senha= senha;
    }

    
    public void alterarNome() {
        this.nome = scanear.nextLine();
    }

    public void alterarFotoDaSala(String novaFoto) {
        this.fotoDaSala = novaFoto;
    }

    public void alterarDescricaoDaSala() {
        this.descricaoDaSala = scanear.nextLine();
    }

    public void concederPermissaoParaOutraSala() {
        this.permissaoParaOutraSala = true;
    }
    
    public void negarPermissaoParaOutraSala() {
        this.permissaoParaOutraSala = false;
    }
    
    public void alterarInformacoesDePerfil(String novasInformacoes) {
        this.informacoesDePerfil = novasInformacoes;
    }

    public void silenciarUsuario(int dias) {
        if (dias > 0 && dias <= 15) {
            System.out.println("Usuário " + nome + " foi silenciado por " + dias + " dias.");
        } else {
            System.out.println("Duração inválida. O silenciamento deve ser entre 1 e 15 dias.");
        }
    }

    public void censurarMensagens() {
        if (usuarioNormal) {
            System.out.println("As mensagens do usuário " + nome + " estão sendo censuradas.");
        } else {
            System.out.println("Esse usuário não é um usuário normal. Ação não permitida.");
        }
    } 
    
    public String getNome() {
		return this.nome;
    };
    
    public void Imprimir() {
        System.out.println("-------------------------------------------------\n");
        System.out.println("Usuário Moder cadastrado com sucesso!");
        System.out.println("Nome de usuário: "+this.nome);
        System.out.println("Email do usuário: "+this.email);
        System.out.println("Senha: "+this.senha);
        System.out.println("Bio:\n"+this.descricao+"\n");
        System.out.println("-------------------------------------------------\n");
    }


	public static userModer ler() {
		  userModer usuario1 = new userModer("","","","");
		  System.out.println("Novo usuario Moder !");		
		  
		  System.out.print("Digite o seu nome: ");
		  usuario1.nome = scanear.nextLine();
		  
		  System.out.print("Digite o seu email: ");
		  usuario1.email = scanear.nextLine();
		  
		  System.out.println("Senha: ");
		  usuario1.senha = scanear.nextLine();
		  
		  System.out.print("Digite o sua Bio: ");
		  usuario1.descricao = scanear.nextLine();
		  	  
		  
		return usuario1;
	}
    
	/*
	 * public static void main(String[] args) { userModer user1 = new
	 * userModer("Nicole", "nicole@gmail.com"); System.out.println(user1.getNome());
	 * user1.alterarNome("Picole"); System.out.println(user1.getNome()); }
	 */
}