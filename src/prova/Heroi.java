package prova;

import java.util.ArrayList;

public class Heroi {

	private String nome;
	private Item item;
	private Mochila mochila;

	private double pesoMochila;
	private int HP;
	private int dano;
	private int cura;

	public Heroi(String nome, double pesoMochila) {
		this.nome = nome;
		this.pesoMochila = pesoMochila;
		this.mochila = new Mochila();
		this.HP = 100;
	}

	public boolean criaItem(String nome, double peso, int efeito, String tipo) {
		if (peso > getPesoMochila()) {
			return false;
		} else {
			item = new Item(nome, peso, efeito, tipo);
			if (tipo.equals("Arma")) {
				dano = dano + efeito;
			} else {
				cura = cura + efeito;
			}
			mochila.adicionaItemMochila(item);
			return true;
		}

	}

	public boolean cura() {
		int total = 100 - getHP();
		
		if (getHP() > 0) {
			setHP(total+getHP());
			return false;
			
		}else if (-10 < getHP() && getHP() == 0) {
			
			setHP(total+getHP());
			return true;
			
		}else{
			return false;
		}
		
	}

	public String ataca(Heroi heroi) {
		int hpAtual = 0;

		hpAtual = heroi.getHP() - dano;
		heroi.setHP(hpAtual);

		if (heroi.getHP() > 0) {
			return heroi.getNome() + " ainda tem " + heroi.getHP() + " de vida.";
		} else if (-10 < heroi.getHP() && heroi.getHP() == 0) {
			return heroi.getNome() + " demasiou, mas ainda pode ser curado.";
		} else {
			return heroi.getNome() + " desmaiou sem chances de voltar com pocao.";
		}

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
	 * @return the pesoMochila
	 */
	public double getPesoMochila() {
		return pesoMochila;
	}

	/**
	 * @param pesoMochila
	 *            the pesoMochila to set
	 */
	public void setPesoMochila(double pesoMochila) {
		this.pesoMochila = pesoMochila;
	}

	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * @param item
	 *            the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}

	/**
	 * @return the mochila
	 */
	public Mochila getMochila() {
		return mochila;
	}

	/**
	 * @param mochila
	 *            the mochila to set
	 */
	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}

	/**
	 * @return the hp
	 */
	public int getHP() {
		return HP;
	}

	/**
	 * @param hp
	 *            the hp to set
	 */
	public void setHP(int HP) {
		this.HP = HP;
	}

}
