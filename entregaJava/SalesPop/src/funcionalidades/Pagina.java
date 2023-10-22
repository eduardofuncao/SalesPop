package funcionalidades;

public class Pagina {
	private String id;
    private String url;
    private String titulo;
    private String conteudo;
    private String estilo;
    private PreferenciasAcessibilidade preferencias;
    private String linguagem;
    
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

	public void display() {
        // Implementação do método
    }

    public void modificaPaleta() {
        // Implementação do método
    }

    public void aumentaEspacamento() {
        // Implementação do método
    }

    public void linksSublinhados() {
        // Implementação do método
    }

    public void guardaHistorico() {
        // Implementação do método
    }
}
