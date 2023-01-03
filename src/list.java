public class list {

    public static void main(String[] args) {
        //实例化节点
        listnode node1=new listnode();
        listnode node2=new listnode();
        //节点赋值
        node1.val=0;
        node2.val=1;
        //成链
        node1.next=node2;
        node2.next=null;
        System.out.println(node1.next.val);
    }
}

class listnode{
    int val;//节点值
    listnode next;
}