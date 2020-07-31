package framework;
/*
기본 생성자로 객체를 생성하면 10개의 객체를 저장할 수 있는 초기 용량을 가짐
ArrayList에 객체를 추가하면 인덱스는 0번부터 채워짐 중간의 인덱스가 제거된다면 제거된 인덱스부터 인덱스 번호가 1씩 감소
이런 동작 때문에 객체 수가 많고 특정 인덱스에 객체를 추가하거나 제거하는 경우가 빈번할 경우 LinkedList가 더 효율적
 */

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();  //<>안에 파라미터를 표기 안한경우는 왼쪽의 파라미터를 따라가게됨

        list.add("Java");
        list.add(1, "DB"); // 인덱스 1번에 DB를 추가

        int size = list.size();
        System.out.println("총객체의 수 = " + size );

        String skill = list.get(1);
        System.out.println("인덱스 1번은 : " + skill);


    }

}
