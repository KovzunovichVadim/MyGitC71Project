public class TestLinkedList {
    public static void main(String[] args) {
        // Создаем первую ноду
        NodeCustom head = new NodeCustom(31, null);

        // Создаем вторую ноду
        head.next = new NodeCustom(27, null);

        // Создаем третью ноду
        head.next.next = new NodeCustom(666, null);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
