package pl.dawid.test;


public class Account {

    boolean active;
    private Address defaultDeliveryAddress;

    public Account(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive() {
        this.active = true;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Address getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }

    public void setDefaultDeliveryAddress(Address defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }

    public Account() {


    }
}
