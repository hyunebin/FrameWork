package framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args){
        Queue<Message> messageQueue = new LinkedList<>();
        messageQueue.offer(new Message("Sendmail", "현빈"));
        messageQueue.offer(new Message("SendKAKAO", "길동"));
        messageQueue.offer(new Message("SendSNS", "동빈"));

        while (!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            switch (message.command){
                case "Sendmail" :
                    System.out.println(message.to +"님에게 메일을 보냅니다.");
                    break;
                case "SendKAKAO" :
                    System.out.println(message.to + "님에게 카톡을 보냅니다.");
                    break;
                case "SendSNS" :
                    System.out.println(message.to + "님에게 SNS를 보냅니다.");
                    break;
            }
        }
    }

}

class Message{
    public String command;
    public String to;

    public Message(String command, String to){
        this.command = command;
        this.to = to;
    }
}
