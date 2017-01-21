package auditorium.lesson11;


public class ProducerConsumerDemo {

    public static void main(String[] args) {
        ProducerConsumerDemo demo = new ProducerConsumerDemo();
        Producer producer = new Producer(demo);
        producer.start();
        Producer producer1 = new Producer(demo);
        producer1.start();
        Producer producer2 = new Producer(demo);
        producer2.start();
        Producer producer3 = new Producer(demo);
        producer3.start();
        Producer producer4 = new Producer(demo);
        producer4.start();
        Consumer consumer = new Consumer(demo);
        consumer.start();
    }

    private volatile String value;
    private volatile int iterator;
    private volatile boolean isProduced = false;

    public ProducerConsumerDemo() {
        value = null;
        iterator = 1;
    }

    public synchronized void produce() {
        while (isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value = "Product_" + iterator++;
        System.out.println("Produced " + value);
        isProduced = true;
        notify();
    }

    public synchronized void consume() {
        while (!isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed " + value);
        isProduced = false;
        notify();
    }

}

class Consumer extends Thread {
    private ProducerConsumerDemo consumerDemo;

    public Consumer(ProducerConsumerDemo consumerDemo) {
        this.consumerDemo = consumerDemo;
    }

    @Override
    public void run() {
        while (true) {
            consumerDemo.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                // Do nothing :)
            }
        }
    }
}

class Producer extends Thread {
    private ProducerConsumerDemo producerDemo;

    public Producer(ProducerConsumerDemo producerDemo) {
        this.producerDemo = producerDemo;
    }

    @Override
    public void run() {
        while (true) {
            producerDemo.produce();
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

