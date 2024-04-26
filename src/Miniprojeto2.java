import java.util.Scanner;

public class Miniprojeto2 {
    public static void main(String[] args) throws Exception {

        int humanidadeTotal = 100;

        Scanner k = new Scanner(System.in);
        Personagem Unkindled = new Personagem("Unkindled",
        humanidadeTotal);
        Personagem ChosenUndead = new Personagem("Chosen Undead",
        humanidadeTotal);

        System.out.println("Escolha seu personagem 1- Chosen Undead 2- Unkindled: ");
        String escolhePersona = k.nextLine();

        if (escolhePersona.equals("1")){
            System.out.println("Você escolheu o "+ChosenUndead.mostraNome()+" , vamos começar sua aventura\n\n");
            System.out.println("Você acorda em um local que parece ser uma clareira, você repara que ao seu pé está uma fogueira estranha com uma espada fincada nele de alguma forma vc sente que está ligado a essa fogueira, você é interrompido por um humano que diz que seu objetivo é tocar o sino da igreja que fica subindo o morro que vc vê adiante");
            System.out.println("\n\nVocê segue pelo monte, assim que vc o sobe você chega em um local chamado de undead burg, cheio de hollows terriveis, você entra em diversos combates e acaba ferido\n \u001B[31m Você perde 50 de 100 Humanidade \u001B[0m");
            ChosenUndead.perdeHumanidade();
            System.out.println("\n após passar por algums desafios vc chega em um local onde tem outra daquelas fogueiras, você tem a escolha a - ignorar e continuar sua aventura ou b - sentar e descansar");
            String escolhaFogueira = k.nextLine();
            if (escolhaFogueira.equals("a")||escolhaFogueira.equals("A")){
                System.out.println("Ignorando a fogueira você segue viagem logo mais afrente você encontra um Black Knight, como você estava ferido você não aguentou essa luta");
                ChosenUndead.perdeHumanidade();
                if(ChosenUndead.humanidade == 0){
                    System.out.println("\n\n   \u001B[31m Você morreu \u001B[0m");
                    return;
                }
            }
            else if(escolhaFogueira.equals("b")||escolhaFogueira.equals("B")){
                System.out.println("Ao escolher descansar na fogueira, você sente o calor do fogo restaurando suas forças \n \u001B[32m Sua humanidade foi restaurada!! \u001B[0m");
                ChosenUndead.recuperaHumanidade();
                System.out.println("\n\n Com sua energia totalmente restaurada você continua sua jordada até o topo da igreja e se depara com duas gargulas enormes porem você consegue superar-las e consegue tocar o sino\n\n   \u001B[36m Fim!! \u001B[0m");
            }
        }

        

    }
}
