/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe.conta.bancaria;

/**
 *
 * @author aluno.saolucas
 */
public class ClasseContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         contaBancaria p1 = new contaBancaria();
         contaBancaria p2 = new contaBancaria("Pedro santos",500,99999 );
        
        
          p1.exibirInfo();
           System.out.println("=================");
           p2.exibirInfo();
        
        // TODO code application logic here
    }
    
}
