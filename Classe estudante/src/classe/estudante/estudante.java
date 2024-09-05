package classe.estudante;

import java.util.ArrayList;

public class estudante {
    
    private String nome;
    private int idade;
    private ArrayList<String> disciplinas;

    // Construtor
    public estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.disciplinas = new ArrayList<>();
    }

    // Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    // Método para adicionar uma disciplina
    public void adicionarDisciplina(String disciplina) {
        disciplinas.add(disciplina);
        System.out.println("Disciplina " + disciplina + " adicionada.");
    }

    // Método para exibir as disciplinas matriculadas
    public void exibirDisciplinas() {
        System.out.println("Disciplinas matriculadas por " + nome + ":");
        for (String disciplina : disciplinas) {
            System.out.println("- " + disciplina);
        }
    }
    
    // Separador
    
    public void separador(){
        System.out.println("---------------------------------");
    }
}
