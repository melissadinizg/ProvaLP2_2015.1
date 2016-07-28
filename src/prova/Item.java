package prova;

public class Item {
	private String nome;
	private double peso;
	private int efeito;
	private String tipo;

	public Item(String nome, double peso, int efeito, String tipo) {
		this.efeito = efeito;
		this.nome = nome;
		this.peso = peso;
		this.tipo = tipo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the efeito
	 */
	public int getEfeito() {
		return efeito;
	}

	/**
	 * @param efeito the efeito to set
	 */
	public void setEfeito(int efeito) {
		this.efeito = efeito;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
