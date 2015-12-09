package Model;

public class Usuario {
	private int id;
	private String nome;
	private long cpf;
	private int idade;
	private int pontos;
	private String senha;
	
	public Usuario() {
		super();
	}

	public Usuario(int id, String nome, long cpf, int idade, int pontos, String senha) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.pontos = pontos;
		this.senha = senha;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public long getCpf() {
		return cpf;
	}

	/**
	 * @param l
	 *            the cpf to set
	 */
	public void setCpf(long l) {
		this.cpf = l;
	}

	/**
	 * @return the dataNascimento
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param dataNascimento
	 *            the dataNascimento to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the pontos
	 */
	public int getPontos() {
		return pontos;
	}

	/**
	 * @param pontos
	 *            the pontos to set
	 */
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha
	 *            the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}
