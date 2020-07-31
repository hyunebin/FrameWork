package framework;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.util.HashMap;
import java.util.Map;

public class ObjectKey {
    public static void main(String[] args){
        Map<Student, Integer> map = new HashMap<Student, Integer>();

        map.put(new Student(1,"홍길동"),95);
        map.put(new Student(1, "홍길동"), 95);


        System.out.println("총 Entry수 : " + map.size());
    }

}

class Student{
    public int sno;
    public String name;

    public Student(int sno, String name){
        this.sno = sno;
        this.name = name;
    }

    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student student = (Student) obj;
            return (sno == student.sno) && (name == student.name);
        }
        else {
            return false;
        }

    }

    public int hashCode(){
        return sno + name.hashCode();
    }
}