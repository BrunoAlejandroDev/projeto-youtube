package projeto_youtube;

public class Gafanhoto extends Pessoa {
	// atributos
	private String login;
	private int totalVideosAssistidos;
	
	// construtor
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totalVideosAssistidos = 0;
	}
	
	// getters e setters
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotalVideosAssistidos() {
		return totalVideosAssistidos;
	}
	public void setTotalVideosAssistidos(int totalVideosAssistidos) {
		this.totalVideosAssistidos = totalVideosAssistidos;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nGafanhoto ["
				+ "\n login = " + login + 
				"\n total de vídeos assistidos = " + totalVideosAssistidos + "\n]";
	}
	
}
