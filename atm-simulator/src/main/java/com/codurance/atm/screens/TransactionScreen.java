package com.codurance.atm.screens;

import com.codurance.atm.account.Account;
import com.codurance.atm.infrastructure.CliPrompt;

public class TransactionScreen implements Screen {
    private final CliPrompt cliPrompt;
    private Account account;

    public TransactionScreen(CliPrompt cliPrompt, Account account) {
        this.cliPrompt = cliPrompt;
        this.account = account;
    }

    @Override
    public Screen show() {
        cliPrompt.transactionScreenMenu(account.accountNumber(), account.balance());
        return new WithdrawScreen();
    }

    @Override
    public ScreenEnum screenName() {
        return ScreenEnum.TRANSACTION;
    }
}
