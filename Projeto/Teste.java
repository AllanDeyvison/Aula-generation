package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		String filmes;
		Scanner scanner = new Scanner(System.in);
		Resultado1 resultado1 = new Resultado1();
		Resultado2 resultado2 = new Resultado2();
		
		//resultado1.filmes(null);
		//resultado2.musica(null);
		
		System.out.println("\nEscreva uns dos genero de filme:\n-A��o\n-Terror\n-Romance\n-Fic��o e Fantasia");
		filmes = scanner.nextLine(); 
	switch (filmes)
	{
	case "A��o" :
		scanner.nextLine();
		//System.out.println(resultado1.lista1());
		//int filme1 = filme1 + 1;
		break;
	case "Terror" :
		scanner.nextLine();
		System.out.println(resultado1.lista2());
		break;
	case "Romance" :
		scanner.nextLine();
		System.out.println(resultado1.lista3());
		break;
	case "Fic��o e Fantasia" :
		scanner.nextLine();
		System.out.println(resultado1.lista4());
		break;
	    default:
		System.out.println("O que voc� escreveu n�o � uma das op��es acima. Tente novamente!");
	    break;
	    
	}
	    if (filmes=="A��o")
	    {
	    	System.out.println(resultado1.lista1());
	    }

	}

}
