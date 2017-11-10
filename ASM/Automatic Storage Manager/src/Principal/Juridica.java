package Principal;

public class Juridica extends Pessoa{
	private String cnpj;
	private String descricao;

	public Juridica(){
		cnpj = "";
		descricao = "";
	}

	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public String getCnpj(){
		return cnpj;
	}

	public String getDescricao(){
		return descricao;
	}
}