package sample;

public class Account {
    String Name;
    int ID;
    int Balance;

    public Account(String Name, int ID) {
        this.Name = Name;
        this.ID = ID;
    }
    public Account(String Name, int ID, int Balance)
    {
        this.Name = Name;
        this.ID = ID;
        this.Balance = Balance;
    }
    public Account(String Name)
    {
        this.Name = Name;
    }

    public boolean WithDrawMoney(int Balance)
    {
        if(Balance < this.Balance)
        {
            this.Balance -= Balance;
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean AddMoney(int Balance)
    {
        this.Balance += Balance;
        return true;
    }
    public void transferMoney(Account SendToAccount, int Balance)
    {
        this.Balance -= Balance;
        SendToAccount.Balance  += Balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}


