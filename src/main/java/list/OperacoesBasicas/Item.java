package main.java.list.OperacoesBasicas;

public class Item {
  //atributos
	private String nome;
	private double preco;
	private int quant;

	public Item(String nome, double preco, int quant) {
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}

	public String getNome() {
		return this.nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public int getQuantidade() {
		return this.quant;
	}

}
