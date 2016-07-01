package br.univel;

import java.io.Serializable;
import java.math.BigDecimal;

public class Venda implements Serializable{

	private int id;
	private String Descricao;
	private BigDecimal preco;
	private float quantidade;
	private float total;
	
	
	
	public Venda(int id, String descricao, BigDecimal preco, Float qt, float total) {
		super();
		this.id = id ;
		Descricao = descricao;
		this.preco = preco;
		this.quantidade = qt;
		this.total = total;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDescricao() {
		return Descricao;
	}



	public void setDescricao(String descricao) {
		Descricao = descricao;
	}



	public BigDecimal getPreco() {
		return preco;
	}



	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}



	public float getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}



	public float getTotal() {
		return total;
	}



	public void setTotal(float total) {
		this.total = total;
	}



	public Venda() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
