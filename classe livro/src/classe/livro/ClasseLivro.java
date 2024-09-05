/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe.livro;


public class ClasseLivro {

    
    public static void main(String[] args) {
    livro l1 = new livro();
     livro l2 = new livro("Harry Potter","J. K. Rowling", 2007,"Aventura; Fantasia");
    
    
    
      l1.exibirInfo();
      System.out.println("=================");
        l2.exibirInfo();
    }
   
}
