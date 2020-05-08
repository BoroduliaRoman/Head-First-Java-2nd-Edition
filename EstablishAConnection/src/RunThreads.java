public class RunThreads implements Runnable{
    public static void main(String[] args) {
        // Создаём один экземпляр Runnable
        RunThreads runner = new RunThreads();
        // Создаём два потока с одним заданием
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        // Имена потоков
        alpha.setName("потока Альфа");
        beta.setName("поток Бета");
        // Запускаем потоки
        alpha.start();
        beta.start();
    }

    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("Сейчас работает " + threadName);
        }
    }
}
