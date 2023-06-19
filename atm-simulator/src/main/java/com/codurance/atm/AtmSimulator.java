package com.codurance.atm;

import com.codurance.atm.account.AccountService;
import com.codurance.atm.infrastructure.CliPrompt;
import com.codurance.atm.infrastructure.ConsolePrinter;
import com.codurance.atm.screens.Screen;
import com.codurance.atm.screens.ScreenEnum;
import com.codurance.atm.screens.WelcomeScreen;

public class AtmSimulator {

    private Screen screen;

    public AtmSimulator(Screen screen) {
        this.screen = screen;
    }

    public void showScreen() {
        do{
            screen = screen.show();
        } while (screen != null);
    }

    public static void main(String[] args) {
        AtmSimulator atmSimulator = new AtmSimulator(
                new WelcomeScreen(
                        new CliPrompt(System.in, new ConsolePrinter()),
                        new AccountService()));
        atmSimulator.showScreen();
    }
}
