package ProjetoMapeamentoRelacoes01;

import Apps.GrupoProdutoApps;
import VO.GrupoProdutoVO;

public class Principal {

	public static void main(String[] args) {
//		ClienteVO cliente = new ClienteVO();
//		ClienteApps clientePersis = new ClienteApps();
//		cliente.setNome("Nelcael");
////		cliente.setVendas(null);
//		clientePersis.incluir(cliente);
		
		GrupoProdutoVO grupoProduto = new GrupoProdutoVO();
		GrupoProdutoApps grupoProdutoPersis = new GrupoProdutoApps();
		grupoProduto.setNome("Prato");
		grupoProdutoPersis.incluir(grupoProduto);

	}

}
