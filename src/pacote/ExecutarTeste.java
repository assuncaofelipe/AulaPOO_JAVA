package pacote;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Orientação a Objetos em Java");
		produto1.setValorProduto(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setNome("API Rest | Spring Boot");
		produto2.setId(2L);
		produto2.setValorProduto(BigDecimal.valueOf(300));
				
		Produto produto3 = new Produto();
		produto3.setNome("Angular JS");
		produto3.setId(3L);
		produto3.setValorProduto(BigDecimal.valueOf(100));
		
		Produto produto4 = new Produto();
		produto4.setNome("Hiebernate");
		produto4.setId(4L);
		produto4.setValorProduto(BigDecimal.valueOf(300));
		
		Venda venda = new Venda();
		venda.setDescricaoVeda("Curso de design");
		venda.setEnderecoEntrega("Entrega pelo email");
		venda.setId(10L);
		venda.setNomeCliente("Assuncao");
		venda.setValorTotal(BigDecimal.valueOf(200.00));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		// EH UMA FUNCAO NA CLASS VENDA
		venda.addProduto(produto3); /* POSSO FAZER VALIDACOES ANTES DE ADD NA LISTA*/
		venda.addProduto(produto4);
				
		System.out.println("Valor variável total: " + venda.getValorTotal());
	}
}