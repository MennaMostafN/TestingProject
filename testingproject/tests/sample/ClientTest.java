package sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

        Client C1 = new Client("Mai", "123","acc1",10,100);
        @Test
        public void getName() {
            assertEquals("Mai", C1.getName());
        }

        @Test
        public void setName() {
            C1.setName("Mai");
            assertEquals("Mai",C1.getName());
        }

        @Test
        public void getPassword() {
            assertEquals("123", C1.getPassword());
        }

        @Test
        public void setPassword() {
            C1.setPassword("123");
            assertEquals("123",C1.getPassword());
        }

        @Test
        public void getAge() {
            C1.setAge(20);
            assertEquals(20, C1.getAge());
        }

        @Test
        public void setAge() {
            C1.setAge(20);
            assertEquals(20,C1.getAge());
        }

        @Test
        public void AddMoneyStub1() {
            assertEquals(100, C1.a1.getBalance());
            System.out.println(C1.a1.getBalance());
           // assertEquals(100, C1.AddMoney(C1.a1,100));
        }

        @Test
        public void buyCertificatesStub2() {
            assertTrue(C1.buyCertificates(C1,"Silver",10,10));
            System.out.println(C1.a1.getBalance());
            assertFalse(C1.buyCertificates(C1,"Silver",150,0));
        }

        @Test
        public void withdrawa1Stub3() {
            System.out.println(C1.a1.getBalance());
            C1.a1.AddMoney(30);
            assertTrue(C1.WithDrawAccount1(20));

        }

    }
