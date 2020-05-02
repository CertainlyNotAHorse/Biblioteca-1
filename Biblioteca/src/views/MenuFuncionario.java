package views;

import utils.Console;

public class MenuFuncionario {

	public static void renderizar() {

		int opcao;
		do {
			System.out.println("\n ---------- MENU FUNCIONÁRIO ---------- \n");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("3 - Cadastrar funcionário");
			System.out.println("4 - Listar funcionários");
			System.out.println("5 - Cadastrar livro");
			System.out.println("6 - Acervo");
			System.out.println("0 - Voltar para menu principal");
			opcao = Console.readInt("\nDigite uma opção: ");
			
			switch (opcao) {
			case 1:
				CadastrarCliente.renderizar();				
				break;
			case 2:
				ListarClientes.renderizar();
				break;
			case 3:
				CadastrarFuncionario.renderizar();
				break;
			case 4:
				ListarFuncionarios.renderizar();
				break;
			case 5:
				CadastrarLivro.renderizar();
				break;
			case 6:
				Acervo.renderizar();
				break;
			case 9:
				
				break;
			case 0:
				System.out.println("\nRetornando ao menu principal");
				break;
			default:
				System.out.println("\n -- OPÇÃO INVÁLIDA ! -- \n");
				break;
			}

		} while (opcao != 0);

	}

}
