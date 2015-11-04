import java.lang.reflect.Array;

public class DoubleLinkedList<T> {

    private ListMember<T> head;
    private ListMember<T> tail;

	public void add(T item) {

        if (item == null) {
            return;
        }
        ListMember<T> addItem = new ListMember<>(item);
        if (head == null) {
            head = addItem;
            tail = head;
        } else {
            tail.next = addItem;
            addItem.prev = tail;
            tail = addItem;
        }
    }

    public void remove(T value) {

        if (head == null || value == null ) {
            return;
        }
		ListMember<T> item = head;		
		while (item != null) {
			if (value.equals(item.value)) {
				
				if (item.prev != null) {
					item.prev.next = item.next;					
				}
				if (item.next != null) {
					item.next.prev = item.prev;
				}
				break;
			}
        }
    }
			
    class ListMember<T> {

        private final T value;
        ListMember<T> next;
        ListMember<T> prev;

        public ListMember(T value) {

            this.value = value;
            next = null;
            prev = null;
        }
		
		public int size() {
			
			return next == null ? 1 : next.size() + 1;
		}
    }
}
