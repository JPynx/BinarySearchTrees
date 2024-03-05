/**
 * JPSE
 * Date Due: 2/26/2024
 * Date Completed: 3/5/2024
 * Collaborators: N/A
 **/
public class BSTsDriver{
    public static void main(String[] args) {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<Integer, String>();
        bst.put(1, "one");
        System.out.println(bst.get(1));
        System.out.println(bst.contains(1));
    }
}
    
