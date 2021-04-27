package thread_0422;

public class ThreadMain4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            // 在守护线程的内部创建的线程
            Thread t2 = new Thread(() -> {
            });
            System.out.println("t2 是：" +
                    (t2.isDaemon() == true ? "守护线程" : "用户线程"));
        });
        // 设置为守护线程
        t1.setDaemon(false);
        t1.start();
        System.out.println("t1 是否为守护线程：" + t1.isDaemon());

    }
}
