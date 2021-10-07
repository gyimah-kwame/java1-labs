package com.company;

public class TickToc  implements Runnable{

    private String word;
    private int delay;

    public TickToc(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                System.out.println(word);
                Thread.sleep(delay);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TickToc("tick", 50));
        Thread t2 = new Thread(new TickToc("toc", 100));

        t1.start();
        t2.start();
    }
}
