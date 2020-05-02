package views;

import utils.Console;

public class Principal {

	public static void main(String[] args) {
		
		
		
		int opcao;
		do {
			System.out.println("\n ----------- MENU PRINCIPAL -----------\n ");
			System.out.println("1 - Menu Cliente");
			System.out.println("2 - Menu Funcionário");
			//System.out.println("8 - Listar empréstimos");
			System.out.println("0 - Sair");
			opcao = Console.readInt("\nDigite a opção escolhida: ");
			
			switch (opcao) {
			case 1:	
				MenuCliente.renderizar();
				break;
			case 2:
				MenuFuncionario.renderizar();
				break;
/*			case 8:
*				LivrosEmprestados.renderizar(
				aDAO.retornarVendas());
*				break;
*			case 9:
*				String cpf = Console.readString("Digite o CPF do cliente: ");
*				ListarVendas.renderizar(VendaDAO.retornarVendasPorCliente(cpf));
*				break;*/
			case 9:
				MenuCliente.renderizar();
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\n -- OPÇÃO INVÁLIDA!!! --\n ");
				break;
			}
			
		} while (opcao != 0);
		
	}
}
