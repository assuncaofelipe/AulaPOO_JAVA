package pacote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private Long id;
	private String descricaoVenda;
	private String nomeCliente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;

	private List<Produto> listaProdutos = new ArrayList<Produto>();

	/**
	 * ID VENDA
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * DESCRICAO VENDA
	 */
	public String getDescricaoVeda() {
		return descricaoVenda;
	}

	public void setDescricaoVeda(String descricaoVeda) {
		this.descricaoVenda = descricaoVeda;
	}

	/**
	 * NOME CLIENTE
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	/**
	 * ENDERECO CLIENTE
	 */
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	/**
	 * VALOR TOTAL VENDA
	 */
	public BigDecimal getValorTotal() {
		this.valorTotal = BigDecimal.valueOf(totalVenda());
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	/**
	 * LISTA PRODUTOS
	 */
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	/**
	 * FUNCOES CRIADAS PARA REGRAS DE NEGOCIOS
	 */
	public void addProduto(Produto produto) {
		/* SE PRECISO, DA PRA FAZER VALIDACOES */
		this.listaProdutos.add(produto);
	}
	
	private double totalVenda() {
		double total = 0.0;
		for (Produto produto : listaProdutos) {
			total += produto.getValorProduto().doubleValue();
		}
		
		return total;
	}
	

	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return "\nVenda [id: " + id + ", descricao da Venda:" + descricaoVenda + ", nome Cliente:" + nomeCliente
				+ ",\n enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProdutos="
				+ listaProdutos + "]";
	}

}
