package Principal;

public class Pessoa{
        private String tipo;
        private String categoriaPes;
	private int id_pessoa;
	private String nome;
	private String endereco;
        private String bairro;
	private String telefone1;
        private String telefone2;
	private String cidade;
	private String cep;
	private String estado;
	private String email;

	public Pessoa(){
                tipo = "";
                categoriaPes = "";
		id_pessoa = 0;
		nome = "";
		endereco = "";
                bairro = "";
		telefone1 = "";
                telefone2 = "";
		cidade = "";
		cep = "";
		estado = "";
                email = "";
	}
        
        public void setTipo(String tipo){
		this.tipo = tipo;
	}
        
        public void setCategoriaPes(String categoriaPes){
		this.categoriaPes = categoriaPes;
	}

	public void setId_pessoa(int id_pessoa){
		this.id_pessoa = id_pessoa;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
        
        public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public void setTelefone1(String telefone1){
		this.telefone1 = telefone1;
	}
        
        public void setTelefone2(String telefone2){
		this.telefone2 = telefone2;
	}

	public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public void setCep(String cep){
		this.cep = cep;
	}

	public void setEstado(String estado){
		this.estado = estado;
	}

	public void setEmail(String email){
		this.email = email;
	}
        
        public String getTipo(){
		return tipo;
	}
        
        public String getCategoriaPes(){
		return categoriaPes;
	}
        
	public int getId_pessoa(){
		return id_pessoa;
	}

	public String getNome(){
		return nome;
	}

	public String getEndereco(){
		return endereco;
	}
        
        public String getBairro(){
		return bairro;
	}

	public String getTelefone1(){
		return telefone1;
	}
        
        public String getTelefone2(){
		return telefone2;
	}

	public String getCidade(){
		return cidade;
	}

	public String getCep(){
		return cep;
	}

	public String getEstado(){
		return estado;
	}

	public String getEmail(){
		return email;
	}
}