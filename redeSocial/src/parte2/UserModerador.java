package parte2;

public class UserModerador {

	//Dados de cadastro
	String email;
	String nameUser;
	String senha;
	//Dados de perfil
	String descrição;
	Boolean fotoPerfil;
	Boolean vistoPorUltimo; //Se a pessoa quiser mostrar ou não a hora que esteve online pela última vez.
	
	//Ações simples
	public void AtualizarCadastro() {
		
	}
	
	public void AtualizarFotoSala() {
		
	}
	
	public void AtualizarDescricaoSala() {
		
	}
	
	public void Vizitar() {
		
	}
	
	public void MostrarVistoUltimo() {
		
	}
	
	//Ações complexas
	public boolean Silenciar() {
		return true;
	}

	public boolean ApagarMensagem() {
		return true;
	}
}
