
public class Produto {

	private int codigo, quantidade;
	private String descrição;
	private double valor;
	private double totalItem;
	
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
	
	public String getDescrição() {
		return descrição;
	}
	
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		
		this.valor = valor;
	}
	
	public double getTotalItem() {
		return totalItem;
	}
	
	public void setTotalItem(double totalItem) {
		this.totalItem = totalItem * valor;
	}
}
