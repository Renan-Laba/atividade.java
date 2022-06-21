// Luiz Henrique da Silva de Oliveira e Renan Laba Bott

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Memoria {

    public static List<Integer> NumerosSorteados = new ArrayList<Integer>();
    public static List<Integer> NumerosEsc = new ArrayList<Integer>();
    public static Scanner sc = new Scanner(System.in);
    public static int Pont;
    public static Random gerador = new Random();

    public static void Sorteia() {
        int NumSort = 1 + gerador.nextInt(1 + 4);
        NumerosSorteados.add(NumSort);
    }

    public static void Escolha() {
        System.out.println("\nDigite a sequencia: ");
        NumerosEsc.add(sc.nextInt());
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        do {
            NumerosEsc.clear();
            Sorteia();
            for (int i = 0; i < NumerosSorteados.size(); i++) {
                NumerosSorteados.get(i);
                if (i == 0) {
                    System.out.printf("Rodada #%d: %d", NumerosSorteados.size(), NumerosSorteados.get(i));
                    Thread.sleep(1000);
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else if (i > 0) {
                    System.out.printf("\n%d", NumerosSorteados.get(i));
                    Thread.sleep(1000);
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }
            }

            for (int i = 0; i < NumerosSorteados.size(); i++) {
                Escolha();
            }
            if (NumerosEsc.equals(NumerosSorteados)) {
                Pont += 5;
            }

        } while (NumerosEsc.equals(NumerosSorteados));
        System.out.println("Você Perdeu!!");
        System.out.printf("Sua pontuação foi: %d", Pont);
    }
}