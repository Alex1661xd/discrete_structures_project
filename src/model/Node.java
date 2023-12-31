package model;

public class Node<K, V> {

    private K key;
    private V value;
    private Node<K, V> next;
    private Node<K, V> previous;

    public Node(K key, V value) {
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

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    public Node<K, V> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<K, V> previous) {
        this.previous = previous;
    }
}
