package Principal;

import java.util.Date;

public class Transacao{
	private int id_t;
        private String tipo;
        private int qtde;
        private float valor_un;
        private int desconto;
        private float valortotal;
        private Produto prod = new Produto();
        private Pessoa pes = new Pessoa();

    public Transacao(){
        this.id_t = id_t;
        this.tipo = tipo;
        this.qtde = qtde;
        this.valor_un = valor_un;
        this.desconto = desconto;
    }

    public void setValorTotal(Float valortotal){
        this.valortotal = valortotal;
    }
    
    public float getValorTotal(){
        return valortotal;
    }
    
    public void setProd(Produto prod){
        this.prod = prod;
    }
    
    public void setPes(Pessoa pes){
        this.pes = pes;
    }
    
    public Produto getProd(){
        return prod;
    }
    
    public Pessoa getPes(){
        return pes;
    }
    
    public int getId_t() {
        return id_t;
    }

    public void setId_t(int id_t) {
        this.id_t = id_t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public float getValor_un() {
        return valor_un;
    }

    public void setValor_un(float valor_un) {
        this.valor_un = valor_un;
    }


    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
    
    

	

}