package framework;
/*
ArrayList와 사용법은 같지만 내부구조가 완전히 다름
ArrayList는 배열 내부에 객체를 저장해서 관리하지만
LinkedList는 인접 참조를 링크해서 체인처럼 관리

LinkedList에서는 특정 인덱스를 제거하면 앞뒤링크만 변경되고 나머지 링크는 변동 x
                순차적 추가/삭제       중간에서 추가/삭제      검색
ArrayList           빠르다                 느리다            빠르다
LinkedList          느리다                 빠르다            느리다.

 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long StartTime;
        long EndTime;

        StartTime = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            list1.add(0, String.valueOf(i));
        }

        EndTime = System.nanoTime();

        System.out.println(" ArrayList 걸린 시간 = " + (EndTime - StartTime));


        StartTime = System.nanoTime();

        for(int i = 0; i < 10000; i++){
            list2.add(0,String.valueOf(i));
        }

        EndTime = System.nanoTime();

        System.out.println(" LinkedList 걸린 시간 = " + (EndTime - StartTime));



    }
}
