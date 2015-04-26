package bst;

import java.util.Random;
import java.util.Scanner;

public class BST {

    public static void main(String[] args) {
        Random rnd = new Random();

        BinaryTree tree = new BinaryTree();
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç Node lu ağaç oluşturacaksınız?");
        int node_sayisi=scan.nextInt();
        System.out.println("Kaç tane arama yapmak istersiniz?");
        int arama_sayisi=scan.nextInt();
        while (tree.countLeaves(tree.root) != node_sayisi) {
            tree.AddNode(rnd.nextInt(2147483647));
        }
        int gezilen=0;
        for(int i=0;i<arama_sayisi;i++){
            gezilen=gezilen+tree.sayarakArama(rnd.nextInt(2147483647));
        }
        System.out.println("GEzinti Ortalaması:");
        System.out.println(tree.arama/arama_sayisi);

//        tree.PreOrderTraverseTree(tree.root);

    }
}
