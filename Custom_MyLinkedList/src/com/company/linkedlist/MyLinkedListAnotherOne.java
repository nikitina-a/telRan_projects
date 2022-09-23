package com.company.linkedlist;

public class MyLinkedListAnotherOne {

    Node head;

    class Node {
        int info;
        Node next;

        public Node(int info) {
            this.info = info;
            this.next = null;
        }
    }

    public MyLinkedListAnotherOne() {
        this.head = null;
    }


    void addToHead (int info){
        Node temp = new Node(info);
        temp.next = head;
        head = temp;

    }

    void print() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.info + " ");
            temp = temp.next;
        }
    }
    void addToTail(int info) {
        Node tmp = new Node(info);
        if (head!=null) {
            Node item = head;
            while (item.next!=null) {
                item=item.next;
            }
            item.next = tmp;
        } else {
            head = tmp;
        }
    }

    boolean addAfterElement(int after, int info) {
        if (head != null) {
            Node item = head;
            while((item!=null)&&(item.info!=after)) {
                item = item.next;
            }
            if (item!=null) {
                Node temp = new Node(info);
                temp.next = item.next;
                item.next = temp;
                return true;
            }

        }
        return false;

    }

    boolean addBeforeElement(int before,int info) {
        if (head!=null) {
            if (head.info == before) {
                addToHead(info);
                return true;
            }

            Node item = head;
            while ((item.next!=null) && (item.next.info != before)) {
                item = item.next;
            }

            if (item.next!=null) {
                Node temp = new Node(info);
                temp.next = item.next;
                item.next = temp;
                return true;
            }

        }
        return false;
    }

    void removeFromHead() {
        if (head != null) {
            Node temp = head;
            head = temp.next;
            temp = null;
        }
    }
    void removeFromTail() {
        if (head!=null) {
            if (head.next == null) {
                head = null;
                return;
            }
            Node item = head;
            Node nextItem = item.next;
            while (nextItem.next!=null) {
                item = nextItem;
                nextItem =nextItem.next;
            }
            item.next = null;
            nextItem = null;

        }
    }

    boolean removeFirstInfo (int info) {
        if (head!=null) {
            Node item = head;
            Node temp;
            if (head.info == info) {
                removeFromHead();
                return true;
            }
            while ((item.next!=null) && (item.next.info!=info)) {
                item = item.next;
            }
            if(item.next!=null) {
                temp = item.next;
                item.next = item.next.next;
                temp = null;
                return true;
            }
        }
        return false;
    }

    Node searchFirstInfo(int info) {
        Node res = head;
        while((res!=null)&&(res.info!=info)) {
            res = res.next;
        }
        return res;
    }

    //count negative elements

    int countNegatives() {
        int count = 0;
        if (head!=null) {

            Node temp = head;

            while (temp!=null) {
                if (temp.info<0) {
                    count++;
                }
                temp = temp.next;
            }
        }
        return count;
    }

    int countSumOfPositives() {
        int sum = 0;
        if (head!=null) {

            Node temp = head;

            while (temp!=null) {
                if (temp.info>0) {
                    sum+=temp.info;
                }
                temp = temp.next;
            }
        }
        return sum;
    }

    double getAverage() {
        int sum = 0;
        int count = 0;
        Node temp = head;

        while (temp!=null) {
            sum+=temp.info;
            count++;
            temp = temp.next;
        }
        return sum/count;
    }

    //1.4. заменяет отрицательные элементы списка их абсолютным значением

    void changeToAbs() {

        Node temp = head;

        while (temp!=null) {
            if (temp.info < 0) {
                temp.info = Math.abs(temp.info);

            }
            temp=temp.next;
        }

    }

    //1.5.подсчитывает в списке количество элементов с некоторым (заранее заданным)
    // значением информационного поля
    int countValues(int info) {
        int count = 0;
        if (head!=null) {

            Node temp = head;

            while (temp!=null) {
                if (temp.info==info) {
                    count++;
                }
                temp = temp.next;
            }
        }
        return count;
    }

    //1.6.подсчитывает в списке количество пар идущих подряд элементов, в которых значение информационного
    // поля первого элемента превосходит значение информационного поля второго элемента
    int countPairs() {
        int count = 0;
        if (head!=null) {

            Node temp = head;

            while (temp!=null) {
                if(temp.next==null) break;
                if (temp.info>temp.next.info) {
                    count++;
                }

                temp = temp.next;
            }
        }
        return count;
    }
}





