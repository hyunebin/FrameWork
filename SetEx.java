package framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
List는 객체의 저장 순서를 유지하지만 Set은 저장 순서가 유지되지 않음 또한 객체를 중복해서 저장할 수 없고 하나의 null값만 저장가능

Set 컬렉션
1.HashSet
2.LikedHashSet
3.TreeSet

Set 컬랙션은 인덱스로 객체를 검색해서 가져오는 메소드가 ㅇ벗다. 대신 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자(iterator)를 제공
*iterator = 인터페이스를 구현하 객체

Set<String> set = ... ;
Iterator<String> iterator = set.iterator(); <  파라미터가 String 인 이유는 반복해서 가져올 객체가 String Type이기 떄문이다.

HashSet은 동일한 객체는 중복해서 저장하지 않음
원리는

저장된 객체의 Hashcode값을 비교한후 일치하면 equal메소드를 사용해 비교를 시작한다. 이것마자 동등객체로 판단되면 저장하지 않는다.

 */
public class SetEx {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("IBS");

        int size = set.size();
        System.out.println("총 객체의 수 = "+ size);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){ // hasnext = 다음 객체가 있다면 hasNext는 true를 리턴
            String element = iterator.next(); // 1개의 객체를 가져옴
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("IBS");

        System.out.println("현재 총 객체의 수 = " +set.size());

        for(String a : set){
            System.out.println("\t" + a);
        }

        set.clear();
        if(set.isEmpty()){System.out.println("객체가 없음");}
    }

}
