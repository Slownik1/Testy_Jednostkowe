package pl.dawid.test;

import sun.jvm.hotspot.debugger.Address;

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

    public Account() {
    }
}
