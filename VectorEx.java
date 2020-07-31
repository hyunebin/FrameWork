package framework;
/*
Vactor는 arrayList와 동일한 구조를 가지고 있음

list<E> list = new Vector<E>()

ArrayList와 다른점은 동기화된 메소드로 구성되었기 때문에 멀티 쓰레드가 동시에 Vector의 메소드를 실행할 수 없고, 하나의 스레드가 메소드를 완료해야
다른 메소드를 실행할 수 있다 그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다.

 */

import javax.swing.border.Border;
import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args){
        List<Board> list = new Vector<>();
        list.add(new Board("제목", "내용", "글쓴이"));
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));

        list.remove(2);
        list.remove(3);

        for(int i = 0; i < list.size(); i++){
            Board board  = list.get(i);
            System.out.println(board.subject + board.writer + board.content);
        }
    }
}

class Board{
    String subject;
    String content;
    String writer;

    public Board(String subject, String content, String writer){
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
}
