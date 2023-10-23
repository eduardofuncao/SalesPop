package funcionalidades;

import java.util.Scanner;

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
		Scanner read = new Scanner(System.in);
	    System.out.println("Nós usamos cookies e outras tecnologias semelhantes para melhorar a sua experiência em nossos serviços.");
	    System.out.println("Você aceita o uso de cookies para coleta de estatísticas sobre o uso do site?");
	    String resposta = read.next();
	    if (resposta.toUpperCase().equals("S")) {
	    	this.estatistica = true;
	    	System.out.println("Cookies de estatística aceitos");
	    } else {
	    	this.estatistica = false;
	    	System.out.println("Cookies de estatística recusados");
	    }
	    System.out.println("Você aceita o uso de cookies para coleta de dados para marketing?");
	    String resposta1 = read.next();
	    if (resposta1.toUpperCase().equals("S")) {
	    	this.marketing = true;
	    	System.out.println("Cookies de marketing aceitos");
	    } else {
	    	this.marketing = false;
	    	System.out.println("Cookies de marketing recusados");
	    }
	    System.out.println("Você aceita o uso de cookies para salvar preferências de acessibilidade?");
	    String resposta2 = read.next();
	    if (resposta2.toUpperCase().equals("S")) {
	    	this.preferencias = true;
	    	System.out.println("Cookies de preferências aceitos");
	    } else {
	    	this.preferencias = false;
	    	System.out.println("Cookies de preferências recusados");
	    }
	}

    public void show() {
    	// imprime no console os dados a respeito dos cookies
    	System.out.println("Preferências de cookies:");
    	System.out.printf("\nCookies de estatísticas de uso: ");
    	if(this.estatistica == true)
    		System.out.printf("aceito");
    	else
    		System.out.printf("recusado");
    			
    	System.out.printf("\nCookies de marketing: ");
    	if(this.marketing == true)
    		System.out.printf("aceito");
    	else
    		System.out.printf("recusado");
    	
    	System.out.printf("\nCookies de acessibilidade: ");
    	if(this.preferencias == true)
    		System.out.printf("aceito");
    	else
    		System.out.printf("recusado");
    	
    	System.out.println("\nCookies do domínio: " + this.dominio + ", expirando em " + this.dataExpira);
    	
    }
}
