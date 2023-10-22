package funcionalidades;

public class Atendente {
	private String id;
    private String nome;
    private String dataNascimento;
    private String telefone;
    private String email;
    private Chat[] chats;
    private FormularioContato[] formulariosContato;
    
    public Atendente() {
	
    }
    
    

    public Atendente(String id, String nome, String dataNascimento, String telefone, String email, Chat[] chats,
			FormularioContato[] formulariosContato) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.chats = chats;
		this.formulariosContato = formulariosContato;
	}



	public void enviaMensagem() {
        // Implementação do método
    }
}
