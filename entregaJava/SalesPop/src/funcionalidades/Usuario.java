package funcionalidades;

public class Usuario {
	private String id;
    private String nome;
    private String email;
    private String telefone;
    private String cargo;
    private String empresa;
    private FormularioContato formularioContato;
    private Cookie cookie;
    private PreferenciasAcessibilidade preferenciasAcessibilidade;
    private Chat chat;
    private Pagina pagina;
    private Atendente atendente;
    
    public Usuario() {
		
	}
    
    public Usuario(String id, String nome, String email, String telefone, String cargo, String empresa,
			FormularioContato formularioContato, Cookie cookie,
			PreferenciasAcessibilidade preferenciasAcessibilidade, Chat chat, Pagina pagina, Atendente atendente) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cargo = cargo;
		this.empresa = empresa;
		this.formularioContato = formularioContato;
		this.cookie = cookie;
		this.preferenciasAcessibilidade = preferenciasAcessibilidade;
		this.chat = chat;
		this.pagina = pagina;
		this.atendente = atendente;
	}



	public void atualizaPerfil() {
        // Implementação do método
    }

    public void removePerfil() {
        // Implementação do método
    }

    public void fazPesquisa() {
 
    	System.out.println("Digite no campo de pesquisa: ");
        
    }

    public void enviaMensagem() {
        // Implementação do método
    }
}
