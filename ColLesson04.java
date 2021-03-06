package com.Word;
import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {


    public static void main(String[] args) {

        ArrayList<Word> words = new ArrayList<>();


        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください");
        Scanner sc = new Scanner(System.in);
        // 空白を入れて使用するため、nextLine
        String input = sc.nextLine();


        int index = 0;

        while (!input.equals("e")) {
//取得したinputを、splitで半角スペースで分割
//            split はStringの文字列
            String[] tmp = input.split("　");
            Word wd = new Word(tmp[0], tmp[1]);

            try {
                words.add(wd);
            }catch(IndexOutOfBoundsException e){
                System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
                break;
            }
            index++;
            System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
            input = sc.nextLine();
        }


        for (int i = 0; i < index; i++) {
            System.out.println("単語：" + words.get(i).word + " 意味：" + words.get(i).meaning);

        }
        System.out.println(words.size() + "件、登録しました。");
    }
}


