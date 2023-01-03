import java.util.LinkedList;
import java.util.Queue;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();//实例化，Queue是抽象类不能实例化
        Q.offer(0);//入队
        Q.poll();//出队
    }

}
