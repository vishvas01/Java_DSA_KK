public class LL{
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void remove(int pos){
        if(pos==0){
            head=head.next;
            size--;
            return;
        }
        Node node = find(pos-1);
        node.next = node.next.next;
        size--; 

    }
    public void add(int value,int pos){
        if(pos==0){
            addfirst(value);
            return;
        }
        if(pos==size){
            addlast(value);
            return;
        }
        Node temp = new Node(value);
        Node prev = find(pos-1);
        temp.next=prev.next;
        prev.next=temp;
    }
    public Node find(int index){
        if(size<=1){
            return head;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void addlast(int value){
        if(size==0){
            addfirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void addfirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
    }

}