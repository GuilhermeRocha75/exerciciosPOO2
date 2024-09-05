
package ClasseCarro;

public class classeCarro {
    public static void main(String[] args) {
        carro c1 = new carro();
        carro c2 = new carro("Volksvagem","Fusca",1980,25500);
        
        
        c1.exibirInfo();
        System.out.println("=================");
        c2.exibirInfo();
    }
    
}
