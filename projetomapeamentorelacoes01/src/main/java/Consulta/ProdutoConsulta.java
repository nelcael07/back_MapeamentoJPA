package Consulta;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import VO.FornecedorVO;
import VO.ProdutoVO;

public interface ProdutoConsulta extends JpaRepository<ProdutoVO, Integer> {
	
	@Query(value = "  " ,
			nativeQuery = true)
	List<ProdutoVO> buscarAll();
//	
//	select produto.nome, produto.precovenda,
//	grupoproduto.nome as nome_grupo_produto, fornecedor.razaosocial
//	from produto, grupoproduto, fornecedor, produto_fornecedor
//	where 
//	grupoproduto.codigo = produto.id_grupo_produto and
//	produto_fornecedor.codigo_fornecedor = fornecedor.codigo and
//	produto_fornecedor.codigo_produto = produto.codigo 
//	order by produto.nome, produto.precovenda, grupoproduto.nome,
//	fornecedor.razaosocial;
	
}
