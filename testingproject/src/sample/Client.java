package sample;

public class Client {
    private String name;
    private int age;
    private String password;
    Account a1;
    public Client(String name, String password, int age)
    {
        this.name = name;
        this.password = password;
        this.age = age;
    }
    public Client(String name, String password)
    {
        this.name = name;
        this.password = password;
    }
    public Client(String Name, String Password,String a1Name, int ID, int Balance)
    {
        this(Name, Password);
        a1 = new Account(a1Name,ID,Balance);
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    public String getPassword() {
        return password;
    }
    public boolean AddMoney(Account a1, int amount)
    {
        return a1.AddMoney(amount);
    }    public Boolean buyCertificates(Client buyer,String Name, double price, int balance)
    {
        if(balance > 0)
        {
            Certificate c = new Certificate(buyer,Name,price,balance);
            return true;
        }
        return false;
    }
    public boolean WithDrawAccount1(int amount)
    {
        return(this.a1.WithDrawMoney(amount));
    }
}



