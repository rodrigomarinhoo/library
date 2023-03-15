package org.itstep.livraria;

import java.util.Date;

public class Cliente {

	private int codigo;
	private String nome;
	private Date dtNascimento;

	public static int contadorCliente = 0;

	public Cliente() {

	}

	public Cliente(int codigo, String nome, Date dtNascimento) {

		this.codigo = codigo;
		this.nome = nome;
		this.dtNascimento = dtNascimento;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public void Cliente(String Nome) {
		this.setNome(Nome);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDtnascimento(Date DtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public static int getContadorCliente() {
		return contadorCliente;
	}

	public static void setContadorCliente(int contadorCliente) {
		Cliente.contadorCliente = contadorCliente;
	}

}
