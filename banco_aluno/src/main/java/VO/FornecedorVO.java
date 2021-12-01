package VO;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fornecedor")
public class FornecedorVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String razaoSocial;
	
	@ManyToMany
	@JoinTable(name = "produto_fornecedor", 
	  joinColumns = {@JoinColumn(name = "codigo_fornecedor")}, 
	  inverseJoinColumns = {@JoinColumn(name = "codigo_produto")}
	)
	
	private List<ProdutoVO>produtos;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public List<ProdutoVO> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoVO> produtos) {
		this.produtos = produtos;
	}
	
	
}
