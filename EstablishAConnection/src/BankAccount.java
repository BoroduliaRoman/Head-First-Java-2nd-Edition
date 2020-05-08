public class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void withdraw (int amount) {
        balance = balance - amount;
    }
}

class RyanAndMonicaJob implements Runnable {

    // У нас будет только один экземпляр MonicaAndRyanJob. Это означает что оба потока будут получать доступ к одному
    // банковскому счёту.

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        // Экземпляр Runnable(задача)
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        // Создаём два потока с одной задачей Runnable. Это означает, что оба потока будут работать с одним экземпляром
        // счёта, который находится в классе Runnable
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    // В методе run() поток зацикливается и при каждой итерации пытается снять деньги со счёта. После снятия он ещё раз
    // проверяет баланс, чтобы убедиться, что лимит не привышен
    public void run() {
        for (int x = 0; x < 10; x++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Превышение лимита!");
            }
        }
    }

    // Проверяем баланс и если на счету недостаточно денег, просто выводим сообщение. Если же средств хватает,
    // приостанавливаем поток, затем возобновляем его, чтобы завершить транзакцию
    private void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " собирается снять деньги");
            try {
                System.out.println(Thread.currentThread().getName() + " идёт подремать");
                Thread.sleep(500);
            } catch (InterruptedException e) {e.printStackTrace();}
            System.out.println(Thread.currentThread().getName() + " просыпается");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " заканчивает транзакцию");
        }
        else {
            System.out.println("Извините, для клиента" + Thread.currentThread().getName() + " недостаточно денег");
        }
    }
}
