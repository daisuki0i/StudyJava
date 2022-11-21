public class Class5_class_HW1 {
}

class Message {
    String msgText;
    String sender;
    String receiver;
    String timeSent;
    boolean isRead;

    Message() {
        msgText = "Hello";
        timeSent = "00:00";
        isRead = false;
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

    String getRecciver() {
        return receiver;
    }

    void read() {
        isRead = true;
    }

    void unsend() {
        msgText = "Hello";
        sender = null;
        receiver = null;
        timeSent = "00.00";
        isRead = false;
    }

    public String toString() {
        return String.format("Message[msgText=%s,sender=%s,recciver=%s,timeSent=%s,isRead=%b]", msgText, sender,
                receiver, timeSent, isRead);
    }
}
