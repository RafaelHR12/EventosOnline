import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1- Registrar/Adicionar evento." + "\n2- Mostrar todos os evento." + "\n3- Sair.");
			int escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				registrarEvento(sc);
				break;
			case 2:
				Usuario.getEventosRegistrados();
				SistemaEventos.getEventos();
				break;
			case 3:
				System.out.println("Saindo...");
				return;
			default:
				System.out.println("\nOpção inválida. Por favor, selecione novamente. \n");
				break;
			}
		}
	}

	private static void registrarEvento(Scanner sc) {
		Evento evento = new Evento(null, null, null, null);
		Usuario usuario = new Usuario(null, null, null, null, null);

		System.out.println("Informe o Nome do Evento: ");
		sc.nextLine();
		String tituloEvento = sc.nextLine();

		while (!evento.setTituloEvento(tituloEvento)) {
			System.out.println("Informe o Nome do Evento novamente: ");
			tituloEvento = sc.nextLine();
		}

		System.out.println("Informe a Data do Evento (DD/MM/AAAA e SOMENTE OS NÚMEROS): ");
		String data = sc.nextLine();

		while (!evento.setData(data)) {
			System.out.println("Informe a Data do Evento (DD/MM/AAAA e SOMENTE OS NÚMEROS) novamente: ");
			data = sc.nextLine();
		}

		System.out.println("Informe a Localização do Evento: ");
		String localizacao = sc.nextLine();

		while (!evento.setLocalizacao(localizacao)) {
			System.out.println("Informe a Localização do Evento novamente: ");
			localizacao = sc.nextLine();
		}

		System.out.println("Informe a Descrição do Evento: ");
		String descricao = sc.nextLine();

		while (!evento.setDescricao(descricao)) {
			System.out.println("Informe a Descrição do Evento novamente: ");
			descricao = sc.nextLine();
		}

		System.out.println("Informe o Nome do Usuário que cadastrou o evento: ");
		String nomeUsuario = sc.nextLine();

		while (!usuario.setNome(nomeUsuario)) {
			System.out.println("Informe o Nome do Usuário que cadastrou o evento novamente: ");
			nomeUsuario = sc.nextLine();
		}

		Usuario.registrarEvento(new Usuario(tituloEvento, data, localizacao, descricao, nomeUsuario));
		SistemaEventos.adicionarEvento(new SistemaEventos(tituloEvento, data, localizacao, descricao));

	}

}
