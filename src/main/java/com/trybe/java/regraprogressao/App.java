package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");

    int registeredActivities = Integer.parseInt(scanner.nextLine());

    for (int index = 0; index < registeredActivities; index++) {
      System.out.println("Digite o nome da atividade " + (index + 1) + ":");
      String activityName = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (index + 1) + ":");
      int activityNote = Integer.parseInt(scanner.nextLine());
    }

    scanner.close();
  }
}