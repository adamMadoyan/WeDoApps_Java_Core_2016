package auditorium.collection.list;


public class LinkedListTest {

    public static void main(String[] args) {

        try {
            LinkedList<String> staff = new LikedListImpl<>();

            staff.addFirst("Tom");
            staff.addFirst("Romeo");
            staff.addFirst("Harry");
            staff.addFirst("Dick");

//      in the comments indicates the iterator position

            ListIterator iterator = staff.listIterator(); // |DHRT
            iterator.next(); // D|HRT
            iterator.next(); // DH|RT

//      add more elements after second element

            iterator.add("Juliet"); // DHJ|RT
            iterator.add("Nina"); // DHJN|RT

            iterator.next(); // DHJNR|T

//      remove last traversed element

            iterator.remove(); // DHJN|T

//      print all elements

            iterator = staff.listIterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
            System.out.println("Expected: 'Dick Harry Juliet Nina Tom'");
        } catch (Exception ex) {
            System.err.print(ex.getMessage());
        }

    }

}
