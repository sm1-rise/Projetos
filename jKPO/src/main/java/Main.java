import java.util.Scanner;
public class Main {

    static int vidasJogador = 3;
    static int vidasOponente = 3;
    static int numJogadas = 3;

    static int jogadaJogador;
    static int jogadaOponente;
    static int opcoesJogadaOponente [] = {1,2,3};

    Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {


    }

    public int entradaDados(){
        jogadaJogador = sc.nextInt();
        return jogadaJogador;
    }


    public static void jogar(){
        for(int i = 0; i < numJogadas; i++){
            condicaoJogo();
        }
    }


    public static void textoJogo(){
        System.out.println("Digite um valor: ");
        System.out.println("1- Pedra");
        System.out.println("2- Papel");
        System.out.println("3- Tesoura");
        condicaoJogo();
    }

    public static void condicaoJogo(){

        while (jogadaJogador > 3 || jogadaJogador < 1){
            textoJogo();
        }

        switch (jogadaJogador){
            case 1:
                switch (jogadaOponente){
                    case 3:
                        System.out.println("Jogador ganhou!");
                            vidasOponente = vidasOponente - 1;
                        break;
                    case 2:
                        System.out.println("Maquina Ganhou!");
                            vidasJogador = vidasJogador - 1;
                        break;
                    case 1:
                        System.out.println("Empate!");
                } break;
            case 2:
                switch (jogadaOponente){
                    case 3:
                        System.out.println("Maquina ganhou");
                            vidasJogador = vidasJogador -1;
                        break;
                    case 2:
                        System.out.println("Empate!");
                        break;
                    case 1:
                        System.out.println("Jogador ganhou!");
                            vidasOponente = vidasOponente - 1;
                } break;
            case 3:
                switch (jogadaOponente){
                    case 3:
                        System.out.println("Empate");
                        break;
                    case 2:
                        System.out.println("Jogador ganhou");
                            vidasOponente = vidasOponente - 1;
                        break;
                    case 1:
                        System.out.println("Maquina ganhou!");
                            vidasJogador =  vidasJogador - 1;
                } break;
        }
    }
}
