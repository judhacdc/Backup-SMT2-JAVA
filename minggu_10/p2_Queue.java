package minggu_10;

import minggu_10.p2_Penumpang;

/**
 *
 * @author Judha Maygustya
 */
public class p2_Queue {

    int max;
    int size;
    int front;
    int rear;
    p2_Penumpang[] Q;

    public p2_Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new p2_Penumpang[max];
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
            System.out.println("Elemen terdepan : " + Q[front].nama + " "
                    + Q[front].kotaAsal + " " + Q[front].kotaTujuan + " " + Q[front].jumlahTiket + " " + Q[front].harga + " ");
        } else {
            System.out.println("Queue masih kosong!!");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong!!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(Q[i].nama + " " + Q[i].kotaAsal + " " + Q[i].kotaTujuan + " " + Q[i].jumlahTiket + " " + Q[i].harga + " ");
                i = (i + 1) % max;
                System.out.println("");
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

    public void Enqueue(p2_Penumpang data) {
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

    public p2_Penumpang Dequeue() {
        p2_Penumpang data = new p2_Penumpang("", "", "", 0, 0);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
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

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen paling belakang : " + Q[rear].nama + " " + Q[rear].kotaAsal + " " + Q[rear].kotaTujuan + " " + Q[rear].jumlahTiket + " " + Q[rear].harga + " ");
        } else {
            System.out.println("Queue masih kosong!!");
        }
    }
}


// Judha Maygustya
