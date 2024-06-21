package projeto_youtube;

public class Video implements AcoesVideo {
	// atributos
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	// construtor
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	// getters e setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		int novaAvaliacao;
		novaAvaliacao = (this.avaliacao + avaliacao) / this.views;
		this.avaliacao = novaAvaliacao;
	}
	
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean getReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	// metodos abstratos da interface
	@Override
	public void play() {
		this.setReproduzindo(true);
	}
	
	@Override
	public void pause() {
		this.setReproduzindo(false);
	}

	@Override
	public void like() {
		this.setCurtidas(getCurtidas() + 1);
	}

	@Override
	public String toString() { 
		return "Video ["
				+ "\n titulo = " + titulo + 
				"\n avalicao = " + avaliacao + 
				"\n views = " + views + 
				"\n curtidas = " + curtidas + 
				"\n reproduzindo = " + reproduzindo;
	}
}
