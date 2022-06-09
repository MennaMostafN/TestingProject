package sample;

public class Transaction {
private String Name;
Account SendFrom;
Account SendTo;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Account getSendFrom() {
        return SendFrom;
    }

    public void setSendFrom(Account sendFrom) {
        SendFrom = sendFrom;
    }

    public Account getSendTo() {
        return SendTo;
    }

    public void setSendTo(Account sendTo) {
        SendTo = sendTo;
    }
}
