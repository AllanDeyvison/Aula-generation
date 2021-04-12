package ProjetoBloco1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;


public class Series extends Listas{
	
	
	@Override
	public void listaGeneros() {
		System.out.println("\n__________________________________________________________");
		System.out.println("\nDigite o código do genero desejado:"
				+ "\n1- Ação"
				+ "\n2- Terror"
				+ "\n3- Romance"
				+ "\n4- Ficção e Fantasia"
				+ "\n5- Drama"
				+ "\n6- Animação"
				+ "\n__________________________________________________________");
		}
	@Override
	public List<String> lista1()
	{
		List<String> listaAcao = new ArrayList<String>();
		listaAcao.add("Cobra kai");
		listaAcao.add("Vikings");
		listaAcao.add("The Umbrella Academy – HQ");
		listaAcao.add("The Boys");
		return listaAcao;
	}
	@Override
	public List<String> lista2()
	{
		List<String> listaTerror = new ArrayList<String>();
		listaTerror.add("The Purge");
		listaTerror.add("História de Horror Americana (American Horror Story) ");
		listaTerror.add("A Maldição da Residência Hill");
		listaTerror.add("Mindhunter");
		return listaTerror;
	}
	@Override
	public List<String> lista3()
	{
		List<String> listaRomance = new ArrayList<String>();
		listaRomance.add("Modern Family – Familiar");
		listaRomance.add("Modern Love");
		listaRomance.add("Doces Magnólias");
		return listaRomance;
	}
	@Override
	public List<String> lista4()
	{
		List<String> listaFiccaoFantasia = new ArrayList<String>();
		listaFiccaoFantasia.add("Black Mirror");
		listaFiccaoFantasia.add("Dark");
		listaFiccaoFantasia.add("Game of Thrones");	
		listaFiccaoFantasia.add("Carnival Row");
		listaFiccaoFantasia.add("Stranger Things");
		listaFiccaoFantasia.add("Carnival Row");
		listaFiccaoFantasia.add("Orphan Black");
		return listaFiccaoFantasia;
	}
	@Override
	public List<String> lista5()
	{
		List<String> listaDrama = new ArrayList<String>();
		listaDrama.add("Anne With an \"E\"");
		listaDrama.add("The Crown");
		listaDrama.add("Olhos que Condenam");
		listaDrama.add("This is Us");
		
		return listaDrama;
	}
	@Override
	public List<String> lista6()
	{
		List<String> listaAnimacao = new ArrayList<String>();
		listaAnimacao.add("BoJack Horseman");
		listaAnimacao.add("Rick e Morty");
		listaAnimacao.add("Sem Maturidade para Isso");
		listaAnimacao.add("The Midnight Gospel");
		return listaAnimacao;
	}


}
