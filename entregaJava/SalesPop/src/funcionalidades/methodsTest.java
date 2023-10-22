package funcionalidades;

import java.sql.Date;

public class methodsTest {

	public static void main(String[] args) {
		
		String id = "1";
	    String nome = "João";
	    String email = "jo@ao.com";
	    String telefone = "99999-8888";
	    String cargo = "Analista Júnior";
	    String empresa = "Apple";
	    
		String formID = "1";
	    String[] campos = {"id", "nome", "email", "telefone", "cargo", "empresa"};
	    FormularioContato formularioContato = new FormularioContato(formID, campos);
	    
	    PreferenciasAcessibilidade preferenciasAcessibilidade;
	    
	    
	    Atendente atendente;
	    
	    
	    // Cria cookies
	    String cookieId = "1";
	    String cookieNome = "CookiesPermissoes";
	    String dominio = "https://www.salesforce.com/";
	    String dataExpira = "22/10/2023";
	    boolean preferencias = true;
	    boolean estatistica = true;
	    boolean marketing = false;
	    Cookie cookie = new Cookie(cookieId, cookieNome, dominio, dataExpira, preferencias,estatistica,marketing);
		
	    
	    // Preferências acessibilidade
	    
	    
	    // Cria chat
		String chatId = "1";
	    String modo = "bot";
	    String disponibilidade = "atendenteDisponivel";
	    Date dataInicio = new Date(0);
	    String[] historico = {};
	    boolean ativo = true;
	    Chat chat = new Chat(chatId, modo, disponibilidade, dataInicio, historico, ativo);
	    
	    // Cria pagina index.html
	    
		String pageId = "1";
	    String url = "/index.html";
	    String titulo = "Página Inicial";
	    String conteudo = "placeholder para conteúdo da tela. aqui vamos ter o conteúdo para a página inicial";
	    String estilo = "/main.css";
	    String linguagem = "pt-br";
	    Pagina pagina = new Pagina(pageId, url, titulo, conteudo, estilo, null, linguagem);
	    
	    
	}

}
