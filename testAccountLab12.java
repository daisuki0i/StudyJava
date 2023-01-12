public class testAccountLab12 {
    int id;
    String name;
    int balance;

    testAccountLab12() {
        balance = 0;
    }

    testAccountLab12(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    int getID() {
        return id;
    }

    String getName() {
        return name;
    }

    int getBalance() {
        return balance;
    }

    int credit(int amount) {
        balance -= amount;
        return balance;
    }

    int debit(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        return balance;
    }

    int transferTo(testAccountLab12 acct, int amount) {
        if (balance >= amount) {
            balance -= amount;
            acct.balance = amount;
        }
        return balance;
    }
}
