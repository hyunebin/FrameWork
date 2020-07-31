package framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map 컬렉션은 키와 값으로 구성된 객체를 Map.Entty에 저장하는 구조를 가지고 있음 여기서 키와 값은 모두 객체임
키는 중복저장될 수 있지만 값을 중복저장 가능

저장된 객체를 하나씩 얻어오는 방법

Map(K,V) map = ...;
Set<K> keySet = map.keySet();
Iterator<K> keyIterator = keySet.iterator();
while(keyIterator.hasNext()){
    K key = keyIterator.next()
    V value = map.get(key)
}

Set<Map.Entry<K,V>> entrySet = map.entrySet()
Iterator<Map.Entry<K,V>> entryInterator = entrySet.iterator();
while(entryIterator.hasNext()){
Map.Entry<K,V> entry = entryIterator.next();
K key = entry.getKey()
V value = entry.getValue()
}
 */
public class MapEx {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry수 = " + map.size());

        System.out.println("\t 홍길동: " + map.get("홍길동"));
        System.out.println();

        Set<String> Keyset = map.keySet();
        Iterator<String> keyInterator = Keyset.iterator();
        while(keyInterator.hasNext()){
            String key = keyInterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " = " + value);
        }

        System.out.println();

        map.remove("홍길동");
        System.out.println("총Entry 수 : " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator  = entrySet.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry  = entryIterator.next();
            String key = entry.getKey();
            Integer vlaue = entry.getValue();
            System.out.println("\t" + key + " : " + vlaue);
        }

        map.clear();
        System.out.println("총Entry 수 : " + map.size());

    }
}
