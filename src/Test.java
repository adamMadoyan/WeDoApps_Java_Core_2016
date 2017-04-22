public class Test {


    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        linkedList.add(-1);
        linkedList.add(100);
        linkedList.add(-2);
        linkedList.add(50);
        linkedList.add(500000000);

        linkedList.removeLatest();

        LinkedList.ListIterator iterator = linkedList.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("============================");

        linkedList.removeLessThen(7);

        iterator = linkedList.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}