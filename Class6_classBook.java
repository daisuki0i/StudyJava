import java.util.*;

public class Class6_classBook {
    static void printForEach(ArrayList<Message> list) {
        for (Message meg : list) {
            System.out.println(meg.toString());
        }
    }

    static void printForLoop1(ArrayList<Message> list) {
        for (int i = 0; i < list.size(); i++) {
            Message meg = list.get(i);
            System.out.println(meg);
        }
    }

    static void printForLoop2(ArrayList<Message> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    static void printReplace(ArrayList<Message> list) {
        System.out.println(list.toString().replace("[", "")
                .replace("]", "")
                .replace(" , ", "\n"));
    }

    static void filter(ArrayList<Message> list, String str) {
        for (Message meg : list) {
            String text = meg.getMsgText();
            if (text.startsWith(str.toUpperCase()) || text.startsWith(str.toLowerCase())) {
                System.out.println(meg.toString());
            }
        }
    }

    static void filterCharAt(ArrayList<Message> list, char c) {
        for (Message meg : list) {
            String text = meg.getMsgText();
            if (text.charAt(0) == c) {
                System.out.println(meg.toString());
            }
        }
    }

    static ArrayList<Message> filterToArrayList(ArrayList<Message> list, String str) {
        ArrayList<Message> filtered = new ArrayList<>();
        for (Message meg : list) {
            String text = meg.getMsgText();
            if (text.startsWith("h".toUpperCase()) || text.startsWith("h".toLowerCase())) {
                filtered.add(meg);
            }
        }
        return filtered;
    }

    static ArrayList<Message> filterOnlyM(ArrayList<Message> list, String str) {
        ArrayList<Message> onlyM = new ArrayList<>();
        for (Message meg : list) {
            String senDer = meg.getSender();
            if (senDer.startsWith(str)) {
                onlyM.add(meg);
            }
        }
        return onlyM;

    }

    public static void main(String[] args) {
        // Message meg = new Message();
        // Message meg2 = new Message("ilysb", "Tsuki", "mod", "11:11");
        // meg.setMsgText("Tsuki");
        // Message msg3 = new Message("ily2", "mod", "Tsuki", "11:11");
        // meg2.read();
        // System.out.println(meg2);
        // msg3.read();
        // System.out.println(msg3);

        Scanner sc = new Scanner(System.in);
        int numInput = Integer.parseInt(sc.nextLine());
        ArrayList<Message> msgList = new ArrayList<>();

        for (int i = 0; i < numInput; i++) {
            String msgText = sc.next();
            String sender = sc.next();
            String receiver = sc.next();
            String timeSent = sc.next();

            msgList.add(new Message(msgText, sender, receiver, timeSent));
        }

        // printForEach(msgList);

        // printForLoop1(msgList);

        // printForLoop2(msgList);

        // printReplace(msgList);

        // filter(msgList, "H");

        // filterCharAt(msgList, 'H');

        // msgList.add(new Message());
        // msgList.add(new Message("test", "elon", "me", "01:00"));

        // System.out.println(msgList);

        ArrayList<Message> onlyH = filterToArrayList(msgList, "H");
        // System.out.println(onlyH);
        ArrayList<Message> senDerM = filterOnlyM(msgList, "M");
        // System.out.println(senDerM);
        printForEach(senDerM);

        sc.close();
    }
}

class Message {
    String msgText;
    String sender;
    String receiver;
    String timeSent;
    Boolean isRead;

    Message() {
        msgText = "Hello";
        timeSent = "00:00";
    }

    Message(String msgText, String sender, String receiver, String timeSent) {
        this.msgText = msgText;
        this.sender = sender;
        this.receiver = receiver;
        this.timeSent = timeSent;
    }

    void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    String getMsgText() {
        return msgText;
    }

    String getSender() {
        return sender;
    }

    String getReceiver() {
        return receiver;
    }

    void read() {
        isRead = true;
    }

    void unsend() {
        msgText = "Hello";
        sender = null;
        receiver = null;
        timeSent = "00:00";
        isRead = false;
    }

    public String toString() {
        return String.format("msgText: %s, sender: %s, receiver: %s, timeSent: %s, isRead: %b ", msgText, sender,
                receiver,
                timeSent, isRead);
    }
}
