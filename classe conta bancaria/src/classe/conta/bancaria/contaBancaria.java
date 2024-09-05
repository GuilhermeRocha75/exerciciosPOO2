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
public class contaBancaria {
    
    
    private int numConta;
    private String nomeTitular;
    private int saldo;
    
    
    //metodo contrutor sem parametro
    public contaBancaria (){
        nomeTitular = "Sem nome";
        numConta = 0;
        saldo = 0;
        
    }
     //metodo com parametros
    public contaBancaria(String nomeTitular, int saldo,int numConta){
        this.nomeTitular=nomeTitular;
        this.saldo=saldo;
        this.numConta=numConta;
      
    }
    
    
    
     public contaBancaria(int numeroConta, String nomeTitular) {
        this.numConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0; // saldo inicializado como zero
    }
    
     public int getNumConta(){
        return numConta;  
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    
     public int getSaldo(){
        return saldo;  
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
    
     public String getNomeTitular(){
         return nomeTitular;
     }
     public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    
     
    
     
     
      //Metodo para exibir informaçoes da pessoa
    public void exibirInfo(){
        System.out.println("Nome titular:"+nomeTitular);
        System.out.println("saldo:"+saldo);
         System.out.println("Numero da conta:"+ numConta);
      
    }
     
     
}
