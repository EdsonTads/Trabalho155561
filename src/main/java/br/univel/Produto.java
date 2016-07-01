package br.univel;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;

public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String descricao;
	private BigDecimal preco;

	public Produto(int id, String descricao, BigDecimal preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}



	@XmlElement(name = "_id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@XmlElement(name = "_descricao")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@XmlElement(name = "_preco")
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}
