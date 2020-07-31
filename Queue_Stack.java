package framework;
/*
컬렉션 프레임워크에서는
LIFO == Stack
Last In First Out


FIFO == Queue
First In First Out

 */

import java.util.Stack;

public class Queue_Stack {
    public static void main(String[] args){
        Stack<coin> coinBox = new Stack<>();

        coinBox.push(new coin(100));
        coinBox.push(new coin(500));
        coinBox.push(new coin(200));
        coinBox.push(new coin(50));

        while(!coinBox.isEmpty()){
            coin c = coinBox.pop();
            System.out.println("꺼낸동전은 : " + c.getValue());
        }

    }
}

class coin{
    private int value;
    public coin(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
