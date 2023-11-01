package funcionalidades;
import java.util.Scanner;

public class cadastro {

	public static void main(String[] args) {
		// cadastro, exclusão e remoção de usuários
		
		boolean end = false;
		int option;
		Scanner read = new Scanner(System.in);
		
		// loop principal
		while(end == false) {
			System.out.println(""
					+ "Menu de Cadastro do usuários:\n"
					+ "1 - Crie um usuário novo\n"
					+ "2 - Exiba os usuários cadastrados\n"
					+ "3 - Remova um usário\n"
					+ "4 - Encerrar programa\n"
					+ "\n"
					+ "Digite o número do item que você deseja executar: ");
			option = read.nextInt();
			
			if(option == 1) {
				
			}
			else if(option == 2) {
				
			}
			else if(option == 3) {
				
			}
			else if(option == 4)
				end = true;
		}
		
		
	}

}
