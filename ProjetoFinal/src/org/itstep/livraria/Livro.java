package org.itstep.livraria;

import java.util.Date;


public class Livro {

	private String nome;
	private String autor;
	private String editor;
	private Date dtPublicacao;
	private int codigoLivro;
	
	public Livro() {
		
	}
	
	
	
	public Livro(String nome, String autor, String editor, Date dtPublicacao , int codigoLivro) {
		
		this.nome = nome;
		this.autor = autor;
		this.editor = editor;
		this.dtPublicacao = dtPublicacao;
		this.codigoLivro = codigoLivro;
		
		
	}
	
	
	
	
	
	
	
	public int getCodigoLivro() {
		return codigoLivro;
	}



	public void setCodigoLivro(int codigoLivro) {
		this.codigoLivro = codigoLivro;
	}



	public Date getDtPublicacao() {
		return dtPublicacao;
	}



	public void setDtPublicacao(Date dtPublicacao) {
		this.dtPublicacao = dtPublicacao;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}



	
	
	
}
