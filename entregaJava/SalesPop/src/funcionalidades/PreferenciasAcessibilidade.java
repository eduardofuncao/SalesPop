package funcionalidades;

public class PreferenciasAcessibilidade {
	private String id;
    private boolean daltonismo;
    private boolean altoContraste;
    private boolean linksSublinhados;
    private boolean modoDislexia;
    
    public PreferenciasAcessibilidade() {
	
    }
    
    
    
    public PreferenciasAcessibilidade(String id, boolean daltonismo, boolean altoContraste,
			boolean linksSublinhados, boolean modoDislexia) {
		this.id = id;
		this.daltonismo = daltonismo;
		this.altoContraste = altoContraste;
		this.linksSublinhados = linksSublinhados;
		this.modoDislexia = modoDislexia;
	}



	public void recebeInfo() {
        // Implementação do método
    }

    public void submit() {
        // Implementação do método
    }
}	
