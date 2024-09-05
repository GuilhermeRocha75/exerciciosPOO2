package classe.estudante;

public class ClasseEstudante {

    public static void main(String[] args) {
        // Criando um objeto Estudante
        estudante estudante = new estudante("João", 20);

        // Adicionando disciplinas
        estudante.adicionarDisciplina("Matemática");
        estudante.adicionarDisciplina("História");
        estudante.adicionarDisciplina("Física");

        estudante.separador();
        
        // Exibindo disciplinas matriculadas
        estudante.exibirDisciplinas();
    }
}
