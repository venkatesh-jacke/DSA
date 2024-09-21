package Trie;

public class Trie {
    // Node structure for Trie
     class Node {
        // Array to store links to child nodes, each index represents a letter
        Node[] links = new Node[26];
        // Flag indicating if the node marks the end of a word
        boolean flag = false;

        // Check if the node contains
        // a specific key (letter)
        boolean containsKey(char ch) {
            return links[ch - 'a'] != null;
        }

        // Insert a new node with a specific
        // key (letter) into the Trie
        void put(char ch, Node node) {
            links[ch - 'a'] = node;
        }

        // Get the node with a specific
        // key (letter) from the Trie
        Node get(char ch) {
            return links[ch - 'a'];
        }
        // Set the current node
        // as the end of a word
        void setEnd() {
            flag = true;
        }
        // Check if the current node
        // marks the end of a word
        boolean isEnd() {
            return flag;
        }
    }
    //Trie class
    private Node root;
    // Constructor to initialize the Trie with an empty root node
    public Trie() {
        root = new Node();
    }
    // Inserts a word into the Trie
    // Time Complexity O(len), where len is the length of the word
    void insert(String word) {
        Node node = root;
        for(char i: word.toCharArray()) {
            if(!node.containsKey(i))
                node.put(i, new Node());
            node = node.get(i);
        }
        node.setEnd();
    }
    // Returns if the word is in the trie
    boolean search(String word) {
        Node node = root;
        for(char i: word.toCharArray()) {
            if(!node.containsKey(i)) return false;
            node = node.get(i);
        }
        return node.isEnd();
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("star");
        trie.insert("starry");
        trie.insert("straw");
        trie.insert("strawn");
        System.out.println(trie.search("straw"));
        System.out.println(trie.search("strawny"));
    }
}