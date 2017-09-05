public class Message {
    private String sender;
    private String reciever;
    private String sentMessage;

    public String getSender() {return sender;}
    public String getReciever() {return reciever;}
    public String getSentMessage() {return sentMessage;}

    public void setSender(String temp) {this.sender = temp;}

    public void setReciever(String temp) {this.reciever = temp;}

    public void setSentMessage(String temp) {this.sentMessage = temp;}

    public String toString() {return "sender - " + this.sender + ", reciever - " + this.reciever + ", message - " + this.sentMessage;}
}