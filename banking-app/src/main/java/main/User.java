package main;

public class User {

    private String accountName;
    private Integer accountNumber;
    private Float accountBalance;

    public String getName() {
        return accountName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Float getBalance() {
        return accountBalance;
    }

    public void setAccountDetails(String name, Integer account) {
        this.accountName = name;
        this.accountNumber = account;
    }

    public String depositFunds(Integer depositAmount) {

        if (checkDeposit(depositAmount)) {
            this.accountBalance += depositAmount;
            return "Successfully deposited R" + depositAmount + ".\nNew balance is R" + this.accountBalance + ".";
        } else {
            return "Unable to deposit R" + depositAmount + ".";
        }
    }

    private boolean checkDeposit(Integer amount) {

        // can implement further checks at a later stage
        if (amount < 0) {
            return false;
        }
        return true;
    }

    public String withdrawFunds(Integer withdrawAmount) {

        if (checkWithdrawAmount(withdrawAmount)) {
            this.accountBalance -= withdrawAmount;
            return "Successfully withdrew R" + withdrawAmount + ".\nNew Balance is R" + this.accountBalance + ".";
        } else {
            return "Unable to withdraw R" + withdrawAmount + ".";
        }
    }

    private boolean checkWithdrawAmount(Integer amount) {

        // will implement further checks at a later stage such as withdraw limit
        if (amount > this.accountBalance) {
            return false;
        }

        return true;
    }
}