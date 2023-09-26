package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos
	private List<Item> items;

	public CarrinhoDeCompras() {
		this.items = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		items.add(new Item(nome, preco, quantidade));
	}

	public void removerItem(String nome) {
		List<Item> itemsParaRemover = new ArrayList<>();
		for (Item it : items) {
			if (it.getNome().equalsIgnoreCase(nome)) {
				itemsParaRemover.add(it);
			}
		}
		items.removeAll(itemsParaRemover);
	}

	public double calcularValorTotal() {
		double valorTotal = 0.0;
		for (Item it : items) {
			valorTotal += (it.getPreco() * it.getQuantidade());
		}
		return valorTotal;
	}

	public void exibirItens() {
		for (Item it : items) {
			System.out.println("Titulo: " + it.getNome());
			System.out.println("Preço: " + it.getPreco());
			System.out.println("Quantidade: " + it.getQuantidade());
			System.out.println("");
		}
	}

	public int quantidadeItensCarrinho() {
		return items.size();
	}

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
		System.out.println("Quantidade de itens no carrinho: " + carrinho1.quantidadeItensCarrinho());

		// adicionando itens ao carrinho
		carrinho1.adicionarItem("ABC", 30.00, 2);
		carrinho1.adicionarItem("CBA", 20.00, 1);
		carrinho1.adicionarItem("DEF", 10.00, 5);
		carrinho1.adicionarItem("FED", 2.00, 10);

		System.out.println("Quantidade de itens no carrinho após adicionar 4 itens: " + carrinho1.quantidadeItensCarrinho());

		carrinho1.removerItem("ABC");
		carrinho1.exibirItens();

		System.out.println("Valor total do carrinho: R$ " + carrinho1.calcularValorTotal());

	}

}