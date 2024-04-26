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
        else if(escolhePersona.equals("2")){
            System.out.println("Você escolheu o "+Unkindled.mostraNome()+" , vamos começar sua aventura\n\n");
            System.out.println("Você acorda de um caixão, no que parece ser um cemitério imenso. Você decide explorar e percebe que este lugar está cheio de mortos-vivos agressivos, eles são muitos e você recebem algum ataques, mas consegue passar por eles ainda assim\n \u001B[31m Você perde 50 de Humanidade \u001B[0m\n Você segue seu caminho. Depois de enfrentar alguns desses mortos-vivos, você chega numa pequena colina, na qual há uma espécie de fogueira com uma espada fincada nela, que parece arder como fogo vivo. O que você vai fazer? a - Analisar a fogueira, ou b - Seguir caminho?");
            Unkindled.perdeHumanidade();
            String escolhaCaminho = k.nextLine();
            if(escolhaCaminho.equals("a")){
                System.out.println("Você decidiu analisar a fogueira, chegando mais perto você repara que o calor das brasas são muito reconfortantes, você se senta ao lado da fogueira e descansa.\n \u001B[32m Sua humanidade foi restaurada!! \u001B[0m");
                Unkindled.recuperaHumanidade();
                System.out.println(" Após seu descanso, você segue o caminho que te leva té uma parede de nevoa branca e vc atravessa ela, do outro lado você vê uma especie de armadura com uma espada fincada no meio, você sente a nescessidade de retirar a espada, fazendo isso a armadura começa a se mecher, era uma armadilha, você agora está lutando contra o \u001B[33m Iudex Gundyr \u001B[0m \n depois da luta você se vê machudado \u001B[31m perde 50 de humanidade \u001B[0m\n seguindo adiante você chega num lugar chamado fire link shrine e encontra uma fogueira igual a de antes porem bem maior vc desncasa nela \u001B[32m Sua humanindae foi restaurada! \u001B[0m \n Olhando para quele local você percebe que sua aventura apenas acabou de começar");
                Unkindled.perdeHumanidade();
                Unkindled.recuperaHumanidade();
                System.out.println("\u001B[36m Fim!! \u001B[0m");
                return;
            }
            else if(escolhaCaminho.equals("b")){
                System.out.println("Com a decisão de seguir seu caminho você chega em uma muralha de nevoa, atravessando-a você chega em uam arena com uma armadura no meio dela, você percebe que tem uma espada fincada nele que irresistivel mente você retira e assim a armudara ganha vida, você está contra o \u001B[33m Iudex Gundyr \u001B[0m \n Ele era forte demais para você que já estava ferido.\n \u001B[31m perde 50 de humanidade \u001B[0m");
                Unkindled.perdeHumanidade();
                if(Unkindled.humanidade == 0){
                    System.out.println("\n\n   \u001B[31m Você morreu \u001B[0m");
                    return;
                }
            }


        }
        k.close();

        

    }
}
