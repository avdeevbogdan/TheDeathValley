package entity;

import java.util.Objects;

public class Account {

    private int accountid;
    private int account;
    private int userid;

    public Account() {
    }

    public Account(int accountid, int account, int userid) {
        this.accountid = accountid;
        this.account = account;
        this.userid = userid;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return (accountid + " " + account + " " + userid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account1 = (Account) o;
        return accountid == account1.accountid &&
                account == account1.account &&
                userid == account1.userid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountid, account, userid);
    }
}
