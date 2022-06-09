package sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class RewardTest {
    Reward r;
    @BeforeEach
    public void init()
    {
        r = new Reward("Mai", 200, 3);
    }
    @Test
    void getName() {
        assertEquals("Mai", r.getName());
    }

    @Test
    void setName() {
        assertEquals("Mai" , r.Name);
    }

    @Test
    void getPrice() {
        assertEquals(200,r.price);
    }

    @Test
    void setPrice() {
        r.setPrice(70);
        assertEquals(70,r.price);
    }

    @Test
    void getOfferNumber() {
        assertEquals(3,r.getOfferNumber());
    }

    @Test
    void setOfferNumber() {
        r.setOfferNumber(10);
        assertEquals(10,r.OfferNumber);
    }

    @Test
    void RedeemStub() {
        assertTrue(r.Redeem(200));
        assertEquals(2,r.OfferNumber);
    }
    
}