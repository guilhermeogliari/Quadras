package Model;

import java.util.Date;

public class Comentario {

	private String texto;
	private Date dataHora;
	private Boolean visivel;
	private Partida partida;
	private Usuario usuario;
	
	public Comentario(String texto, Date dataHora, Boolean visivel, Partida partida, Usuario usuario) {
		super();
		this.texto = texto;
		this.dataHora = dataHora;
		this.visivel = visivel;
		this.partida = partida;
		this.usuario = usuario;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Boolean getVisivel() {
		return visivel;
	}

	public void setVisivel(Boolean visivel) {
		this.visivel = visivel;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
