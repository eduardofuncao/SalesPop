package funcionalidades;

public class Atendente {
	private String id;
    private String nome;
    private String dataNascimento;
    private String telefone;
    private String email;
    private Chat chat;
    private FormularioContato[] formulariosContato;
    
    public Atendente() {
	
    }
    
    

    public Atendente(String id, String nome, String dataNascimento, String telefone, String email, Chat chat,
			FormularioContato[] formulariosContato) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.chat = chat;
		this.formulariosContato = formulariosContato;
	}



	public void enviaMensagem(String msg) {
		// envia mensagem em forma de string para o chat associado
        this.chat.historico += "\n" + this.nome + ": " + msg;
	}
}
