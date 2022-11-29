package Multithreading;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        Proizvoditel proizvoditel = new Proizvoditel(market);
        Potrebitel potrebitel = new Potrebitel(market);
        Thread thread1 = new Thread(proizvoditel);
        Thread thread2 = new Thread(potrebitel);
        thread1.start();
        thread2.start();
    }
}

class Market {
    private int breadCount = 0;
    private final Object lock = new Object();

    public void getBread() {
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            breadCount--;
            System.out.println("Потребитель купил один хлеб");
            System.out.println("Количество хлеба в магазине = " + breadCount);
            lock.notify();
        }
    }

    public void putBread() {
        synchronized (lock) {
            while (breadCount >= 5) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            breadCount++;
            System.out.println("Производитель добавил на витрину один хлеб");
            System.out.println("Количество хлеба в магазине = " + breadCount);
            lock.notify();
        }
    }
}

class Proizvoditel implements Runnable {
    Market market = new Market();

    Proizvoditel(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Potrebitel implements Runnable {
    Market market = new Market();

    Potrebitel(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}