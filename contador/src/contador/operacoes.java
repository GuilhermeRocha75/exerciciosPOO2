/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

public class operacoes {

    private int numero;

    public operacoes(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
  // Método para incrementar o valor do contador
    public void somar() {
        this.numero++;
    }

    // Método para decrementar o valor do contador
    public void subtrair() {
        this.numero--;
    }
}