package BaseDesorganizada;
import java.util.ArrayList;
import java.util.Scanner;

public class Sala {
	
	private String nomeAdm;
	private String nome;
	private ArrayList<userNormal> participantes = new ArrayList<>();
	
	public synchronized String getNomeAdm() {
		return nomeAdm;
	}

	public synchronized void setNomeAdm(String nomeAdm) {
		this.nomeAdm = nomeAdm;
	}

	public synchronized String getNome() {
		return nome;
	}

	public synchronized void setNome(String nome) {
		this.nome = nome;
	}

	public synchronized ArrayList<userNormal> getParticipantes() {
		return participantes;
	}

	public synchronized void setParticipantes(ArrayList<userNormal> participantes) {
		this.participantes = participantes;
	}

	public static void main(String[] args) {
		Scanner scanear = new Scanner(System.in);
		//todos com Seus métodos imprimir
		
		System.out.println("digite os dados");
//		userNormal p1 = new userNormal(scanear.nextLine(),scanear.nextLine(),scanear.nextLine(),scanear.nextLine());
		
//	p1.Imprimir();
		scanear.close();
	}
	
}
