package funcionalidades;

import java.sql.Date;
import java.util.Scanner;

public class methodsTest {

	public static void main(String[] args) {
		// Esse é um programa teste percorre um fluxo normal de utilização do website da salesforce com nossa aplicação de acessibilidade
		// As mudanças de estado dos elementos visuais do site serão representadas de por variáveis em Java. Elas não necessariamnete serão usadas no programa final
		
		// instancia de usuário
		String id = "1";
	    String nome = "João";
	    String email = "jo@ao.com";
	    String telefone = "99999-8888";
	    String cargo = "Analista Júnior";
	    String empresa = "Apple";
	    
		String formID = "1";
	    String[] campos = {"id", "nome", "email", "telefone", "cargo", "empresa"};
	    FormularioContato formularioContato = new FormularioContato(formID, campos);
	    
	    // Cria cookies
	    String cookieId = "1";
	    String cookieNome = "CookiesPermissoes";
	    String dominio = "https://www.salesforce.com/";
	    String dataExpira = "22/10/2023";
	    boolean preferencias = true;
	    boolean estatistica = true;
	    boolean marketing = false;
	    Cookie cookie = new Cookie(cookieId, cookieNome, dominio, dataExpira, preferencias,estatistica,marketing);
		

	    // Cria chat
		String chatId = "1";
	    String modo = "bot";
	    String disponibilidade = "atendenteDisponivel";
	    Date dataInicio = new Date(0);
	    String historico = "";
	    boolean ativo = true;
	    Chat chat = new Chat(chatId, modo, disponibilidade, dataInicio, historico, ativo);
	    
	    // Cria Atendente
		String atendenteId = "1";
	    String atendenteNome = "Luana";
	    String dataNascimento = "02/02/1999";
	    String atendenteTelefone = "91234-5678";
	    String atendenteEmail = "lu@ana.com";
	    Chat chats = chat;
	    FormularioContato[] formulariosContato = {formularioContato};
	    Atendente atendente = new Atendente(atendenteId, atendenteNome, dataNascimento, atendenteTelefone, atendenteEmail, chat, formulariosContato);
	    
	    
	    // Cria pagina index.html
	    
		String pageId = "1";
	    String url = "/index.html";
	    String titulo = "Página Inicial";
	    String conteudo = "Experimente o Salesforce gratuitamente. Não é necessário cartão de crédito nem instalação de software.";
	    String estilo = "";
	    String linguagem = "pt-br";
	    Pagina pagina = new Pagina(pageId, url, titulo, conteudo, estilo, null, linguagem);
	    Pagina[] paginas = {pagina};
	    
	    // Cria página contendo o formulário de contato
		String pageId2 = "2";
	    String url2 = "/form.html";
	    String titulo2 = "Formulário de contato";
	    String conteudo2 = "Inscreva-se para começar sua avaliação gratuita.\r\n"
	    		+ "Preencha o formulário abaixo e em breve entraremos em contato sobre seu teste gratuito.";
	    String estilo2 = "";
	    String linguagem2 = "pt-br";
	    Pagina pagina2 = new Pagina(pageId, url, titulo, conteudo, estilo, null, linguagem);
	    Pagina[] paginas2 = {pagina};
	    
	    
	    // Preferências acessibilidade
	    String accessibilidadeId = "1";
	    boolean daltonismo = false;
	    boolean altoContraste = false;
	    boolean linksSublinhados = false;
	    boolean modoDislexia = false;
	    PreferenciasAcessibilidade preferenciasAcessibilidade = new PreferenciasAcessibilidade(accessibilidadeId, daltonismo, altoContraste, linksSublinhados, modoDislexia, paginas);
	    
	    // Cria usuário
	    Usuario usuario = new Usuario(id, nome, email, telefone, cargo, empresa, formularioContato, cookie, preferenciasAcessibilidade, chat, paginas, atendente);
	    
	    // Início dos testes
	    System.out.printf("Testes das classes e métodos: \n");
	    
	    // Conscentimento dos cookies:
	    usuario.cookie.recebeInfo();
	    usuario.cookie.show();
	    
	    // Preferências de acessibilidade:
	    usuario.preferenciasAcessibilidade.recebeInfo();
	    usuario.preferenciasAcessibilidade.updatePagina();
	    
	    // Usuário faz pesquisa em páginas
	    Scanner read = new Scanner(System.in);
	    System.out.println("Faça uma pesquisa: ");
	    String procura = read.next();
	    usuario.fazPesquisa(procura);
	    
	    // Usuário preenche formulário para contato
	    usuario.preencheFormulario();
	    usuario.show();
	    
	    // Interação com chat e atendente
	    System.out.println("Digite algo no chat: ");
	    String leitura = read.next();
	    usuario.enviaMensagem(leitura);
	    atendente.enviaMensagem("Oiii, aguarde um momento e já vou te responder. Obrigado pelo contato!");
	    chat.display();
	    
	    // Fim dos testes do programa
	    System.out.printf("\n\nFinalização dos testes do programa!");
	}

}
