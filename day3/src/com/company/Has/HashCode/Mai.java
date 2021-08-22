package com.company.Has.HashCode;

import java.util.HashMap;
import java.util.Map;

public class Mai {
    public static void main(String[] args) {
        Student student=new Student("aa","aaaaaaaa",15);
        Student student1=new Student("bb","bbbbbbb",20);
        Student student2=new Student("cc","ccccccc",25);
        Student student3=new Student("dd","ddddddd",28);

        Map<Student,Double> map=new HashMap<>();
        map.put(student,7.5);
        map.put(student1,18.0);
        map.put(student2,8.9);
        System.out.print(map);

    }
}
