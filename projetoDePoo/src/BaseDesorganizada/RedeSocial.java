//CLASSE ONDE ACONTECE O RUIM
//RODE E VEJA O QUE ACONTECE...

package BaseDesorganizada;
import java.util.ArrayList;
import java.util.Scanner;

public class RedeSocial {
 
	private String nome;
	private String endereco;
	private ArrayList<userNormal> usuariosNormais = new ArrayList<>();
	private ArrayList<userModer> usuariosModeradores = new ArrayList<>();
	private ArrayList<userAdmin> usuariosAdministradores = new ArrayList<>();
	private String configuracoes;

	public RedeSocial(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	//métodos

	public void mostrarUsuariosNormais() {
		System.out.println("");
		System.out.println("---- Usuarios Normais ----");
		int c = 1;

		if(usuariosNormais.isEmpty()) {
			System.out.println("Não existe usuários Normais Cadastrados");
		}else {
			for (userNormal usu : usuariosNormais) {
				System.out.println("Usuario "+c+": "+usu.getNome());
				c++;
			}
		}
		System.out.println("-------------------------------------------");
		System.out.println("");
	}
	
	public void mostrarUsuariosModers() {
		System.out.println("");
		
		System.out.println("---- Usuarios Moderadores ----");
		int c = 1;
		
		if(usuariosModeradores.isEmpty()) {
			System.out.println("Não existe usuários Moderadores Cadastrados");
		}else {
			for (userModer usu : usuariosModeradores) {
				System.out.println("Usuario "+c+": "+usu.getNome());
				c++;
			}
		}
		System.out.println("------------------------------------");
		System.out.println("");
	}
	
	public void mostrarUsuariosAdms() {
		System.out.println("");
		
		System.out.println("---- Usuários Administradores ----");
		int c = 1;
		if(usuariosAdministradores.isEmpty()) {
			System.out.println("Não existe usuários Administradores Cadastrados");
		}else {
			for (userAdmin usu : usuariosAdministradores) {
				System.out.println("Usuario "+c+": "+usu.getNome());
				c++;
			}
		}
		System.out.println("------------------------------------");
		System.out.println("");
	}

	public void addUsuNormal(userNormal user) {
		usuariosNormais.add(user);
	}
	
	public void addUsuModer(userModer user) {
		usuariosModeradores.add(user);
	}
	
	public void addUsuAdmin(userAdmin user) {
		usuariosAdministradores.add(user);
	}

	public synchronized String getNome() {
		return nome;
	}
	
	public synchronized void setNome(String nome) {
		this.nome = nome;
	}

	public synchronized String getEndereco() {
		return endereco;
	}

	public synchronized void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public synchronized ArrayList<userNormal> getUsuariosNormais() {
		return usuariosNormais;
	}

	public synchronized void setUsuariosNormais(ArrayList<userNormal> usuariosNormais) {
		this.usuariosNormais = usuariosNormais;
	}

	public synchronized ArrayList<userModer> getUsuariosModeradores() {
		return usuariosModeradores;
	}

	public synchronized void setUsuariosModeradores(ArrayList<userModer> usuariosModeradores) {
		this.usuariosModeradores = usuariosModeradores;
	}

	public synchronized ArrayList<userAdmin> getUsuariosAdministradores() {
		return usuariosAdministradores;
	}

	public synchronized void setUsuariosAdministradores(ArrayList<userAdmin> usuariosAdministradores) {
		this.usuariosAdministradores = usuariosAdministradores;
	}

	public synchronized String getConfiguracoes() {
		return configuracoes;
	}

	public synchronized void setConfiguracoes(String configuracoes) {
		this.configuracoes = configuracoes;
	}
	
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
	
	
	public void menuCadastroImprimir() {
		System.out.println("Qual usuario você quer cadastrar");
		System.out.println("1- usuario normal");
		System.out.println("2- usuario moder");
		System.out.println("3- usuario admin");
	}
	public int menuCadastroUser(Scanner leitor) {
				int escolha = leitor.nextInt();
		return escolha;
	}
	

	public void menuListarImprimir() {
		System.out.println("Quais usuários você quer Listar");
		System.out.println("1- usuarios normais");
		System.out.println("2- usuarios moderadores");
		System.out.println("3- usuarios administradores");
	}
	public int menuListar(Scanner leitor) {
		int escolhaLista = leitor.nextInt();
		return escolhaLista;
	}
	
	public void cadastraruserNormal(RedeSocial ifsul) {
		userNormal user1 = userNormal.ler();
		ifsul.addUsuNormal(user1);
		System.out.println("Seu usuario Normal foi cadastrado com sucesso!");
		System.out.println("");
	}
	public void cadastraruserModer(RedeSocial ifsul) {
		userModer user2 = userModer.ler();
		ifsul.addUsuModer(user2);
		System.out.println("Seu usuario Moderador foi cadastrado com sucesso!");
		System.out.println("");
	}	
	public void cadastraruserAdmin(RedeSocial ifsul) {
		userAdmin user3 = userAdmin.ler();
		ifsul.addUsuAdmin(user3);
		System.out.println("Seu usuario Administrador foi cadastrado com sucesso!");
		System.out.println("");
	}	

	
	public static void main(String[] args) {
		RedeSocial gpt = new RedeSocial("GPT","www.gptZero.com.br");
		int escolhaInicial = 999;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1- Cadastrar um Novo Usuario");
			System.out.println("2- Listar Todos os Usuarios cadastrados");
			System.out.println("3- Listar Usuarios já cadastrados");
			System.out.println("0- Sair...");
			escolhaInicial = sc.nextInt();
			sc.nextLine();
			
			switch (escolhaInicial) {
			
			case 1: {
				//inicio case 1
				gpt.menuCadastroImprimir();
				int qualUser = gpt.menuCadastroUser(sc);
				if(qualUser == 1) {
					gpt.cadastraruserNormal(gpt);
				}else if(qualUser == 2) {
					gpt.cadastraruserModer(gpt);
				}else if(qualUser == 3) {
					gpt.cadastraruserAdmin(gpt);
				}else {
					System.out.println("Você digitou um número inválido");
				}
				break;
				//fim case 1
			}
			case 2: {
                gpt.mostrarUsuariosNormais();
                gpt.mostrarUsuariosModers();
                gpt.mostrarUsuariosAdms();
                break;
			}
			case 3: {
				gpt.menuListarImprimir();
				int qualMenu = gpt.menuListar(sc);
				
				if(qualMenu == 1) {
					gpt.mostrarUsuariosNormais();
				}else if(qualMenu == 2) {
					gpt.mostrarUsuariosModers();
				}else if(qualMenu == 3) {
					gpt.mostrarUsuariosAdms();
				}else { 
					System.out.println("Digite um numero válido");
				}
				break;
			}
			
			case 0: {
				System.out.println("Saindo...");
				break;
			}
			default:
				System.out.println("Opção Inválida!");
				break;
			}
			
		} while (escolhaInicial != 0);
		
	}
}
