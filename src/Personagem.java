public class Personagem {
    String nome;
    int humanidade;

    int humanidadeTotal = 100;

    Personagem(String nome,
    int humanidade){
        this.nome = nome;
        this.humanidade = humanidade;
    }

    public String mostraNome(){
        return nome;
    }

    public int perdeHumanidade(){
        humanidade = humanidade - 50;
        return humanidade;
    }

    public int recuperaHumanidade(){
        return humanidade = humanidadeTotal;
    }
}
