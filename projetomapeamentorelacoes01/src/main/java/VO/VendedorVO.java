package VO;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="venda")
public class VendedorVO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String nome;
	
	private float perComissao;
	
	@OneToMany
	private List<VendaVO> vendas;

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

	public float getPerComissao() {
		return perComissao;
	}

	public void setPerComissao(float perComissao) {
		this.perComissao = perComissao;
	}

	public List<VendaVO> getVendas() {
		return vendas;
	}

	public void setVendas(List<VendaVO> vendas) {
		this.vendas = vendas;
	}
	
}
