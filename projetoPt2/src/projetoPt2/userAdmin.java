package projetoPt2;



import java.util.Scanner;



public class userAdmin {

	public String nome;
	public String email;
	public String senha;
	public String nomeDaSala;
	public String perfil;
	public String dadosDaSala;
	public boolean silenciarUsuario;
	public boolean banirUser = false;
	public boolean promoveUser = false;
	public String sala;

	

    public static Scanner leitor = new Scanner(System.in);



    public userAdmin(String nome, String email, String nomeSala, String senha) {

        this.nome = nome;

        this.email = email;

        this.nomeDaSala = nomeSala;

        this.senha = senha;

    }



    public String mudarNomeDaSala() {

        return this.sala = leitor.nextLine();

    }



    public String verDadosDaSala() {

        return this.dadosDaSala = leitor.nextLine();

    }


    public Boolean silenciarUsuario() {

        return this.silenciarUsuario = true;

    }


    public String modificarSala() {

        return this.sala = leitor.nextLine();

    }

    

    public Boolean banirUsuarioPermanentemente() {

    	return this.banirUser = leitor.nextBoolean();

    }



    public Boolean promoverModerador() {

        return this.promoveUser = true;

    }



//    public void rebaixarModerador(String usuario) {

//        System.out.println("Usuário " + usuario + " foi rebaixado de moderador.");

//    }

    

    

    public void Imprimir() {

    	System.out.println("Nome do administrador: "+this.nome);

    	System.out.println("Email do administrador: "+this.email);

    	System.out.println("Nome da sala que criou: "+this.nomeDaSala);

    	System.out.println("Senha do administrador: "+this.senha);

    }

}