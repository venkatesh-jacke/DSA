package HashMap;

import java.util.Arrays;

public class MyHashMap<K, V> {
    int size = 10;
    Entry<K, V> table[];

    public MyHashMap() {
        table = new Entry[size];
    }

    public void put(K key, V value) {
        int hash = getHash(key);
        Entry<K, V> newEntry = new Entry<>(key, value);

        // If the bucket at the hash index is empty, insert the new entry
        if (table[hash] == null) {
            table[hash] = newEntry;
        } else {
            Entry<K, V> prev = null;
            Entry<K, V> cur = table[hash];

            // Check if the current entry's key matches the given key
            // Handles both cases where key can be null and non-null
            while (cur != null) {
                if ((key == null && cur.getKey() == null) || (key != null && key.equals(cur.getKey()))) {
                    cur.setValue(value); // Update the value for the existing key
                    return; // Exit after updating the value
                }
                prev = cur;
                cur = cur.getNext();
            }
            // If the key was not found in the bucket, append the new entry
            if (prev != null) {
                prev.setNext(newEntry);
            }
        }
    }

    private int getHash(K key) {
        if (key == null) {
            return 0; // Assign `null` key to bucket 0
        }
        int hash = key.hashCode() % size;
        return Math.abs(hash); // Ensure non-negative index
    }

    public V get(K key) {
        V value = null;
        int hash = getHash(key);
        Entry<K, V> entry = table[hash];
        while (entry != null) {
            // If the key matches the current entry's key, retrieve the value
            if (entry.getKey().equals(key)) {
                value = entry.getValue();// Assign the found value to the variable
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }

    // Remove method
    public void remove(K key) {
        int hash = getHash(key);
        Entry<K, V> entry = table[hash];
        Entry<K, V> prev = null;
        // Check if the current entry's key matches the given key
        // Handles both null and non-null key comparison
        while (entry != null) {
            if ((key == null && entry.getKey() == null) || (key != null && key.equals(entry.getKey()))) {
                // If the matching entry is the first entry in the list
                if (prev == null) {
                    // Set the bucket to the next entry, effectively removing the first entry
                    table[hash] = entry.getNext();
                } else {
                    prev.setNext(entry.getNext());
                }
                size--;
                return;
            }
            // Move to the next entry in the list, updating the previous entry
            prev = entry;
            entry = entry.getNext();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean isFirst = true;
        for (int i = 0; i < size; i++) {
            Entry<K, V> current = table[i];
            while (current != null) {
                if (!isFirst) {
                    sb.append(", ");
                }
                sb.append(current);
                isFirst = false;
                current = current.getNext();
            }
        }
        sb.append("}");
        return sb.toString();

    }

    class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry<K, V> getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.key + "=" + this.value;
        }
    }
}