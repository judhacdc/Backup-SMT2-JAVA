package minggu_14;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class Graph {

    int vertex;
    LinkedList list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }

    public void addEdge(int source, int destination) {
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        System.out.println("degree vertex " + source + " : " + list[source].size());
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source) {
                    ++totalIn;
                }
            }
            //outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dai vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(source);

            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasildikosongkan");
    }

//    public void printGraph() throws Exception {
//        for (int i = 0; i < vertex; i++) {
//            if (list[i].size() > 0) {
//                System.out.print("Vertex " + i + " terhubungdengan: ");
//                for (int j = 0; j < list[i].size(); j++) {
//                    System.out.print(list[i].get(j) + " ");
//                }
//                System.out.println("");
//            }
//        }
//        System.out.println(" ");
//    }
    public void printGraph() throws Exception {
        String namKota = "";
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                if (i == 0) {
                    namKota = "Malang";
                } else if (i == 1) {
                    namKota = "Surabaya";
                } else if (i == 2) {
                    namKota = "Gresik";
                } else if (i == 3) {
                    namKota = "Pandaan";
                } else if (i == 4) {
                    namKota = "Bandung";
                } else {
                    namKota = "Jakarta";
                }
                System.out.print("Vertex " + namKota + " terhubungdengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan vertex graf : ");
        int vertex = sc.nextInt();

        Graph graph = new Graph(vertex);

        System.out.print("Masukkan banyak edge : ");
        int edge = sc.nextInt();

        for (int i = 0; i < edge; i++) {
            System.out.print("Masukkan Source : ");
            int source = sc.nextInt();
            System.out.print("Masukkan Destination :");
            int des = sc.nextInt();

            graph.addEdge(source, des);

        }
        graph.printGraph();
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 4);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 4);
//        graph.addEdge(3, 0);
//        graph.printGraph();
//        graph.degree(2); 
//        graph.removeEdge(1, 2);
//        graph.printGraph();
    }

    public boolean graphType(int source, int destination) {
        list[source].addFirst(destination);
        return true;
    }

}
