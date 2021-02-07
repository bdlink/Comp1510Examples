package ca.bcit.comp1510.ch04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
    final Account acct1 = new Account("Grace Hopper", 72354, 102.56);
    final Account acct2 = new Account("Edsger Dijkstra", 69713, 40.00);
    final Account acct3 = new Account("James Gosling", 93757, 759.32);

    @Test
    void testAccount() {
        assertSame("Grace Hopper", acct1.getName());
        assertEquals(72354, acct1.getAcctNumber());
        assertEquals(102.56, acct1.getBalance());
        
        assertSame("Edsger Dijkstra", acct2.getName());
        assertEquals(69713, acct2.getAcctNumber());
        assertEquals(40.00, acct2.getBalance());
        
        assertSame("James Gosling", acct3.getName());
        assertEquals(93757, acct3.getAcctNumber());
        assertEquals(759.32, acct3.getBalance());
    }

    @Test
    void testDeposit() {

        double hopperDeposit = 25.85;
        acct1.deposit(hopperDeposit);
        assertEquals(128.41, acct1.getBalance());

        double dijkstraBalance = acct2.deposit(500.00);
        assertEquals(540.00, dijkstraBalance);

        acct3.deposit(-759.32);
        assertEquals(0.0, acct3.getBalance());
    }

    @Test
    void testWithdraw() {
        
        assertEquals(25.72, acct1.withdraw(75.34, 1.50));

        double dijkstraWithDrawal = 430.75;
        double dijkstraBalance = acct2.withdraw(dijkstraWithDrawal, 1.50);
        assertEquals(-392.25, dijkstraBalance);

        assertEquals(1010.82, acct3.withdraw(-250, -1.5));
    }

    @Test
    void testAddInterest() {
        assertEquals(106.1496, acct1.addInterest());
        assertEquals(41.40, acct2.addInterest());
        assertEquals(785.8962, acct3.addInterest());
    }

    @Test
    void testToString() {
        assertEquals("72354\tGrace Hopper\t$102.56", acct1.toString());
        assertEquals("69713\tEdsger Dijkstra\t$40.00", acct2.toString());
        assertEquals("93757\tJames Gosling\t$759.32", acct3.toString());
    }

}
