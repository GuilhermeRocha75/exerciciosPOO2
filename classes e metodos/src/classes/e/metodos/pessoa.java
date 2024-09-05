

package classes.e.metodos;


public class pessoa {
    private String nome;
    private int idade;
    private String profissao;
  
    
    
    //metodo construtor sem parametros
    public pessoa () {
        nome = "sem nome";
        idade = 0;
        profissao = "Sem profissão";
    }




    //metodo contrutor com parametros

    public pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }
    
    
    
    
    
    //metodos acessores
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public int getIdade(){
        return idade;
       
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    
    
    //Metodo para exibir informaçoes da pessoa
    public void exibirInfo(){
        System.out.println("Nome:"+nome);
         System.out.println("Idade:"+idade);
         System.out.println("Profissão: "+profissao);
    }
    
}
