package funcionalidades;

import java.util.Scanner;

public class PreferenciasAcessibilidade {
	private String id;
    private boolean daltonismo;
    private boolean altoContraste;
    private boolean linksSublinhados;
    public Pagina[] paginas;
    
    public PreferenciasAcessibilidade() {
	
    }
    
    
    
    public PreferenciasAcessibilidade(String id, boolean daltonismo, boolean altoContraste,
			boolean linksSublinhados, boolean modoDislexia, Pagina[] page) {
		this.id = id;
		this.daltonismo = daltonismo;
		this.altoContraste = altoContraste;
		this.linksSublinhados = linksSublinhados;
		this.paginas = page;
	}



	public void recebeInfo() {
		// recebe informações de acessibilidade para o site do usuário
		Scanner read = new Scanner(System.in);
		System.out.println("Usuário é daltônico?");
	    String resposta = read.next();
	    if (resposta.toUpperCase().equals("S")) {
	    	this.daltonismo = true;
	    	System.out.println("Modo para daltonismo habilitado");
	    } else {
	    	this.daltonismo = false;
	    	System.out.println("Modo para daltonismo desabilitado");
	    }
	    
		System.out.println("Você gostaria de habilitar o modo de alto contraste?");
	    String resposta1 = read.next();
	    if (resposta1.toUpperCase().equals("S")) {
	    	this.daltonismo = true;
	    	System.out.println("Modo alto contraste habilitado");
	    } else {
	    	this.daltonismo = false;
	    	System.out.println("Modo alto contraste desabilitado");
	    }
	    
		System.out.println("Você gostaria que todos os links sejam sublinhados?");
	    String resposta2 = read.next();
	    if (resposta2.toUpperCase().equals("S")) {
	    	this.daltonismo = true;
	    	System.out.println("Todos os links subinhados");
	    } else {
	    	this.daltonismo = false;
	    	System.out.println("Links mantidos em seu estado original");
	    }
    }

    public void updatePagina() {
        // atualiza paginas com a especificação das preferencias definidas
    	if(this.daltonismo == true) {
    		for(int i=0; i<this.paginas.length;i++) {
    			this.paginas[i].estilo = "[class*=\"principal\"]{color: blue;} [class*=\"secundario\"]{color: light-coral;} [class*=\"fundo\"]{color: white;}";
    		}
    	}
    	
    	if(this.linksSublinhados == true) {
    		for(int i=0; i<this.paginas.length;i++) {
    			this.paginas[i].estilo = "a{text-decoration: underline;}";
    		}
    	}
    	
    	if(this.altoContraste == true) {
    		for(int i=0; i<this.paginas.length;i++) {
    			this.paginas[i].estilo = "[class*=\"principal\"]{color: white;} [class*=\"secundario\"]{color: yellow;} [class*=\"fundo\"]{color: black;}";
    		}
    	}
    	
    	System.out.println("Estilo da página atualizado conforme necessidades do usuário");
    }
}	
