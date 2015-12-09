package Model;

import java.util.Date;
import java.util.Set;

public class Partida {

	private Date duracao;
	private Date data;
	private Quadra quadra;
	private Set<Time> times;
	
	public Partida(Date duracao, Date data, Quadra quadra, Set<Time> times) {
		super();
		this.duracao = duracao;
		this.data = data;
		this.quadra = quadra;
		this.times = times;
	}

	public Date getDuracao() {
		return duracao;
	}

	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Quadra getQuadra() {
		return quadra;
	}

	public void setQuadra(Quadra quadra) {
		this.quadra = quadra;
	}

	public Set<Time> getTimes() {
		return times;
	}

	public void setTimes(Set<Time> times) {
		this.times = times;
	}
	
}
