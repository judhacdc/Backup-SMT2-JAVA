package minggu_13;
/**
 *
 * @author Judha Maygustya
 */
public class BinaryTree {

    Node root;

    public BinaryTree() {
    }

    boolean isEmpty() {
        return root == null;
    }

//    void add(int data) {
//        if (isEmpty()) {
//            root = new Node(data);
//        } else {
//            Node current = root;
//            while (true) {
//                if (data < current.data) {
//                    if (current.left != null) {
//                        current = current.left;
//                    } else {
//                        current.left = new Node(data);
//                        break;
//                    }
//                } else if (data > current.data) {
//                    if (current.right != null) {
//                        current = current.right;
//                    } else {
//                        current.right = new Node(data);
//                        break;
//                    }
//                } else {
//                    break;
//                }
//            }
//        }
//    }
    // -------------------- no 1 ----------------------------------//
    public Node addNode(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = addNode(current.left, data);
        } else if (data > current.data) {
            current.right = addNode(current.right, data);
        } else {//data is already exist
            return current;
        }
        return current;
    }
    public void add(int data) {
        root = addNode(root, data);
    }
// ------------------------ no 2----------------------------------/

    void max() {
        Node current = root;

        while (current.right != null) {
            current = current.right;
        }
        System.out.println(current.data);
    }

    void min() {
        Node current = root;

        while (current.left != null) {
            current = current.left;
        }
        System.out.println(current.data);
    }
// ---------------------- no 3 ------------------------------------//

    void leaf(Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return;
        }

        if (root.left != null) {
            leaf(root.left);
        }

        if (root.right != null) {
            leaf(root.right);
        }
    }

    // ---------------------- no 4 ------------------------------------//
    int countLeaf() {
        return countLeaf(root);
    }

    int countLeaf(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeaf(node.left) + countLeaf(node.right);
        }
    }


    boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreorder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreorder(node.left);
            traversePreorder(node.right);
        }
    }

    void traversePostorder(Node node) {
        if (node != null) {
            traversePostorder(node.left);
            traversePostorder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInorder(Node node) {
        if (node != null) {
            traverseInorder(node.left);
            System.out.print(" " + node.data);
            traverseInorder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!!");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

}
