package site;

public class ItemCatalogo {
	 private String nome;
	    private double preco;

	    public ItemCatalogo(String nome, double preco) {
	        this.nome = nome;
	        this.preco = preco;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void mostrarDetalhes() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Preço: R$" + preco);
	    }
	}
