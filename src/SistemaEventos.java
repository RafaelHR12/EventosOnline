import java.util.ArrayList;

public class SistemaEventos extends Evento {

	private static ArrayList<Evento> eventosRegistrados = new ArrayList<>();

	public SistemaEventos(String tituloEvento, String data, String localizacao, String descricao) {
		super(tituloEvento, data, localizacao, descricao);
	}

	public String informacoesEventos() {
		return "Nome do Evento: " + getTituloEvento() + "\n" + "Data do Evento: " + getData()
				+ "\nLocalização do Evento: " + getLocalizacao() + "\n" + "Descrição do Evento: " + getDescricao();
	}

	public static void adicionarEvento(Evento evento) {
		eventosRegistrados.add(evento);
	}

	public static void getEventos() {
		if (eventosRegistrados.isEmpty()) {
			System.out.println(" ");
		} else {
			for (Evento evento : eventosRegistrados) {
				System.out.println(evento.informacoesEventos() + "\n");
			}
		}
	}
}
