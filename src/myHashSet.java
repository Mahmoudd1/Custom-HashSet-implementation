class myHashSet {
    Node []myHash;
    public myHashSet() {
        myHash=new Node[100];
    }

    public void add(int key) {
        System.out.println(key);
        if (this.contains(key))
            return;
        else
        {
            if (myHash[key%100]!=null)
            {
                Node temp=myHash[key%100];
                while (temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=new Node(key,null);
            }
            else
            {
                myHash[key%100]=new Node(key,null);
            }
        }
    }

    public void remove(int key) {
        if (!contains(key))
            return;
        else
        {
            Node temp=myHash[key%100];
            if (temp.value==key)
            {
                myHash[key%100]=temp.next;
                return;
            }
            while (temp!=null)
            {
                if (temp.next.value==key)
                {
                    temp.next=temp.next.next;
                    break;
                }
                else
                    temp=temp.next;
            }
        }
    }

    public boolean contains(int key) {
        if (myHash[key%100]!=null)
        {
            Node temp=myHash[key%100];
            while (temp!=null)
            {
                if (temp.value!=key)
                    temp=temp.next;
                else
                    return true;
            }
            return false;
        }
        else
            return false;
    }
}
class Node{
    int value;
    Node next;
    Node(int value,Node next)
    {
        this.value=value;
        this.next=next;
    }
    Node (int value)
    {
        this.value=value;
        this.next=null;
    }
}

