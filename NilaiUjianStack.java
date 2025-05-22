class NilaiUjianStack extends StackLinkedList {

    public int hitungTotal() {
        int total = 0;
        Node current = top;
        while (current != null) {
            total += current.data;
            current = current.next;
        }
        return total;
    }

    public double hitungRataRata() {
        int total = 0, count = 0;
        Node current = top;
        while (current != null) {
            total += current.data;
            count++;
            current = current.next;
        }
        return count == 0 ? 0 : (double) total / count;
    }
}
