package site;

import java.util.ArrayList;
import java.util.List;

abstract class Vestido {
	String nome;
    double preco;

    public Vestido (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    abstract void mostrarDetalhes();
}


class Roupa extends Vestido {
    String tamanho;

    public Roupa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: $" + preco);
        System.out.println("Tamanho: " + tamanho);
    }
}

interface AdicionavelAoCarrinho {
    void adicionarAoCarrinho();
}


class Carrinho {
    List<Vestido> itens = new ArrayList<>();

    void adicionarItem(Vestido item) {
        itens.add(item);
        System.out.println(item.nome + " adicionado ao carrinho.");
    }

    void exibirCarrinho() {
        System.out.println("\n*** Carrinho de Compras ***");
        for (Vestido item : itens) {
            item.mostrarDetalhes();
            System.out.println("--------------------------");
        }
    }
}

