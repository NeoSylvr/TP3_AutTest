package main;

public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        if(count > 0) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        System.out.println("Résultat du test de la classe Counter : " + counter.getCount());
    }
}