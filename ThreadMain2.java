package thread_0422;

public class ThreadMain2 {
    public static void main(String[] args) {
        // 定义方法
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名：" +
                        Thread.currentThread().getName());
            }
        };
        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(runnable, "张三");
            Thread t2 = new Thread(runnable, "李四");
            Thread t3 = new Thread(runnable, "王五");
            t1.setPriority(1); // 优先级最小
//            t2.setPriority(Thread.MIN_PRIORITY); // 优先级最小
            t3.setPriority(Thread.MAX_PRIORITY); // 最高的优先级
            t1.start();
            t2.start();
            t3.start();
        }

    }
}
