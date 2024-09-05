
package ClasseCarro;


public class carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private int preco;
   
    //metodo contrutor sem parametro
    public carro (){
        marca = "Sem marca";
        modelo = "Sem modelo";
        ano = 0000;
        preco = 0000;
    }
    
    //metodo com parametros
    public carro(String marca,String modelo, int ano,int preco){
        this.modelo=modelo;
        this.marca=marca;
        this.ano=ano;
        this.preco=preco;
    }
    
    //metodos acessores
     public String getMarca(){
         return marca;
     }
     public void setMarca(String marca){
        this.marca = marca;
    }
    
     
     
     public String getModelo(){
         return modelo;
     }
     public void setModelo(String modelo){
         this.modelo = modelo;
     }
     
     
     
     
     
     public int getAno(){
        return ano;  
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    
    
      public int getPreco(){
        return preco;  
    }
    public void setPreco(int preco){
        this.preco = preco;
    }
    
    
    
    //Metodo para exibir informaçoes da pessoa
    public void exibirInfo(){
        System.out.println("Marca:"+marca);
        System.out.println("Modelo:"+modelo);
         System.out.println("Ano:"+ ano);
        System.out.println("Preço:R$"+preco);
    }
}
