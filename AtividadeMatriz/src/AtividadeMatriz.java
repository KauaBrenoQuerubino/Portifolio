
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
//import java.util.Scanner;

public class AtividadeMatriz {

    public static void main(String[] args) {
        Random rd = new Random();
        int[][] MatrizDoBafomeeeeee = new int[4][4];
        int[] vetorDP = new int[4];
        int[] vetorDS = new int[4];
        ArrayList<Integer> vetorValoresImpares = new ArrayList<>();
        ArrayList<Integer> vetorValoresPares = new ArrayList<>();

        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                MatrizDoBafomeeeeee[i][j] = rd.nextInt(100);
            }
        }
        
        System.out.println("Matriz carregada: ");
        for(int i = 0; i < 4; i++){
            System.out.println("\n"); 
            for(int j = 0; j < 4; j++){
                System.out.print(MatrizDoBafomeeeeee[i][j] + "\t");   
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                   if(i == j){
                       vetorDP[i] = MatrizDoBafomeeeeee[i][j];
                   }
            }
        }
        Arrays.sort(vetorDP);
        System.out.print("\n\nVetorA [D.P.]: ");
        for(int i = 0; i < 4; i++){
           System.out.print(vetorDP[i] + "\t");
        }
        
         for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                   if((i + j) == 4-1){
                       vetorDS[i] = MatrizDoBafomeeeeee[i][j];
                   }
            }
        }
        Arrays.sort(vetorDS);
        System.out.print("\n\nVetorB [D.S.]: ");
        for(int i = 0; i < 4; i++){
           System.out.print(vetorDS[i] + "\t");
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                   if((MatrizDoBafomeeeeee[i][j] % 2 ) == 0 ){
                       vetorValoresPares.add( MatrizDoBafomeeeeee[i][j]);
                   }
                   else{
                       vetorValoresImpares.add( MatrizDoBafomeeeeee[i][j]);

                   }
            }
        }
        System.out.print("\n\nVetorC [Valores Pares]: ");
        for(int i = 0; i < vetorValoresPares.size(); i++){
           System.out.print(vetorValoresPares.get(i) + "\t");
        }
        System.out.print("\n\nVetorD [Valores Impares]: ");
        for(int i = 0; i < vetorValoresImpares.size(); i++){
           System.out.print(vetorValoresImpares.get(i) + "\t");
        }
        
        System.out.println("\n\nQuantidade de numeros pares: "+  vetorValoresPares.size());
        System.out.println("\nQuantidade de numeros impares: "+  vetorValoresImpares.size());

    }
    
}
//professor me contrata! ja sei matriz