
public class Evento {

	private String tituloEvento;
	private String data;
	private String localizacao;
	private String descricao;

	public Evento(String tituloEvento, String data, String localizacao, String descricao) {
		this.tituloEvento = tituloEvento;
		this.data = data;
		this.localizacao = localizacao;
		this.descricao = descricao;
	}

	public String informacoesEventos() {
		return null;
	}

	public String getTituloEvento() {
		return tituloEvento;
	}

	public boolean setTituloEvento(String tituloEvento) {
		if (tituloEvento.length() > 6 && tituloEvento.contains(" ")) {
			this.tituloEvento = tituloEvento;
			return true;
		} else {
			return false;
		}
	}

	public String getData() {
		return data;
	}

	public boolean setData(String data) {
		if (data.length() == 8) {
			this.data = data;
			return true;
		} else {
			return false;
		}
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public boolean setLocalizacao(String localizacao) {
		if (localizacao.contains(" ")) {
			this.localizacao = localizacao;
			return true;
		} else {
			return false;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean setDescricao(String descricao) {
		if (descricao != null) {
			this.descricao = descricao;
			return true;
		} else {
			return false;
		}
	}

}
