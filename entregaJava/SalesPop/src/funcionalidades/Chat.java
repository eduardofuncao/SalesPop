package funcionalidades;

import java.sql.Date;

public class Chat {
	private String id;
    private String modo;
    private String disponibilidade;
    private Date dataInicio;
    private String[] historico;
    private boolean ativo;
    
    public Chat() {
	
    }
    
    public Chat(String id, String modo, String disponibilidade, Date dataInicio, String[] historico, boolean ativo) {
		this.id = id;
		this.modo = modo;
		this.disponibilidade = disponibilidade;
		this.dataInicio = dataInicio;
		this.historico = historico;
		this.ativo = ativo;
	}



	public void display() {
        // Implementação do método
    }

    public void fluxobot() {
        // Implementação do método
    }

    public void liveChat() {
        // Implementação do método
    }
}

