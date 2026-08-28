public class trie {
    static class Node {

        Node[] children;
        boolean eow;

        // constroctor
        public Node() {
            children = new Node[26]; // A TO Z
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {

        for (int i = 0; i < word.length(); i++) { // O(L)
            int idx = word.charAt(i);

            if (root.children[idx] == null) {
                // add new Node
                root.children[idx] = new Node();
            }

            if (i == word.length() - 1) {
                root.children[idx].eow = true;
            }
            root = root.children[idx];
        }
    }

    public static void main(String[] args) {
        System.out.println("Manthan ovhal");
        String words[] = { "the", "a", "there", "theire", "any" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(words);
    }
}
