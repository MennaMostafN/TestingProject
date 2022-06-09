package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class BillTest {

    Bill b;
    Account A1;

    @BeforeEach
    public void init() {
        b = new Bill("105", "Mai", 150);
        A1 = new Account("Mai", 10, 200);
    }


    @Test
    void getBillOwner() {
        assertEquals("Mai", b.getBillOwner());
    }

    @Test
    void setBillOwner() {
        assertEquals("Mai", b.BillOwner);
    }

    @Test
    void getBillamount() {
        assertEquals(150, b.getBillamount());
    }

    @Test
    void setBillamount() {
        b.setBillamount(200);
        assertEquals(200, b.Billamount);
    }

    @Test
    void addToBillamountStub() {
        assertEquals(170, b.increaseBillamount(20));
    }

    @Test
    void payStub() {
        assertTrue(b.pay(A1, 120));
        assertEquals(30, b.Billamount);
        assertEquals(80, A1.getBalance());
        assertFalse(b.pay(A1, 300));
        assertEquals(30, b.Billamount);
        assertEquals(80, A1.getBalance());

    }
}
