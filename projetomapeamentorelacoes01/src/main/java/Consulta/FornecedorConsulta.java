package Consulta;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import VO.FornecedorVO;

public interface FornecedorConsulta extends JpaRepository<FornecedorVO, Integer>{
	
	@Query(value = "select razaosocial, nome from fornecedor, produto, produto_fornecedor " + 
			"where produto_fornecedor.codigo_fornecedor = fornecedor.codigo and produto_fornecedor.codigo_produto = produto.codigo ORDER BY razaosocial" ,
			nativeQuery = true)
	List<FornecedorVO> buscarAll();
	
	
}
