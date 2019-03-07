package com.circle;

public class Person {
    private String name;
    private String origin;

    public Person(String name,String origin){
        this.name = name;
        this.origin = origin;

    }

    public void selfIntroduction() {
        System.out.println("私の名前は"+ this.name + "です。" + this.origin + "出身");
    }
}
