package VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item_venda")
public class ItemVendaVO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private int quantidade;
	
	private int precoVenda;
	
	private float perDesconto;
	
	@ManyToOne
	@JoinColumn(nullable = false, name="id_produto")
	private ProdutoVO produto;
	
	@ManyToOne
	@JoinColumn(nullable = false, name="id_venda")
	private VendaVO venda;

	public VendaVO getVenda() {
		return venda;
	}

	public void setVenda(VendaVO venda) {
		this.venda = venda;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(int precoVenda) {
		this.precoVenda = precoVenda;
	}

	public float getPerDesconto() {
		return perDesconto;
	}

	public void setPerDesconto(float perDesconto) {
		this.perDesconto = perDesconto;
	}

	public ProdutoVO getProduto() {
		return produto;
	}

	public void setProduto(ProdutoVO produto) {
		this.produto = produto;
	}
	
	
}
