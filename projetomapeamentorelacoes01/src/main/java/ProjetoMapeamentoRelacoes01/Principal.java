package ProjetoMapeamentoRelacoes01;

import java.util.ArrayList;
import java.util.List;

import Apps.ClienteApps;
import Apps.FornecedorApps;
import Apps.GrupoProdutoApps;
import Apps.ProdutoApps;
import Apps.VendaApps;
import Apps.VendedorApps;
import VO.ClienteVO;
import VO.FornecedorVO;
import VO.GrupoProdutoVO;
import VO.ProdutoVO;

public class Principal {

	public static void main(String[] args) {

		GrupoProdutoApps grupoProdutoPersis = new GrupoProdutoApps();
		ProdutoApps produtoPersis = new ProdutoApps();
		FornecedorApps fornecedorPersis = new FornecedorApps();
		ClienteApps clientePersis = new ClienteApps();
		VendedorApps vendedorPersis = new VendedorApps();
		VendaApps vendaPersis = new VendaApps();

//		GRUPO PRODUTO
		GrupoProdutoVO grupoProduto = new GrupoProdutoVO();
		grupoProduto.setNome("Cozinha");
		grupoProdutoPersis.incluir(grupoProduto);
		
		GrupoProdutoVO grupoProduto2 = new GrupoProdutoVO();
		grupoProduto2.setNome("Sala");
		grupoProdutoPersis.incluir(grupoProduto2);
		
		GrupoProdutoVO grupoProduto3 = new GrupoProdutoVO();
		grupoProduto3.setNome("Quarto");
		grupoProdutoPersis.incluir(grupoProduto3);
		
//		PRODUTO
		ProdutoVO produto = new ProdutoVO();
		produto.setGrupoProduto(grupoProduto);
		produto.setNome("Prato");
		produto.setPrecoVenda(35);
		produtoPersis.incluir(produto);
		
		ProdutoVO produto2 = new ProdutoVO();
		produto2.setGrupoProduto(grupoProduto2);
		produto2.setNome("Sofá");
		produto2.setPrecoVenda(1000);
		produtoPersis.incluir(produto2);
		
		ProdutoVO produto3 = new ProdutoVO();
		produto3.setGrupoProduto(grupoProduto3);
		produto3.setNome("Cama");
		produto3.setPrecoVenda(3000);
		produtoPersis.incluir(produto3);
		
//		FORNECEDOR
		FornecedorVO fornecedor = new FornecedorVO();
		fornecedor.setRazaoSocial("alves e cia");
		List<ProdutoVO> produtos = new ArrayList<ProdutoVO>();
		produtos.add(produto);
		fornecedor.setProdutos(produtos);
		fornecedorPersis.incluir(fornecedor);
		
		FornecedorVO fornecedor2 = new FornecedorVO();
		fornecedor2.setRazaoSocial("ferreira e cia");
		List<ProdutoVO> produtos2 = new ArrayList<ProdutoVO>();
		produtos2.add(produto);
		produtos2.add(produto2);
		fornecedor2.setProdutos(produtos2);
		fornecedorPersis.incluir(fornecedor2);
		
		FornecedorVO fornecedor3 = new FornecedorVO();
		fornecedor3.setRazaoSocial("melo e cia");
		List<ProdutoVO> produtos3 = new ArrayList<ProdutoVO>();
		produtos3.add(produto);
		produtos3.add(produto2);
		produtos3.add(produto3);
		fornecedor3.setProdutos(produtos3);
		fornecedorPersis.incluir(fornecedor3);
		
//		CLIENTE
		ClienteVO cliente = new ClienteVO();
		cliente.setNome("Nelcael");
		clientePersis.incluir(cliente);
		
		ClienteVO cliente2 = new ClienteVO();
		cliente2.setNome("Ludmila");
		clientePersis.incluir(cliente2);
		
		ClienteVO cliente3 = new ClienteVO();
		cliente3.setNome("Geraldo");
		clientePersis.incluir(cliente3);
		
		
		
		
		
		

	}

}
