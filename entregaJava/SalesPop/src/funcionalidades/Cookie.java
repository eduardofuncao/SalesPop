package funcionalidades;

public class Cookie {
    private String id;
    private String nome;
    private String dominio;
    private String dataExpira;
    private boolean preferencias;
    private boolean estatistica;
    private boolean marketing;

    public Cookie() {
	
    }
    
    
    	
    public Cookie(String id, String nome, String dominio, String dataExpira, boolean preferencias, boolean estatistica, boolean marketing) {
		this.id = id;
		this.nome = nome;
		this.dominio = dominio;
		this.dataExpira = dataExpira;
		this.preferencias = preferencias;
		this.estatistica = estatistica;
		this.marketing = marketing;
	}



	public void recebeInfo() {
        // Implementação do método
    }

    public void submit() {
        // Implementação do método
    }
}
