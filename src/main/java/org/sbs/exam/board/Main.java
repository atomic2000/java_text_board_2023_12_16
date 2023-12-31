package org.sbs.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int articleLastId = 0;

    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 게시판 시작 ==");


    while (true) {
      System.out.printf("명령 ) ");
      String cmd = sc.nextLine();

      if (cmd.equals("user")) {
        System.out.println("== 게시물 등록 ==");
        System.out.printf("제목 : ");
        String title = sc.nextLine();
        System.out.printf("내용 : ");
        String body = sc.nextLine();

        int id = articleLastId + 1;

        Article article = new Article();
        article.id = id;
        article.title = title;
        article.body = body;

        System.out.println("생성 된 게시물 객체 : " + article);
        System.out.printf("%d번 게시물이 등록되었습니다.\n", id);
        articleLastId++;



      }
      else if (cmd.equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }
    }

    System.out.println("== 게시판 실행 끝 ==");

    sc.close();
  }
}

class Article {
  int id;
  String title;
  String body;

  @Override
  public String toString() {
    return String.format("{id : %d, title : \"%s\", body : \"%s\"}", id, title, body);
  }
}