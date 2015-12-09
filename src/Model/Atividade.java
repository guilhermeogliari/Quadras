package Model;

public class Atividade {

	private int gols;
	private int faltas;
	private int cartoesAmarelos;
	private boolean cartaoVermelho;
	private Usuario usuario;
	private Partida partida;
	
	public Atividade(int gols, int faltas, int cartoesAmarelos, boolean cartaoVermelho, Usuario usuario,
			Partida partida) {
		super();
		this.gols = gols;
		this.faltas = faltas;
		this.cartoesAmarelos = cartoesAmarelos;
		this.cartaoVermelho = cartaoVermelho;
		this.usuario = usuario;
		this.partida = partida;
	}

	public int getGols() {
		return gols;
	}

	public void setGols(int gols) {
		this.gols = gols;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public int getCartoesAmarelos() {
		return cartoesAmarelos;
	}

	public void setCartoesAmarelos(int cartoesAmarelos) {
		this.cartoesAmarelos = cartoesAmarelos;
	}

	public boolean isCartaoVermelho() {
		return cartaoVermelho;
	}

	public void setCartaoVermelho(boolean cartaoVermelho) {
		this.cartaoVermelho = cartaoVermelho;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}
	
}
