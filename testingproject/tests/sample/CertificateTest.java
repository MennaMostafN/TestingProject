package sample;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class CertificateTest {

        Client cl = new Client("Mai", "123");
        Certificate c = new Certificate(cl,"Mai",100, 200);

        @Test
        public void getName()
        {
            assertEquals("Mai", c.getName());
        }

        @Test
        public void setName() {
            c.setName("Andrew");
            assertEquals("Andrew",c.Name);
        }

        @Test
        public void getBalance() {
            assertEquals(200, c.getBalance());
        }

        @Test
        public void setBalance()
        {
            assertEquals(200, c.getBalance());
        }

    }

