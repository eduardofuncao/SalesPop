package funcionalidades;

public class FormularioContato {
	public String formID;
    public String[] campos;
    
    public FormularioContato() {
	
    }
    
    public FormularioContato(String formID, String[] campos) {
		this.formID = formID;
		this.campos = campos;
	}
    
    public void exibeCampos() {
    	// exibe todos os campos do formulário
    	for(int i =0; i<campos.length; i++) {
    		System.out.println("Campo " + (i+1) + " do formulário");
    	}
    }

}
