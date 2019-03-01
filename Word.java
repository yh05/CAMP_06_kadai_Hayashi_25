package com.Word;

public class Word {

    public static String word;
    public static String meaning;

    public static void attack() {
        System.out.println(word + "は" + meaning);
    }

    public Word(String input_word, String input_meaning) {
        word = input_word;
        meaning = input_meaning;
    }
}

    //メソッド　クラスが持てる関数

