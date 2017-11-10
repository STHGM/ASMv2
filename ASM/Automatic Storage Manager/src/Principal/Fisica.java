package Principal;

public class Fisica extends Pessoa{
	private String dataNasc;
	private String cpf;

	public Fisica(){
		dataNasc = "";
		cpf = "";
	}

	public void setDataNasc(String dataNasc){
		this.dataNasc = dataNasc;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public String getDataNasc(){
		return dataNasc;
	}

	public String getCpf(){
		return cpf;
	}
}