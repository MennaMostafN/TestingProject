package sample;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class AccountTest {


            Account a1 = new Account("Mai", 10, 40);


        @Test
        public void getBalance() {
            assertEquals(40, a1.getBalance());
        }

        @Test
        public void setBalance() {
            assertEquals(40, a1.getBalance());
        }

        @Test
        public void getName() {
            assertEquals("Mai", a1.getName());
        }

        @Test
        public void setName() {
            a1.setName("Andrew");
            assertEquals("Andrew", a1.getName());
        }

        @Test
        public void getID() {
            assertEquals(10, a1.getID());
        }

        @Test
        public void setID() {
            assertEquals(10, a1.getID());
        }

        @Test
        public void WithDrawMoneyStub() {
            a1.WithDrawMoney(10);
            assertEquals(30, a1.getBalance());
        assertTrue(a1.WithDrawMoney(15));
        assertFalse(a1.WithDrawMoney(50));
        }

        @Test
        public void AddMoneyStub() {
        a1.AddMoney(10);
        assertEquals(50, a1.getBalance());
    }

        @Test
        public void transferAccountStub() {
            Account a2 = new Account("Andrew", 20, 400);
            a1.transferMoney(a2,2);
            assertEquals(38, a1.getBalance());
            assertEquals(402,a2.getBalance());
        }
    }
