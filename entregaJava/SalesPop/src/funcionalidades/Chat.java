package funcionalidades;

import java.sql.Date;

public class Chat {
	public String id;
    public String modo;
    public String disponibilidade;
    public Date dataInicio;
    public String historico;
    public boolean ativo;
    
    public Chat() {
	
    }
    
    public Chat(String id, String modo, String disponibilidade, Date dataInicio, String historico, boolean ativo) {
		this.id = id;
		this.modo = modo;
		this.disponibilidade = disponibilidade;
		this.dataInicio = dataInicio;
		this.historico = historico;
		this.ativo = ativo;
	}



	public void display() {
		// escreve historico do chat no console
        System.out.printf(this.historico);
    }
}

