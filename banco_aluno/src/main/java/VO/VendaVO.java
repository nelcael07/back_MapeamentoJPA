package VO;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="venda")
public class VendaVO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private Date dataVenda;
	
	@ManyToOne
	@JoinColumn(nullable = false, name="id_cliente")
	private ClienteVO cliente;
	
	@ManyToOne
	@JoinColumn(nullable = false, name="id_vendedor")
	private VendedorVO vendedor;
	
	@OneToMany
	private List<ItemVendaVO> itensVenda;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}

	public VendedorVO getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorVO vendedor) {
		this.vendedor = vendedor;
	}

	public List<ItemVendaVO> getItensVenda() {
		return itensVenda;
	}

	public void setItensVenda(List<ItemVendaVO> itensVenda) {
		this.itensVenda = itensVenda;
	}
	
	
}
