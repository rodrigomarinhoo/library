package org.itstep.livraria;

public class Biblioteca {

	private int andar;
	private String secao;
	private String estante;
	private int posicaoEstante;
	
	
	Biblioteca(){
		
	}
	
	Biblioteca(int andar, String secao, String estante, int posicaoEstante){
		this.andar = andar;
		this.secao = secao;
		this.estante = estante;
		this.posicaoEstante = posicaoEstante;
		
	}
	


	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public String getEstante() {
		return estante;
	}

	public void setEstante(String estante) {
		this.estante = estante;
	}

	public int getPosicaoEstante() {
		return posicaoEstante;
	}

	public void setPosicaoEstante(int posicaoEstante) {
		this.posicaoEstante = posicaoEstante;
	}

}
