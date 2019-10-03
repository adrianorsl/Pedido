import java.util.ArrayList;

public class Pedido extends Operação{

	
	
	private int codigo;
	protected Vendedor vendedor;
	protected Cliente cliente;
	private  ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public ArrayList<Produto> getListaProdutos(){
		return listaProdutos;
	}
	
	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		
		this.listaProdutos = listaProdutos;
	}
	
	
}
