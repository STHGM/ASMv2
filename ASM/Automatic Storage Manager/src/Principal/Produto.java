package Principal;

public class Produto{
	private int id_produto;
	private String nome;
        private String categoria;
	private String descricao;
        private float sug_pre_venda;
        private float sug_pre_compra;

	public Produto(){
		id_produto = 0;
		nome = "";
		descricao = "";
                categoria = "";
                sug_pre_venda = 0;
                sug_pre_compra = 0;
	}

	public void setId_produto(int id_produto){
		this.id_produto = id_produto;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
        
        public void setCategoria(String categoria){
            this.categoria = categoria;
        }

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
        
        public void setSugPreVenda(float sug_pre_venda){
            this.sug_pre_venda = sug_pre_venda;
        }
        
        public void setSugPreCompra(float sug_pre_compra){
            this.sug_pre_compra = sug_pre_compra;
        }

	public int getId_produto(){
		return id_produto;
	}

	public String getNome(){
		return nome;
	}

        public String getCategoria(){
		return categoria;
	}
        
	public String getDescricao(){
		return descricao;
	}
        
        public float getSugPreVenda(){
		return sug_pre_venda;
	}
        
        public float getSugPreCompra(){
		return sug_pre_compra;
	}

}