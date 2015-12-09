package Model;

import java.util.Set;

public class Time {
	
	private String nome;
	private Byte emblema;
	private Set<Usuario> jogadores;
	
	public Time(String nome, Byte emblema, Set<Usuario> jogadores) {
		super();
		this.nome = nome;
		this.emblema = emblema;
		this.jogadores = jogadores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Byte getEmblema() {
		return emblema;
	}

	public void setEmblema(Byte emblema) {
		this.emblema = emblema;
	}

	public Set<Usuario> getJogadores() {
		return jogadores;
	}

	public void setJogadores(Set<Usuario> jogadores) {
		this.jogadores = jogadores;
	}
	
}
