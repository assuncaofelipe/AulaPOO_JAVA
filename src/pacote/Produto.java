package pacote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Produto {

	private Long id;
	private String nome;
	private BigDecimal valorProduto;
	private List<Produto> listaProdutos = new ArrayList<Produto>();

	/**
	 * ID PRODUTO
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * NOME PRODUTO
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * VALOR PRODUTO
	 */
	public BigDecimal getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	/**
	 * LISTA PRODUTO
	 */
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}
