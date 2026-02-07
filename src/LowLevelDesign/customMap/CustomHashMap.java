package LowLevelDesign.customMap;

import java.util.Objects;

public class CustomHashMap<K,V> {
    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    private Entry<K,V>[] table;
    private int size = 0;


    public CustomHashMap() {
       this.table = new Entry[INITIAL_CAPACITY];
    }

    private static class Entry<K,V>{
         K key;
         V value;
         Entry<K,V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value){
        final int index = getIndex(key);
        Entry<K,V> head = table[index];

        Entry<K,V> current = head;
        while (current != null){
            // if both keys are same, replace old value
            if(Objects.equals(current.key,key)){
                current.value = value;
                return;
            }
            current = current.next;
        }

        // Insert new node at head
        Entry<K,V> newNode = new Entry<>(key,value);
        newNode.next = head;
        table[index] = newNode;
        size++;

        if((1.0 * size) / table.length >= LOAD_FACTOR){
            rehash();
        }
    }

    private int getIndex(K key){
        return key == null ? 0 : Math.abs(key.hashCode() % table.length);
    }

    private void rehash(){

    }
}
