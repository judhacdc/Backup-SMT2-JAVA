package minggu_10;



/**
 *
 * @author Judha Maygustya
 */
public class p1_Queue {

    int max;
    int size;
    int front;
    int rear;
    int Q[];

    public p1_Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen Terdepan :" + Q[front]);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong!!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah elemen : " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {

            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil di kosongkan ");
        } else {
            System.out.println("Queue masih kosong");
        }

    }

    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh ");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    public int Dequeue() {

        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue Masih kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

}
// Judha Maygustya
