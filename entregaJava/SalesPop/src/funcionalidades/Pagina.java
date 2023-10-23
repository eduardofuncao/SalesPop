package funcionalidades;

public class Pagina {
	public String id;
    public String url;
    public String titulo;
    public String conteudo;
    public String estilo;
    public PreferenciasAcessibilidade preferencias;
    public String linguagem;
    
    public Pagina() {
	
    }
    
    public Pagina(String id, String url, String titulo, String conteudo, String estilo,
			PreferenciasAcessibilidade preferencias, String linguagem) {
		this.id = id;
		this.url = url;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.estilo = estilo;
		this.preferencias = preferencias;
		this.linguagem = linguagem;
	}
}
