import java.util.ArrayList;

public class array_class {
    public static void main(String[] args) {
        //创建可变数组
        ArrayList<Integer> array = new ArrayList<>();
        //添加元素
        array.add(1);
        //访问元素
        System.out.println(array.get(0));
        //修改元素
        array.set(0,5);//索引，修改值
    }
}