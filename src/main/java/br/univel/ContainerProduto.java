package br.univel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ContainerProduto implements Serializable{

	private List<Produto> lista = new ArrayList<>();

	public ContainerProduto(List<Produto> lista) {
		super();
		this.lista = lista;
	}

	public ContainerProduto() {
	}

	public List<Produto> getLista() {
		return lista;
	}

	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}
	
	
}
