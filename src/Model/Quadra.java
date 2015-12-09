package Model;

import java.util.Set;

public class Quadra {
	
	private String tipo;
	private String local;
	private Double valor;
	private Set<Byte> imagens;
	
	public Quadra(String tipo, String local, Double valor, Set<Byte> imagens) {
		super();
		this.tipo = tipo;
		this.local = local;
		this.valor = valor;
		this.imagens = imagens;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Set<Byte> getImagens() {
		return imagens;
	}

	public void setImagens(Set<Byte> imagens) {
		this.imagens = imagens;
	}

}
