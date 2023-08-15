package main;

import java.util.Random;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Random random = new Random(); //constructor, devuelve una instancia de la clase random
    Scanner input = new Scanner(System.in); //system.in = standar input stream
    int nRandom = random.nextInt(100) + 1; //declara la variable nRandom y le aigna un numero aleatorio entre 0 y 99
    System.out.println("Estoy pensando en un número entre 1 y 100 (incluidos ambos). ¿Podés adivinarlo?");
    System.out.println("Escribí un número: ");
    int tuNum = input.nextInt();
    if (nRandom != tuNum) {
      tuNum = recurs(nRandom, tuNum);
      if (tuNum == nRandom) {
        System.out.println("¡Bien! ¡Lo adivinaste! El número era: " + nRandom);
      }
    } else {
      System.out.println("¡Lo adivinaste a la primera! ¿Cuáles son las probabilidades de eso? ¡Felicidades!");
    }
    input.close();
  }

  public static int recurs(int nRandom, int tuNum) {
    Scanner input = new Scanner(System.in);
    do {
      if (tuNum > nRandom) {
        System.out.println("Demasiado alto. Intentá un número más pequeño: ");
      } else if (tuNum < nRandom) {
        System.out.println("Demasiado bajo. Intentá un número más grande: ");
      } else {
        break;
      }
      tuNum = input.nextInt();
      if (nRandom != tuNum) {
        tuNum = recurs(nRandom, tuNum);
      }
    } while (tuNum != nRandom);
    input.close();
    return tuNum;

  }
}
