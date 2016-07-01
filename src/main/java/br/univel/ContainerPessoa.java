package br.univel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ContainerPessoa implements Serializable{

	private List<Pessoa> lista = new ArrayList<>();

	public ContainerPessoa(List<Pessoa> lista) {
		super();
		this.lista = lista;
	}

	public ContainerPessoa() {
	}

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}
	
	
}
