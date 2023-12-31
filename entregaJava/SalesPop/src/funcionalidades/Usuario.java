package funcionalidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
	private String id;
    private String nome;
    private String email;
    private String telefone;
    private String cargo;
    private String empresa;
    public FormularioContato formularioContato;
    public Cookie cookie;
    public PreferenciasAcessibilidade preferenciasAcessibilidade;
    public Chat chat;
    public Pagina[] paginas;
    public Atendente atendente;
    
    
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Usuario() {
		
	}
    
    public Usuario(String id, String nome, String email, String telefone, String cargo, String empresa,
			FormularioContato formularioContato, Cookie cookie,
			PreferenciasAcessibilidade preferenciasAcessibilidade, Chat chat, Pagina[] paginas, Atendente atendente) {
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
		this.paginas = paginas;
		this.atendente = atendente;
	}

    public void fazPesquisa(String s) {
    	// realiza pesquisa em todas as páginas do site e imprime no console a posição da primeiro resultado encontrado
    	Scanner read = new Scanner(System.in);
    	List<Integer> resultados = new ArrayList<Integer>();

    	for(int i = 0; i<this.paginas.length; i++) {
    		int index = paginas[i].conteudo.indexOf(s);
    		if(index != -1) {
    			System.out.println("O termo " + s + " foi encontrado na posição " + index + " da página " + this.paginas[i].titulo);
    		} else {
    			System.out.println("Nenhum resultado encontrado");
    		}
    	}     
    }

    public void preencheFormulario() {
    	System.out.println("Formulário : ");
    	for(int i=1; i<this.formularioContato.campos.length;i++) {
    		Scanner read = new Scanner(System.in);
    		System.out.println(this.formularioContato.campos[i] + ": ");
    		String leitura = read.next();
    		if(this.formularioContato.campos[i].equals("nome")) {
    			this.nome = leitura;
    		}else if(this.formularioContato.campos[i].equals("email")){
    			this.email = leitura;
    		}else if(this.formularioContato.campos[i].equals("telefone")){
    			this.telefone=leitura;
    		}else if(this.formularioContato.campos[i].equals("cargo")){
    			this.cargo = leitura;
    		}else if(this.formularioContato.campos[i].equals("empresa")){
    			this.cargo = leitura;
    		}
    		
    	}
    	
    }
    
    public void show() {
    	// mostra atributos do usuário no console
		System.out.println("id: " + this.id);
		System.out.println("nome: " + this.nome);
		System.out.println("email: " + this.email);
		System.out.println("telefone: " + this.telefone);
		System.out.println("cargo: " + this.cargo);
		System.out.println("empresa: " + this.empresa);
		
    }
    
    public void enviaMensagem(String msg) {
    	// envia mensagem em forma de String para o site associado
        this.chat.historico += "\n" + this.nome + ": " + msg;
    }
}
