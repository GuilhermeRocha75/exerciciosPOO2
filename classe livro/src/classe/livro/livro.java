/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe.livro;

/**
 *
 * @author aluno.saolucas
 */
public class livro {
    private String titulo;
    private String autor;
    private int ano;
    private String genero;
    
     //metodo contrutor sem parametro
    public livro (){
        titulo = "Sem titulo";
        autor = "Sem autor";
        ano = 0000;
        genero = "Sem genero";
    }
    
     //metodo com parametros
    public livro(String titulo,String autor, int ano,String genero){
        this.titulo=titulo;
        this.autor=autor;
        this.ano=ano;
        this.genero=genero;
    }
    
    
    //metodos acessores
     public String getTitulo(){
         return titulo;
     }
     public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
     
     
     public String getAutor(){
         return autor;
     }
     public void setAutor(String autor){
         this.autor = autor;
     }
     
     
     
     
      public int getAno(){
        return ano;  
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    
    
    public String getGenero(){
         return genero;
     }
     public void setGenero(String genero){
         this.genero = genero;
     }
     
     
     
     
     //Metodo para exibir informaçoes da pessoa
    public void exibirInfo(){
        System.out.println("Titulo:"+titulo);
        System.out.println("Autor:"+autor);
         System.out.println("Ano:"+ ano);
        System.out.println("Genero:"+genero);
    }
    
    
    
}
