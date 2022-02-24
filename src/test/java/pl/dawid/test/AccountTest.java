package pl.dawid.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void  newAccountShouldNotBeActive(){
        //given+when
        Account newAccount = new Account();
        //then
        assertFalse(newAccount.isActive());
    }

    @Test
    public void accountShouldBeActiveAfterActivation(){
        //given
        Account newAccount = new Account();

        //when
        newAccount.setActive();
        //then
        assertTrue(newAccount.isActive());
    }

}
