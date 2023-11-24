package collectionFramework.listImplementation;

public class ArrayList {
    Object[] values;
    int size = 0;
    int capacity = 10;

    ArrayList() {
        values = new Object[capacity];
    }

    public void add(Object value) {
        if (size < capacity) {
            values[size++] = value;
        } else {
            int newCapacity = capacity + capacity / 2 + 1;
            Object[] newArray = new Object[newCapacity];
            for (int index = 0; index < capacity; index++) {
                newArray[index] = values[index];
            }
            capacity = newCapacity;
            values = newArray;
            values[size++] = value;

        }
    }
}
