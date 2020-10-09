package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CuentaCorrienteTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    CuentaCorriente cc1 = new CuentaCorriente("Cuenta1", 1234567890, 5);
    CuentaCorriente cc2 = new CuentaCorriente("Cuenta2", 234567, 2);


    @BeforeEach
    public void setUp(CuentaCorriente cc1, CuentaCorriente cc2){
        cc1 = new CuentaCorriente("Cuenta1", 1234567890, 5);
        cc2 = new CuentaCorriente("Cuenta2", 234567, 2);
        //CuentaCorriente cc3 = new CuentaCorriente("Cuenta3", 13456, null);
    }

    @Test
    public void depositTest1(){
        assertTrue(cc1.deposit(1));
    }

    @Test
    public void depositTest2(){
        assertFalse(cc1.deposit(-1));
    }

    @Test
    public void withdrawTest11(){
        assertTrue(cc1.withdraw(3,1F));
    }

    @Test
    public void withdrawTest12(){
        assertFalse(cc1.withdraw(3,3F));
    }

    @Test
    public void withdrawTest13(){
        assertFalse(cc1.withdraw(3,-1F));
    }

    @Test
    public void withdrawTest14(){
        assertFalse(cc1.withdraw(-3,1));
    }

    @Test
    public void withdrawTest15(){
        assertFalse(cc1.withdraw(-3,-1));
    }

    @Test
    public void withdrawTest21(){
        assertTrue(cc2.withdraw(3,1F));
    }

    @Test
    public void withdrawTest22(){
        assertFalse(cc2.withdraw(3,3F));
    }

    @Test
    public void withdrawTest23(){
        assertFalse(cc2.withdraw(3,-1F));
    }

    @Test
    public void withdrawTest24(){
        assertFalse(cc2.withdraw(-3,1));
    }

    @Test
    public void withdrawTest25(){
        assertFalse(cc2.withdraw(-3,-1));
    }


}
