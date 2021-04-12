

package ProjetoBloco1;

import java.util.Scanner;

public class TesteProjeto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Filmes filmes = new Filmes();
		Series series = new Series();
		Musicas musicas = new Musicas();
		Jogos jogos = new Jogos();
		AtividadesFisicas atividadesFisicas = new AtividadesFisicas();
		Listas lista = null;
		int continuar = 1;

		System.out.println("Bem vinde ao nosso menu! Vamos tirar o seu t�dio nessa pandemia :D");

		
		System.out.println("\nInsira um NickName: ");
		String nome = scanner.nextLine();
		
		
		
		System.out.println("\nInsira seu melhor Email: ");
		String email = scanner.nextLine();		
		Usuario usuario =  new Usuario(nome,email);
		
		
		while(continuar==1) {
			System.out.println("\n__________________________________________________________");
			System.out.println("\nOi "+usuario.getNome()+", informe o c�digo da a��o desejada:"
				+ "\n1- Assistir filmes"
				+ "\n2- Assistir s�ries"
				+ "\n3- Ouvir m�sica"
				+ "\n4- Jogar jogos"
				+ "\n5- Praticar atividades f�sicas"
				+ "\n__________________________________________________________");
			int opcao = scanner.nextInt();
			switch(opcao) {
				case 1: lista = filmes;break;
				case 2: lista = series;break;
				case 3: lista = musicas;break;
				case 4: lista = jogos;break;
				case 5: lista = atividadesFisicas;break;
				default:System.out.println("Op��o inv�lida");break;
			}
			
			if (lista != null) {
				lista.listaGeneros();
				int genero = scanner.nextInt();
				switch(genero) {
					case 1: System.out.println("\nSugest�es:\n" + lista.lista1());break;
					case 2: System.out.println("\nSugest�es:\n" + lista.lista2());break;
					case 3: System.out.println("\nSugest�es:\n" + lista.lista3());break;
					case 4: System.out.println("\nSugest�es:\n" + lista.lista4());break;
					case 5: System.out.println("\nSugest�es:\n" + lista.lista5());break;
					case 6: System.out.println("\nSugest�es:\n" + lista.lista6());break;
					default:System.out.println("\nOp��o inv�lida");break;
				}
			}
		
			/*System.out.println("\nDeseja fazer outra atividade?"
					+ "\n0- N�o."
					+ "\n1- Sim! Me mostre as op��es!"
					+ "\n2-Adicionar sugest�o: ");
			continuar = scanner.nextInt();
			if (continuar==2) {
				lista.listaGeneros();
				int genero2 = scanner.nextInt();
				switch(genero2) {
				case 1:System.out.println("\nColoque sua sugest�o em : ");
				String sugestao = scanner.nextLine();
				lista.lista1().add(sugestao);break;
				case 2: System.out.println("\nAdicionar sugest�o: ");
				String sugestao2 = scanner.nextLine();
				lista.lista2().add(sugestao2);break;
				case 3:System.out.println("\nAdicionar sugest�o: ");
				String sugestao3 = scanner.nextLine();
				lista.lista3().add(sugestao3);break;
				case 4: System.out.println("\nAdicionar sugest�o: ");
				String sugestao4 = scanner.nextLine();
				lista.lista4().add(sugestao4);break;
				case 5: System.out.println("\nAdicionar sugest�o: ");
				String sugestao5 = scanner.nextLine();
				lista.lista5().add(sugestao5);break;
				case 6: System.out.println("\nAdicionar sugest�o: ");
				String sugestao6 = scanner.nextLine();
				lista.lista6().add(sugestao6);break;
				default:System.out.println("\nOp��o inv�lida");break;
				
				//String sugestao = scanner.nextLine();
				//lista.lista1().add(sugestao);
				
			}
		}
			*/
			System.out.println("\n"+usuario.getNome()+", deseja fazer outra atividade?"
					+ "\n0- N�o."
					+ "\n1- Sim! Me mostre as op��es!");
			continuar = scanner.nextInt();
		}
		System.out.println("\n"+usuario.getNome()+", obrigade! At� mais");
				
	}

}