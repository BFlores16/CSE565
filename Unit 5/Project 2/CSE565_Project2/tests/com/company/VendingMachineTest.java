package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    public void dispenseCoffee() {
        VendingMachine vm = new VendingMachine();
        assertEquals(vm.dispenseItem(45, "coffee"), "Item dispensed.");
    }

    @Test
    public void dispenseCoke() {
        VendingMachine vm = new VendingMachine();
        assertEquals(vm.dispenseItem(50, "coke"), "Item dispensed and change of 25 returned");
    }

    @Test
    public void cantDispenseCandy() {
        VendingMachine vm = new VendingMachine();
        assertEquals(vm.dispenseItem(5, "candy"), "Item not dispensed, missing 15 cents. Cannot purchase item.");
    }

    @Test
    public void cantDispenseCoffee() {
        VendingMachine vm = new VendingMachine();
        assertEquals(vm.dispenseItem(44, "coffee"), "Item not dispensed, missing 1 cents. Can purchase candy or coke.");
    }

}