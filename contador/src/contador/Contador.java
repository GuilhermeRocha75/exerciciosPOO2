package contador;

public class Contador {

    public static void main(String[] args) {
        // Criando um objeto Operacoes com valor inicial 0
        operacoes contador = new operacoes(0);

        // Exibindo o valor inicial
        System.out.println("Valor inicial: " + contador.getNumero());

        // Somando 3 vezes
        contador.somar();
        contador.somar();
        contador.somar();

        // Exibindo o valor após as somas
        System.out.println("Valor após somar: " + contador.getNumero());

        // Subtraindo 2 vezes
        contador.subtrair();
        contador.subtrair();

        // Exibindo o valor final
        System.out.println("Valor final após subtrair: " + contador.getNumero());
    }
}
