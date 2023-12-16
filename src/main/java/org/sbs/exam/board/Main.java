package org.sbs.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.printf("명령 ) ");
      String cmd1 = sc.nextLine();
      System.out.println("== 게시물 등록 ==");
      System.out.printf("제목 : ");
      String cmd2 = sc.nextLine();
      System.out.printf("내용 : ");
      String cmd3 = sc.nextLine();
      System.out.println("1번 게시물이 등록 되었습니다.");
      System.out.println(" ");
    }
    /*
    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 게시판 시작 ==");


    System.out.printf("명령 )");
    String cmd = sc.nextLine();
    System.out.printf("입력된 명령어 : %s\n", cmd);
    */

  }
}