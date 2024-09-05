/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeretangulo;

/**
 *
 * @author aluno.saolucas
 */
public class retangulo {
    
    private int altura;
    private int largura;
    private int area;
    
    /**
     *
     */
  
         public void CalculaRetangulo (){
        area = altura*largura;      
      }

       
    //metodo contrutor sem parametro
    public retangulo (){
        altura = 0;
        largura = 0;
        area = 0 ;
        
}
    

    
    
      //metodo com parametros
    public retangulo(int altura, int largura){
        this.altura=altura;
        this.largura=largura;
  CalculaRetangulo(); // chamando o método para calcular a área
      
    }
      
    
    
    
    
    
    
      //metodos acessores
    
      public int getAltura(){
        return altura;  
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    
    
      public int getLargura(){
        return largura;  
    }
    public void setLargura(int largura){
        this.largura = largura;
    }
    
    
    
    
    
   
    //Metodo para exibir informaçoes da pessoa
    public void exibirInfo(){
        System.out.println("Altura:"+altura);
        System.out.println("Largura:"+largura);
         System.out.println("Área:"+ area);
      
    }
    
    

}
