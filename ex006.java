import java.util.Scanner;
public class ex006{
    public static void main( String[] args){
        Scanner s = new Scanner( System.in);//Abre i scanner
        int pt = 0, pdt = 0, pl = 0, psdb = 0, nulo = 0, branco = 0; //Declaração das variáveis
        for(int i=0; i < 50; i++){//Laço de repetição FOR
            int voto;//Declaração da variável do voto
            System.out.println("Em quem irá votar? Digite o número correspondente.(1-PT | 2-PDT | 3-PL | 4-PSDB | 5-NULO | 6-BRANCO)");//Mostrando as opções para os usuários
            voto = s.nextInt();//Pega a resposta do usuário e armazena na variável voto

            if(voto == 1 ){//Consdição SE o voto for 1 
                pt = pt + 1;//Soma var pt mais 1
            }else if(voto == 2 ){//Consdição SE o voto for 2
                pdt = pdt + 1;//Soma var pdt mais 1
            }else if(voto == 3 ){//Consdição SE o voto for 3 
                pl = pl + 1;//Soma var pl mais 1
            }else if(voto == 4 ){//Consdição SE o voto for 4
                psdb = psdb + 1;//Soma var psdb mais 1
            }else if(voto == 5 ){//Consdição SE o voto for 5 
                nulo = nulo + 1;//Soma var nulo mais 1
            }else if(voto == 6 ){//Consdição SE o voto for 6 
                branco = branco + 1;//Soma var branco mais 1
            }else{//Condição final
                System.out.println("Opção de voto inválido!");//Fala ao usuário que a opção de voto é inválida
            }
        }
        System.out.println("Votos no PT: " + pt);//Mostra ao usuáio os votos no pt
        System.out.println("Votos no PDT: " + pdt);//Mostra ao usuáio os votos no pdt
        System.out.println("Votos no PL: " + pl);//Mostra ao usuáio os votos no pl
        System.out.println("Votos no PSDB: " + psdb);//Mostra ao usuáio os votos no psdb
        System.out.println("Votos NULO: " + nulo);//Mostra ao usuáio os votos nulos
        System.out.println("Votos em BRANCO: " + branco);//Mostra ao usuáio os votos em branco

        s.close();//Fecha o scanner
    }
}