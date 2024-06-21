package projeto_youtube;

public class ProjetoYoutube {

	public static void main(String[] args) {
		Video v1 = new Video("Aula 25 de HTML");
		Video v2 = new Video("Aula 5 de POO");
		Video v3 = new Video("Aula 12 de Javascript");
		//System.out.println(v1.toString());
		
		Gafanhoto g1 = new Gafanhoto("Bruno", 22, "M", "brunoalejandrodev");
		Gafanhoto g2 = new Gafanhoto("Bruxo Geraldo", 32, "M", "matabicho");
		
		Visualizacao vis1 = new Visualizacao(g1, v1);
		Visualizacao vis2 = new Visualizacao(g1, v2);
		Visualizacao vis3 = new Visualizacao(g1, v3);
		vis1.avaliar(7);
		vis2.avaliar(85.0f);
		vis3.avaliar();
		
		Visualizacao vis4 = new Visualizacao(g2, v1);
		vis4.avaliar(67.0f);
		
		System.out.println(vis1.toString());
		System.out.println(vis2.toString());
		System.out.println(vis3.toString());
		System.out.println(vis4.toString());
	}

}