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
@Table(name="produto")
public class ProdutoVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String nome;
	
	private float precoVenda;
	
	@ManyToOne
	@JoinColumn(nullable = false, name="id_grupo_produto")
	private GrupoProdutoVO grupoProduto;
	
	
	public GrupoProdutoVO getGrupoProduto() {
		return grupoProduto;
	}

	public void setGrupoProduto(GrupoProdutoVO grupoProduto) {
		this.grupoProduto = grupoProduto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	@ManyToMany
	@JoinTable(name = "produto_fornecedor", 
	  joinColumns = {@JoinColumn(name = "codigo_produto")}, 
	  inverseJoinColumns = {@JoinColumn(name = "codigo_fornecedor")}
	)
	private List<FornecedorVO>fornecedores;


	public List<FornecedorVO> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<FornecedorVO> fornecedores) {
		this.fornecedores = fornecedores;
	}
	
	
	
	

}
