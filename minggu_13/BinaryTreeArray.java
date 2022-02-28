package minggu_13;

/**
 *
 * @author Judha Maygustya
 */
public class BinaryTreeArray {

    int[] data;
    int idxlast;

    public BinaryTreeArray() {
        data = new int[10];
    }

    void add(int value, int id) {
        data[id] = value;
    }

    void updateData(int data[]) {
        this.data = data;
    }

    void populateData(int data[], int idxlast) {
        this.data = data;
        this.idxlast = idxlast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxlast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxlast) {
            if (data[idxStart] == 0) {
                System.out.print(idxlast + " ");
            } else {
                System.out.print(data[idxStart] + " ");
            }
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxlast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            if (data[idxStart] == 0) {
                System.out.print(idxlast + " ");
            } else {
                System.out.print(data[idxStart] + " ");
            }
        }
    }
}
