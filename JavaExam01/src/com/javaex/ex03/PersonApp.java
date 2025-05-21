package com.javaex.ex03;

import java.util.ArrayList;

public class PersonApp {
    public static void main(String[] args) {

        ArrayList<Person> pList = new ArrayList<>();

        // 유재석
        Person p1 = new Person("유재석", "010-1111-1111", "02-1111-1111");
        pList.add(p1);

        // 이효리
        Person p2 = new Person("이효리", "010-2222-2222", "02-2222-2222");
        pList.add(p2);

        // 박명수
        Person p3 = new Person("박명수", "010-3333-3333", "02-3333-3333");
        pList.add(p3);

        
        for (int i = 0; i<pList.size(); i++) {
            pList.get(i).showInfo();
        }
    }
}
