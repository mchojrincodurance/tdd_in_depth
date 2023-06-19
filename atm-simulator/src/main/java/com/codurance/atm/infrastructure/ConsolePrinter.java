package com.codurance.atm.infrastructure;

public class ConsolePrinter implements Printer {
    @Override
    public void prompt(String printLine) {
        System.out.print(printLine);
    }
}
