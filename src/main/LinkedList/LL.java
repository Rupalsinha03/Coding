package LinkedList;



public class LL  {

    private Node tail;
    private Node head;
    int size=0;




    public void insert(int val){
        Node node= new Node(val);

        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }

            size+=1;
    }
    public void  display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value +" -> ");
            temp=temp.next;

        }
        System.out.println("end");
    }

    public void insertlast(int val){
        while(tail==null){
           insert(val);
           return;
        }
        Node node=new Node(val);

            tail.next=node;
            tail=node;
        size+=1;

    }
}
