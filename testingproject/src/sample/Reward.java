package sample;

public class Reward {
    String Name;
    int price;

    int OfferNumber = 3;
    public Reward(String Name, int Price)
    {
        this.Name = Name;
        this.price = Price;
    }

    public Reward(String Name, int Price, int Number)
    {
        this(Name, Price);
        this.OfferNumber = Number;
    }
    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public int getOfferNumber() {
        return OfferNumber;
    }
    public Boolean Redeem(int price)
    {
        if(price >= this.price)
        {
            this.OfferNumber--;
            return true;
        }
        return false;
    }
    public void setOfferNumber(int offerNumber) {
        OfferNumber = offerNumber;
    }

}