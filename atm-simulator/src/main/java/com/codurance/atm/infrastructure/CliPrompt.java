package com.codurance.atm.infrastructure;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Scanner;

public class CliPrompt {
    private static final String HOME_SCREEN_MENU =
            "Account number {0}, balance {1}\n" +
            "1. Withdraw\n" +
            "2. Fund Transfer\n" +
            "3. Exit\n" +
            "Please choose option [3]: ";;
    private final Scanner scanner;
    private final Printer printer;

    public CliPrompt(InputStream is, Printer printer) {
        this.scanner = new Scanner(is);
        this.printer = printer;
    }

    public String accountNumber() {
        printer.prompt("Enter Account Number: ");
        return scanner.next();
    }

    public String pin() {
        printer.prompt("Enter PIN: ");
        return scanner.next();
    }

    public String transactionScreenMenu(String accountNumber, String balance) {
        printer.prompt(MessageFormat.format(HOME_SCREEN_MENU, accountNumber, balance));
        return scanner.next();
    }

    public void promptGenericMessage(String anyMessage) {
        printer.prompt(anyMessage);
    }
}
