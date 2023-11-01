package funcionalidades;
import java.util.ArrayList;
import java.util.Scanner;

public class cadastro {

	public static void main(String[] args) {
		//TODO criar método para mostrar somente id e nome
		
		// cadastro, exclusão e remoção de usuários
		
		boolean end = false;
		int option;
		int id = 0;
		Scanner read = new Scanner(System.in);
		ArrayList<Usuario> users = new ArrayList<Usuario>();
		
		// loop principal
		while(end == false) {
			System.out.println(""
					+ "\nMenu de Cadastro do usuários:\n"
					+ "1 - Crie um usuário novo\n"
					+ "2 - Exiba os usuários cadastrados\n"
					+ "3 - Remova um usário\n"
					+ "4 - Encerrar programa\n"
					+ "\n"
					+ "Digite o número do item que você deseja executar: ");
			option = read.nextInt();
			
			if(option == 1) {
				Usuario usuarioAtual = new Usuario();
				id += 1;
				usuarioAtual.setId(String.valueOf(id));
				
				System.out.println("Criação de novo usuário: ");
				System.out.println("Nome do usuário: ");
				usuarioAtual.setNome(read.next());
				System.out.println("Email do usuário: ");
				usuarioAtual.setEmail(read.next());
				System.out.println("Telefone do usuário: ");
				usuarioAtual.setTelefone(read.next());
				System.out.println("Cargo do usuário: ");
				usuarioAtual.setCargo(read.next());
				System.out.println("Empresa do usuário: ");
				usuarioAtual.setEmpresa(read.next());
				
				System.out.printf("\nUsuário cadastrado!\n");
				usuarioAtual.show();
				users.add(usuarioAtual);
			}
			
			else if(option == 2) {
				String detailsChoice;
				String idChoice;
				int indexChoice = -1;
				for(Usuario user : users) {
					System.out.printf("ID: " + user.getId());
					System.out.printf(" - Nome: " +  user.getNome() + "\n");
				}
				System.out.printf("Gostaria de obter informções detalhadas de algum desses usuários? [S ou N]");
				detailsChoice = read.next();
				if(detailsChoice.toUpperCase().equals("S")) {
					System.out.printf("De qual usuário? [escolha pelo ID]");	
					idChoice = read.next();
					for(Usuario user: users) {
						if(user.getId().equals(idChoice)) {
							indexChoice = users.indexOf(user);
						}
					}
					if(indexChoice != -1)
						users.get(indexChoice).show();
					else
						System.out.printf("Usuário não encontrado");
				}
			
			}
			else if(option == 3) {
				String idRemove;
				int indexRemove = -1;
				for(Usuario user : users) {
					System.out.printf("ID: " + user.getId());
					System.out.printf(" - Nome: " +  user.getNome() + "\n");
				}
				System.out.printf("Escolha um usuário para remover: ");
				idRemove = read.next();
				for(Usuario user : users) {
					if (user.getId().equals(idRemove)) {
						indexRemove = users.indexOf(user);
						break;
					}
				}
				if(indexRemove != -1) {
					users.remove(indexRemove);
					System.out.printf("\nCliente removido!");
				}
				else {
					System.out.printf("\nCliente não encontrado");
				}
				
			}
			else if(option == 4)
				end = true;
		}
		
		
	}

}
