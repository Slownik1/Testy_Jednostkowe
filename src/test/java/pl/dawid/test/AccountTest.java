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

    @Test
    public void newlyCreatetAccountShouldHaveAdressValueAsNull(){

        //given
        Account account = new Account();

        //when
        Address address = (Address) account.getDefaultDeliveryAddress();

        //then
        assertNull(address);

    }

    @Test
    public void newlyCreatetAccountShouldNotHaveAdressValueAsNull(){

        //given
        Address address = new Address("Krakowska", "11");
        Account account = new Account();
        account.setDefaultDeliveryAddress(address);

        //when
        Address adres = account.getDefaultDeliveryAddress();

        //then
        assertNotNull(adres);

    }

}
