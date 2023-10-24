package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");

    int registeredActivities = Integer.parseInt(scanner.nextLine());
    int sumWeightActivities = 0;
    double totalGrade = 0;

    for (int index = 0; index < registeredActivities; index++) {
      System.out.println("Digite o nome da atividade " + (index + 1) + ":");
      String activityName = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (index + 1) + ":");
      int activityWeight = Integer.parseInt(scanner.nextLine());

      sumWeightActivities += activityWeight;

      System.out.println("Digite a nota obtida para " + activityName + ":");
      int activityNote = Integer.parseInt(scanner.nextLine());

      totalGrade += activityNote * activityWeight;
    }
    scanner.close();
    if (sumWeightActivities != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    double finalGrade = totalGrade / 100;

    if (finalGrade >= 85) {
      System.out.println("Parabéns! Você alcançou "
          + finalGrade
          + "%! E temos o prazer de informar que você obteve aprovação! ");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
              + finalGrade
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}