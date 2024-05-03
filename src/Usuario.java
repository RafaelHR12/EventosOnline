import java.util.ArrayList;

public class Usuario extends Evento {

	private String nome;
	private static ArrayList<Evento> eventosRegistrados = new ArrayList<>();

	public Usuario(String tituloEvento, String data, String localizacao, String descricao, String nome) {
		super(tituloEvento, data, localizacao, descricao);
		this.nome = nome;
	}

	public static void registrarEvento(Evento evento) {
		eventosRegistrados.add(evento);
	}

	public String informacoesEventos() {
		return "Nome do usuário que cadastrou o evento: " + getNome();
	}

	public static void getEventosRegistrados() {
		if (eventosRegistrados.isEmpty()) {
			System.out.println("\nNão há Eventos registrados no momento.");
		} else {
			System.out.println("\nLista de Eventos Disponíveis: \n");
			for (Evento evento : eventosRegistrados) {
				System.out.println(evento.informacoesEventos());
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public boolean setNome(String nome) {
		if (nome.length() > 2) {
			this.nome = nome;
			return true;
		} else {
			return false;
		}
	}
}
