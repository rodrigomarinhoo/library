package org.itstep.livraria;

import java.util.Date;

public class Emprestimo {

	Date emprestimo;
	Date devolucao;
	int numeroDoCliente;
	int numeroDoLivro;
	int codigoDoEmprestimo;

	public Emprestimo() {

	}

	public Emprestimo(int numeroDoCliente, int numeroDoLivro, Date emprestimo, Date devolucao , int codigoDoEmprestimo) {
		this.numeroDoCliente = numeroDoCliente;
		this.numeroDoLivro = numeroDoLivro;
		this.emprestimo = emprestimo;
		this.devolucao = devolucao;
		this.codigoDoEmprestimo = codigoDoEmprestimo;
	}

	public Date getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Date emprestimo) {
		this.emprestimo = emprestimo;
	}

	public Date getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Date devolucao) {
		this.devolucao = devolucao;
	}

}
