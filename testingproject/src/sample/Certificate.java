package sample;
public class Certificate {
        Client c1;
        String Name;
        double price;
        int balance;
    public Certificate(Client buyer, String Name, double price, int balance)
    {
        this.c1 = new Client(buyer.getName(), buyer.getPassword());
        this.Name = Name;
        this.price = price;
        this.balance = balance;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
