package com.ecommerce.backend.model;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

=======
>>>>>>> master
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {

	@Id
<<<<<<< HEAD
=======
	
>>>>>>> master
	/*
	 * Atributos
	 */
	private String id;
	
	@ManyToOne
	private Cliente Cliente;
	
	private int qntItens;
	private Double valorTotal;
	private Double valorFrete;
	private List<Produto> produtos = new ArrayList();
	
	/*
	 * Construtores
<<<<<<< HEAD
	 * Sobrecarga de métodos
=======
>>>>>>> master
	 */
	public Pedido() {
		
	}
	
	public Pedido(String id, int qntItens, Double valorTotal, Double valorFrete) {
		
		this.id = id;
		this.qntItens = qntItens;
		this.valorTotal = valorTotal;
		this.valorFrete = valorFrete;
	}
	
	public Pedido(Pedido pedido) {
		this.id = pedido.getId();
		this.qntItens = pedido.getQntItens();
		this.valorTotal = pedido.getValorTotal();
		this.valorFrete = pedido.getValorFrete();
		this.produtos = pedido.getProdutos().stream().map(produtosNoPedido -> new Produto(produtosNoPedido)).collect(Collectors.toList());
	}
	
	/*
	 * Getters and Setters
	 */
<<<<<<< HEAD
	
=======
>>>>>>> master
	public String getId() {
		return id;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public int getQntItens() {
		return qntItens;
	}

	public void setQntItens(int qntItens) {
		this.qntItens = qntItens;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}
	
}