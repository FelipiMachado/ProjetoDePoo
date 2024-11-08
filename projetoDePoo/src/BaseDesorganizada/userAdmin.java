package BaseDesorganizada;
import java.util.Scanner;



public class userAdmin extends Usuarios{


	private String nomeDaSala;
	private String perfil;
	private String dadosDaSala;
	private boolean silenciarUsuario;
	private boolean banirUser = false;
	private boolean promoveUser = false;
	private String sala;

    public userAdmin(String nomeDaSala, String dadosDaSala, String nome, String email, String senha, String descricao) {
    	super(nome, email, senha, descricao);
        this.setNomeDaSala(nomeDaSala);
        this.dadosDaSala = dadosDaSala;
    }

    public static Scanner scanear = new Scanner(System.in);

	
	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getDadosDaSala() {
		return dadosDaSala;
	}

	public void setDadosDaSala(String dadosDaSala) {
		this.dadosDaSala = dadosDaSala;
	}

	public boolean isSilenciarUsuario() {
		return silenciarUsuario;
	}

	public void setSilenciarUsuario(boolean silenciarUsuario) {
		this.silenciarUsuario = silenciarUsuario;
	}

	public boolean isBanirUser() {
		return banirUser;
	}

	public void setBanirUser(boolean banirUser) {
		this.banirUser = banirUser;
	}

	public boolean isPromoveUser() {
		return promoveUser;
	}

	public void setPromoveUser(boolean promoveUser) {
		this.promoveUser = promoveUser;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public static Scanner getScanear() {
		return scanear;
	}

	public static void setScanear(Scanner scanear) {
		userAdmin.scanear = scanear;
	}

    public String mudarNomeDaSala() {

        return this.sala = scanear.nextLine();

    }

    public String verDadosDaSala() {

        return this.dadosDaSala = scanear.nextLine();

    }


    public Boolean silenciarUsuario() {

        return this.silenciarUsuario = true;

    }


    public String modificarSala() {

        return this.sala = scanear.nextLine();

    }

    public Boolean banirUsuarioPermanentemente() {

    	return this.banirUser = scanear.nextBoolean();

    }
    
    public Boolean promoverModerador() {

        return this.promoveUser = true;

    }



//    public void rebaixarModerador(String usuario) {

//        System.out.println("Usuário " + usuario + " foi rebaixado de moderador.");

//    }

    
    public static userAdmin ler() {
		  userAdmin adm1 = new userAdmin("","","","","","");
		  
		  System.out.println("");
		  
		  System.out.println("Novo usuario Administrador");		

		  System.out.print("Digite o seu nome: ");
		  adm1.setNome(scanear.nextLine());
		  
		  System.out.print("Digite o seu email: ");
		  adm1.setEmail(scanear.nextLine());
		  
		  System.out.print("Senha: ");
		  adm1.setSenha(scanear.nextLine());
		  
		  System.out.print("Digite o sua Descrição: ");
		  adm1.setDescricao(scanear.nextLine());

		  System.out.print("Digite o Nome da Sala: ");
		  adm1.setNomeDaSala(scanear.nextLine());
		  
		  System.out.print("Digite a Descrição da Sala: ");
		  adm1.dadosDaSala = scanear.nextLine();
		
		  System.out.println("");
		  
		  return adm1;
    }
    

    public void Imprimir() {
    	System.out.println("------- Novo Adm na Área! ---------");
    	super.imprimir();
    	System.out.println("Nome da Sala: "+getNomeDaSala());
    	System.out.println("Descrição da Sala: "+ dadosDaSala);
    }

	public String getNomeDaSala() {
		return nomeDaSala;
	}

	public void setNomeDaSala(String nomeDaSala) {
		this.nomeDaSala = nomeDaSala;
	}

}