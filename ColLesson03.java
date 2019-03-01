package com.Word;

import java.util.Scanner;

public class ColLesson03 {
//    Word word = new Word();
//



    public static void main(String[] args) {
        String[] word = new String[10];
        String[] meaning = new String[10];



//        for (int i = 0; i < 4.; i++) {
//            System.out.println(question[i]);
//
//            for (int j = 0; j < 4.; j++) {
//                System.out.print(choices[j]);
//
//            }
        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください");
        System.out.println();
        Scanner sc = new Scanner(System.in);


        while (sc2.hasNext()) {                   //ScannerクラスのhasNext()メソッド
            System.out.println(sc2.next());     //next()メソッドを使い文字を分割
        }

        String[] word = sc.split(",");
        String[] meaning = sc.split(" ");

        int i = 0;
        while(word[i] != "e") {
            System.out.println("次の単語と意味を入力してください。"+"e"+"で終了します");

        System.out.println();
        Scanner sc = new Scanner(System.in);

        while(sc2.hasNext()){                   //ScannerクラスのhasNext()メソッド
            System.out.println(sc2.next());     //next()メソッドを使い文字を分割
        }

        String[] word = sc.split(",");
        String[] meaning = sc.split(" ");


        }


        for (int x= 0; x < word.length; x++) {
            Word.attack();


        }
    }
}
//
