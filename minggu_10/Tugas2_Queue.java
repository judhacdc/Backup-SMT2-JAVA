package minggu_10;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas2_Queue {

    int max, size, front, rear;
    Tugas2_Mahasiswa[] Q;

    public Tugas2_Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new Tugas2_Mahasiswa[max];
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
            System.out.println("Antrian Terdepan = " + Q[front].nama + " " + Q[front].nim + " " + Q[front].absen + " " + Q[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String ceknim) {
        if (!IsEmpty()) {
            int i = front;
            int cek = 0;
            while (i != rear) {
                if (Q[i].nama.equals(ceknim)) {
                    System.out.println("Mahasiswa dengan NIM " + ceknim + " berada di posisi index " + i);
                    cek++;
                }
                i = (i + 1) % max;
            }
            if (Q[i].nama.equals(ceknim)) {
                System.out.println(Q[i].nama + " " + Q[i].nim + " " + Q[i].absen + " " + Q[i].ipk);
                cek++;
            }
            if (cek == 0) {
                System.out.println("Mahasiswa dengan NIM " + ceknim + " tidak ditemukan");
            }

        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian Terbelakang = " + Q[rear].nama + " " + Q[rear].nim + " " + Q[rear].absen + " " + Q[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void printMahasiswa(int cariindex) {
        if (!IsEmpty()) {
            if (Q[cariindex] == null) {
                System.out.println("Index / Antrian ke-" + cariindex + " Masih Kosong");
            } else {
                System.out.println("Mahasiswa dengan Index / Antrian ke-" + cariindex + " adalah " + Q[cariindex].nama);
            }
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(Q[i].nama + " " + Q[i].nim + " " + Q[i].absen + " " + Q[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(Q[i].nama + " " + Q[i].nim + " " + Q[i].absen + " " + Q[i].ipk);
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Tugas2_Mahasiswa data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
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

    public Tugas2_Mahasiswa Dequeue() {
        Tugas2_Mahasiswa data = new Tugas2_Mahasiswa("", "", 0, 0);
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
}
