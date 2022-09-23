package com.company;


import static java.lang.System.*;
class BinaryTree {
    class Node {
        String info;
        int key;
        Node parent;
        Node leftNode;
        Node rightNode;

        Node() {
            info = "";
            key = Integer.MIN_VALUE;
            leftNode = null;
            rightNode = null;
            parent = null;
        }

        Node(String info, int key) {
            this.info = info;
            this.key = key;
            leftNode = null;
            rightNode = null;
        }

        Node(String info, int key, Node parent) {
            this.info = info;
            this.key = key;
            leftNode = null;
            rightNode = null;
            this.parent = parent;
        }

        int compareKeyTo(Node n) {
            return (this.key - n.key); // >0 - текущий больше
        }
    }
    BinaryTree.Node root;

    BinaryTree(){
        root = null;
    }

    BinaryTree.Node getRoot(){
        return root;
    }

    void printKey(BinaryTree.Node node){
        out.printf("%5d", node.key);
    }

    void insertLeafInTree(String inf, int k){
        BinaryTree.Node currentNode = root;
        BinaryTree.Node parentNode = null;
        while (currentNode != null) {
            parentNode = currentNode;
            if (k < currentNode.key) {
                currentNode = currentNode.leftNode;
            }
            else if (k > currentNode.key) {
                currentNode = currentNode.rightNode;
            }
            else {
                // if k == currentNode.key
                currentNode.info = inf;
                return;
            }
        } // while

        BinaryTree.Node newNode = new BinaryTree.Node(inf, k, parentNode);
        if (parentNode == null ){ // создаем корень
            root = newNode;
        }
        else {
            if (k < parentNode.key) {
                parentNode.leftNode = newNode;
            }
            else {
                parentNode.rightNode = newNode;
            }
        }
    } // insert
    /**
     * определяет частоту вхождения для заданного слова
     */

    static int count=0;

    int preOrderinf(Node node, String info ) {
        if (node != null) {
            preOrderinf(node.leftNode, info) ;
            preOrderinf(node.rightNode, info);
            if (node.info == info) {
                count+=1;
            }
        }
        return count;
    }
    static int polCount=0;
    int findPoilindromes(Node node) {
        if (node != null) {
            findPoilindromes(node.leftNode);
            findPoilindromes(node.rightNode);
            if (isPalindrome(node)) {
                count+=1;
            }
        }
        return count;
    }
    boolean isPalindrome(Node node) {
        return node.info.equals(new StringBuilder(node.info).reverse().toString());
    }
    /*
    определяет количество вершин в дереве, содержащих слова, начинающиеся c буквы "A"
     */
    static int wordWithACount=0;
    int findWordsWithA(Node node) {
        if (node != null) {
            findWordsWithA(node.leftNode);
            findWordsWithA(node.rightNode);
            if (node.info.charAt(0)=='A') {
                wordWithACount+=1;
            }
        }
        return wordWithACount;
    }

    /*
    определяет количество вершин, ключевыми значениями которых является четное число
     */

    static int evensCount=0;
    int findEvensKey(Node node) {
        if (node != null) {
            findEvensKey(node.leftNode);
            findEvensKey(node.rightNode);
            if (node.key%2==0) {
                evensCount+=1;
            }
        }
        return evensCount;
    }






}

class Treetext {
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        String inf;
        int k;

        inf = "Ale";
        k = 5;
        bt.insertLeafInTree(inf, k);


        inf = "Mas";
        k = 1;
        bt.insertLeafInTree(inf, k);

        inf = "Ale";
        k = 7;
        bt.insertLeafInTree(inf, k);

        inf = "KLe";
        k = 6;
        bt.insertLeafInTree(inf, k);

        inf = "kazak";
        k = 6;
        bt.insertLeafInTree(inf, k);
        out.println(bt.findPoilindromes(bt.getRoot()));


    }


}

