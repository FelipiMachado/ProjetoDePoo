package BaseDesorganizada;
import java.util.Scanner;

public class userModer extends Usuarios{
	
	private String descricaoDaSala;
    private String informacoesDePerfil;
    private boolean usuarioNormal;
    private boolean permissaoParaOutraSala = false;
    
    public static Scanner scanear = new Scanner(System.in);
    
    private String fotoDaSala;
    public synchronized String getFotoDaSala() {
		return fotoDaSala;
	}


	public synchronized void setFotoDaSala(String fotoDaSala) {
		this.fotoDaSala = fotoDaSala;
	}


	public synchronized String getDescricaoDaSala() {
		return descricaoDaSala;
	}


	public synchronized void setDescricaoDaSala(String descricaoDaSala) {
		this.descricaoDaSala = descricaoDaSala;
	}


	public synchronized String getInformacoesDePerfil() {
		return informacoesDePerfil;
	}


	public synchronized void setInformacoesDePerfil(String informacoesDePerfil) {
		this.informacoesDePerfil = informacoesDePerfil;
	}


	public synchronized boolean isUsuarioNormal() {
		return usuarioNormal;
	}


	public synchronized void setUsuarioNormal(boolean usuarioNormal) {
		this.usuarioNormal = usuarioNormal;
	}


	public synchronized boolean isPermissaoParaOutraSala() {
		return permissaoParaOutraSala;
	}


	public synchronized void setPermissaoParaOutraSala(boolean permissaoParaOutraSala) {
		this.permissaoParaOutraSala = permissaoParaOutraSala;
	}

    public userModer(String nome, String email, String senha, String descricao, Boolean permissaoParaOutraSala) {
        super(nome, email, senha, descricao);
        this.permissaoParaOutraSala = permissaoParaOutraSala;
    }


	public void alterarNome() {
        this.setNome(scanear.nextLine());
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
            System.out.println("Usuário " + getNome() + " foi silenciado por " + dias + " dias.");
        } else {
            System.out.println("Duração inválida. O silenciamento deve ser entre 1 e 15 dias.");
        }
    }

    public void censurarMensagens() {
        if (usuarioNormal) {
            System.out.println("As mensagens do usuário " + getNome() + " estão sendo censuradas.");
        } else {
            System.out.println("Esse usuário não é um usuário normal. Ação não permitida.");
        }
    } 
    
    public String getNome() {
		return super.getNome();
    };
    
    public void Imprimir() {
        System.out.println("-------Usuário Moder cadastrado com sucesso!---------");
       
        super.imprimir();
      System.out.println("permissão: "+ this.permissaoParaOutraSala);

    }


	public static userModer ler() {
		  userModer usuario1 = new userModer("","","","", false);
		  
		  System.out.println("Novo usuario Moder !");		

		  System.out.print("Digite o seu nome: ");
		  usuario1.setNome(scanear.nextLine());
		  
		  System.out.print("Digite o seu email: ");
		  usuario1.setEmail(scanear.nextLine());
		  
		  System.out.print("Senha: ");
		  usuario1.setSenha(scanear.nextLine());
		  
		  System.out.print("Digite o sua Descrição: ");
		  usuario1.setDescricao(scanear.nextLine());
		  
//		  System.out.println("Permissão para acessar outra sala: ");
//		  usuario1.permissaoParaOutraSala = scanear.nextBoolean();

//		  scanear.nextLine();
		  
		  System.out.println("");
		  
		return usuario1;
	}
    
	/*
	 * public static void main(String[] args) { userModer user1 = new
	 * userModer("Nicole", "nicole@gmail.com"); System.out.println(user1.getNome());
	 * user1.alterarNome("Picole"); System.out.println(user1.getNome()); }
	 */
}