/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu_13;

/**
 *
 * @author Judha Maygustya
 */
public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        bt.traversePreorder(bt.root);
        System.out.println("");
        bt.traverseInorder(bt.root);
        System.out.println("");
        bt.traversePostorder(bt.root);
        System.out.println("");
        System.out.println(" Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreorder(bt.root);
        System.out.println("");

        System.out.println("+----------------------+");
        System.out.print("|  Minimal : ");
        bt.min();
        System.out.print("|  Maximal : ");
        bt.max();
        System.out.println("+----------------------+");
        System.out.print("| Leaf : ");
        bt.leaf(bt.root);
        System.out.println("");
        System.out.println("+----------------------+");
        System.out.print("| Jumlah Leaf : " + bt.countLeaf());
        System.out.println("");
        System.out.println("+----------------------+");
    }

}
