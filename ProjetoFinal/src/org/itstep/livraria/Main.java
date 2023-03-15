package org.itstep.livraria;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Entrada de dados para o menu:
		Scanner entrada = new Scanner(System.in);

		List<Cliente> clientes = new ArrayList<Cliente>();
		List<Biblioteca> listBiblioteca = new ArrayList<Biblioteca>();
		List<Livro> livros = new ArrayList<Livro>();
		List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();


		Date dtNascimento = new Date();
		Date dtPublicacao = new Date();
		Date dtEmprestimo = new Date();
		Date dtDevolucao = new Date();
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

		String dataStr = "";
		boolean menuPrincipal = true;
		boolean mantemData = true;

		do {
			// Menu principal:
			System.out.println(" ____________________________________________");
			System.out.println("|             BEM VINDO A LIVRARIA           |");
			System.out.println("|                      STEP                  |");
			System.out.println("|                                            |");
			System.out.println("| 1 - Cadastrar novo cliente:                |");
			System.out.println("| 2 - Cadastrar novo livro:                  |");
			System.out.println("| 3 - Fazer emprestimo:                      |");
			System.out.println("| 4 - Listar clientes, livro ou emprestimo:  |");
			System.out.println("| 5 - Localizar cliente,livro ou emprestimo: |");
			System.out.println("| 6 - Sair do programa                       |");
			System.out.println("|____________________________________________|");
			System.out.println("|		Selecione uma das opções acima:      |");
			System.out.println("|____________________________________________|");
			int opcMenu = entrada.nextInt();

			switch (opcMenu) {

			case 1:
				// Inserindo dado dos clientes:
				System.out.println();
				System.out.println(" ___________________________ ");
				System.out.println("| Insira o nome do cliente: |");
				System.out.println("|___________________________|");
				String nomeCliente = entrada.next().toUpperCase();

				do {
					System.out.println(" _____________________________");
					System.out.println("| Insira a data de nascimento |");
					System.out.println("|          do cliente:        |");
					System.out.println("|_____________________________|");
					dataStr = entrada.next();

					try {
						dtNascimento = formatador.parse(dataStr);
						mantemData = false;
					} catch (ParseException e) {
						System.out.println(" _________________________________________________");
						System.out.println("|Formato de data inválido, favor usar: dd/MM/aaaa |");
						System.out.println("|_________________________________________________|");
						e.printStackTrace();
						mantemData = true;
					}

				} while (mantemData);

				int contadorCodigo = 0;
				contadorCodigo++;

				Cliente cliente = new Cliente(contadorCodigo, nomeCliente, dtNascimento);
				clientes.add(cliente);
				cliente = null;

				System.out.println(" ____________________ ");
				System.out.println("|Cliente cadastrado! |");
				System.out.println("|____________________|");
				System.out.println("");

				break;

			
			case 2:
				// Inserindo dado dos livros:
				System.out.println();
				System.out.println(" __________________________ ");
				System.out.println("| Insira o nome do livro : |");
				System.out.println("|__________________________|");
				String nomeLivro = entrada.next();

				System.out.println(" __________________________ ");
				System.out.println("| Insira o Autor do livro: |");
				System.out.println("|__________________________|");
				String nomeAutor = entrada.next();

				System.out.println(" ______________________________");
				System.out.println("| Insira a/o Editora do livro: |");
				System.out.println("|______________________________|");
				String nomeEditora = entrada.next();

				do {
					System.out.println(" _____________________________ ");
					System.out.println("| Insira a data da publicação |");
					System.out.println("|           do livro:         |");
					System.out.println("|_____________________________|");
					dataStr = entrada.next();

					try {
						dtPublicacao = formatador.parse(dataStr);
						mantemData = false;
					} catch (ParseException e) {
						System.out.println(" _________________________________________________");
						System.out.println("|Formato de data inválido, favor usar: dd/MM/aaaa |");
						System.out.println("|_________________________________________________|");
						e.printStackTrace();
						mantemData = true;
					}

				} while (mantemData);
				int contadorLivro = 0;
				contadorLivro++;

				Livro livro = new Livro(nomeLivro, nomeAutor, nomeEditora, dtPublicacao, contadorLivro);
				livros.add(livro);
				livro = null;

				System.out.println(" __________________ ");
				System.out.println("|Livro cadastrado! |");
				System.out.println("|__________________|");
				System.out.println("");

				
				 
			/*	 int andarInt = 1;
				 String secaoStr = "1";
				 String estanteStr = "1";
				 int posicaoEstanteInt = contadorLivro;
				
				while(andarInt < 4) {
					if(posicaoEstanteInt > 31) {
						Biblioteca biblioteca = new Biblioteca(andarInt, secaoStr, estanteStr, posicaoEstanteInt);
						listBiblioteca.add(biblioteca);
						biblioteca = null;
						
					}
				}
				
				*/
	
				
				break;

			case 3:
				// Fazendo emprestimo
				System.out.println();
				System.out.println(" _____________________________ ");
				System.out.println("| Insira o código do Cliente  |");
				System.out.println("|_____________________________|");
				int addCliente = entrada.nextInt();
				Cliente inserirCliente = clientes.get(addCliente - 1);

				System.out.println(" _____________________________ ");
				System.out.println("| Insira o código do Livro    |");
				System.out.println("|_____________________________|");
				int addLivro = entrada.nextInt();
				Livro inserirLivro = livros.get(addLivro - 1);

				do {
					System.out.println(" _____________________________ ");
					System.out.println("| Insira a data de empréstimo |");
					System.out.println("|           do livro:         |");
					System.out.println("|_____________________________|");
					String emprestimo = entrada.next();

					try {
						dtEmprestimo = formatador.parse(emprestimo);
						mantemData = false;
					} catch (ParseException e) {
						System.out.println(" _________________________________________________");
						System.out.println("|Formato de data inválido, favor usar: dd/MM/aaaa |");
						System.out.println("|_________________________________________________|");
						e.printStackTrace();
						mantemData = true;
					}
				} while (mantemData);

				do {
					System.out.println(" _____________________________ ");
					System.out.println("| Insira a data de devolução  |");
					System.out.println("|          do livro:          |");
					System.out.println("|_____________________________|");
					String devolucao = entrada.next();

					try {
						dtDevolucao = formatador.parse(devolucao);
						mantemData = false;
					} catch (ParseException e) {
						System.out.println(" _________________________________________________");
						System.out.println("|Formato de data inválido, favor usar: dd/MM/aaaa |");
						System.out.println("|_________________________________________________|");
						e.printStackTrace();
						mantemData = true;
					}

				} while (mantemData);

				int contaEmprestimo = 0;
				contaEmprestimo++;
				System.out.println(" _________________________________________ ");
				System.out.println("|          RECIBO DE EMPRÉSTIMO           |");
				System.out.println("|                                         |");
				System.out.println("|Cliente: " + inserirCliente.getNome() + "                               |");
				System.out.println("|Livro:" + inserirLivro.getNome() + "                               |");
				System.out.println("|Retirado no dia:" + formatador.format(dtEmprestimo) + "               |");
				System.out.println("|Entregar no dia:" + formatador.format(dtDevolucao) + "               |");
				System.out.println("|__________________________________________|");
				System.out.println("");

				Emprestimo emprestimo = new Emprestimo(addCliente, addLivro, dtEmprestimo, dtDevolucao, contaEmprestimo);
				emprestimos.add(emprestimo);
				emprestimo = null;

				break;
			
			case 4:
				// Opção de listar, caso o usuário queira buscar todos os emprestimos feitos em
				// um só dia

				System.out.println(" _________________________");
				System.out.println("|       OPÇÃO LISTAR      |");
				System.out.println("|                         |");
				System.out.println("| 1 - Listar clientes:    |");
				System.out.println("| 2 - Listar livros:      |");
				System.out.println("| 3 - Listar empréstimos: |");
				System.out.println("|_________________________|");
				int opcListar = entrada.nextInt();

				switch (opcListar) {
				// Listar cliente
				case 1:
					
					for (Cliente c : clientes) {
						int contCliente = 0;
						System.out.println(" _________________________________________");
						System.out.println("|Nome do cliente: " + c.getNome() + "     |");
						System.out.println("|Data de nascimento: " + formatador.format(c.getDtNascimento()) + "     |");
						System.out.println("|Código: " + (contCliente + 1) + "     |");
						System.out.println("|__________________________________________|");
						System.out.println("");
						contCliente++;
					}

					break;

				case 2:
					// Listar livro
					for (Livro l : livros) {
						int contLivro = 0;
						System.out.println(" _________________________________________");
						System.out.println("|Nome do livro: " + l.getNome() + "     |");
						System.out.println("|Autor do livro: " + l.getAutor() + "     |");
						System.out.println("|Editor do livro: " + l.getEditor() + "     |");
						System.out.println("|Data de publicao do livro: " + formatador.format(l.getDtPublicacao()) + "     |");
						System.out.println("|Código do livro: " + (contLivro + 1) + "     |");
						System.out.println("|__________________________________________|");
						System.out.println("");
						contLivro++;
					}

					break;

					
				case 3:
					for(Emprestimo e : emprestimos ) {
						int contaEmprestimo2 = 0;
						Cliente buscarCliente3 = clientes.get(contaEmprestimo2);
						Livro buscarLivro3 = livros.get(contaEmprestimo2);
						
						System.out.println(" _______________________________________ ");
						System.out.println("|Nome do Cliente: " +buscarCliente3.getNome() 	+ ("              |"));
						System.out.println("|Nome do Livro: "   + buscarLivro3.getNome() 	+ ("              |"));
						System.out.println("|Data de retirada: " + formatador.format(e.getEmprestimo())    	    + ("              |"));
						System.out.println("|Data de devolução:" + formatador.format(e.getDevolucao())			+ ("              |"));
						System.out.println("|________________________________________|");
						contaEmprestimo2++;
					}
						
					
					break;
					
				default:
					System.out.println(" _____________________");
					System.out.println("|SELECIONE DE 1 ou 3  |");
					System.out.println("|_____________________|");

					break;
				}

				break;
			
			case 5:
				// Procura determinado cliente ou livro com a chave gerada pelo cadastro
				System.out.println();
				System.out.println(" ___________________________");
				System.out.println("|        OPÇÃO LOCALIZAR    |");
				System.out.println("|                           |");
				System.out.println("| 1 - Localizar clientes:   |");
				System.out.println("| 2 - Localizar livros:     |");
				System.out.println("| 3 - Localizar empréstimo: |");
				System.out.println("|___________________________|");
				int opcProcurar = entrada.nextInt();

				switch (opcProcurar) {

				case 1:
					// Localiza cliente
					System.out.println(" ____________________________");
					System.out.println("|Insira o codigo do cliente: |");
					System.out.println("|____________________________|");
					int localizar = entrada.nextInt();
					Cliente buscarCliente = clientes.get(localizar - 1);

					System.out.println(" ___________________________________ ");
					System.out.println("|Nome: " + buscarCliente.getNome() + "     |");
					System.out.println("|Data de nascimento: " + formatador.format(buscarCliente.getDtNascimento()) + "     |");
					System.out.println("|___________________________________|");
					break;

				case 2:
					// Localiza Livro
					System.out.println(" ____________________________");
					System.out.println("|Insira o codigo do livro:   |");
					System.out.println("|____________________________|");
					int localizarLivro = entrada.nextInt();
					Livro buscarLivro = livros.get(localizarLivro - 1);

					System.out.println(" ___________________________________ ");
					System.out.println("|Nome: " + buscarLivro.getNome() + "     |");
					System.out.println("|Data de nascimento: " + formatador.format(buscarLivro.getDtPublicacao()) + "     |");
					System.out.println("|Autor: " + buscarLivro.getAutor() + "     |");
					System.out.println("|Editora: " + buscarLivro.getEditor() + "     |");
					System.out.println("|___________________________________|");
					System.out.println("");
					break;

				case 3:
					//Localiza emprestimo
					System.out.println(" _______________________________");
					System.out.println("|Insira o codigo do empréstimo: |");
					System.out.println("|_______________________________|");
					int localizarEmprestimo = entrada.nextInt();
					Emprestimo buscarEmprestimo = emprestimos.get(localizarEmprestimo - 1);
					Cliente buscarCliente2 = clientes.get(buscarEmprestimo.numeroDoCliente - 1);
					Livro buscarLivro2 = livros.get(buscarEmprestimo.numeroDoLivro - 1);
					
					
					System.out.println(" _____________________________________ ");
					System.out.println("|Nome do cliente: " + buscarCliente2.getNome()          + "              |");
					System.out.println("|Codigo do cliente:" + buscarCliente2.getCodigo()       + "              |");
					System.out.println("|                                      |");
					System.out.println("|Nome do livro:" + buscarLivro2.getNome()               + "              |");
					System.out.println("|codigo do livro: " + buscarLivro2.getCodigoLivro()     + "              |");
					System.out.println("|                                      |");
					System.out.println("|Data de retirada: " + formatador.format(buscarEmprestimo.getEmprestimo()) + "              |");
					System.out.println("|Data de devolução:" + formatador.format(buscarEmprestimo.getDevolucao())  + "              |");
					System.out.println("|______________________________________|");
					System.out.println();
					
					
					
					break;
					
				default:
					System.out.println(" _____________________");
					System.out.println("|SELECIONE DE 1 ou 3  |");
					System.out.println("|_____________________|");
					break;

				}

				break;

			case 6:
				// Opção de sair do programa
				menuPrincipal = false;
				System.out.println(" ________________________");
				System.out.println("|Obrigado, volte sempre! |");
				System.out.println("|________________________|");
				break;

			default:
				// Corrigir escolha
				System.out.println(" _____________________");
				System.out.println("|SELECIONE DE 1 a 5 ! |");
				System.out.println("|_____________________|");
				break;

			}

		} while (menuPrincipal);
		// FIM
		System.out.println(" _________________ ");
		System.out.println("|FIM DO PROGRAMA! |");
		System.out.println("|_________________|");

	}

}
