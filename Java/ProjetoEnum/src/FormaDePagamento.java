
public enum FormaDePagamento {
		
	DINHEIRO("DIN","Dinheiro"), 
	CARTAO_CREDITO("CCR","Cartão de Crédito"),
	CARTAO_DEBITO("CDB","Cartão de Débito"),
	PIX("PIX","PIX"),
	TRANFERENCIA("TRN","Transferência");
	
	private final String codigo, descricao;	
	
	FormaDePagamento(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
