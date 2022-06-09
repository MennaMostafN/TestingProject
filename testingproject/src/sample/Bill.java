package sample;

public class Bill {
    String BillOwner;
    int Billamount;
    Account A1;

    public Bill(String AccountName, String BillOwner, int Billamount) {
        A1 = new Account(AccountName);
        this.BillOwner = BillOwner;
        this.Billamount = Billamount;
    }

    public String getBillOwner() {
        return BillOwner;
    }

    public void setBillOwner(String BillOwner) {
        BillOwner = BillOwner;
    }

    public int getBillamount() {
        return Billamount;
    }

    public int increaseBillamount(int x) {
        return (this.Billamount + x);
    }

    public void setBillamount(int Billamount) {
        this.Billamount = Billamount;
    }

    public Boolean pay(Account A1, int price) {
        if (price <= A1.getBalance() && price <= this.Billamount) {
            this.Billamount -= price;
//            this.A1.Balance += price;
            A1.Balance -= price;
            return true;
        } else if (price >= this.Billamount && price <= A1.getBalance()) {
            this.Billamount = 0;
            int x1 = price - this.Billamount;
            A1.Balance -= x1;
        }
        return false;
    }
}
