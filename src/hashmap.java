import java.util.HashMap;
import java.util.Map;
public class hashmap {
    public static void main(String[] args) {
        // 初始化散列表
        Map<String,Integer> dic=new HashMap<>();
        // 添加 key -> value 键值对
        dic.put("小力", 10001);
        dic.put("小特", 10002);
        dic.put("小扣", 10003);
        // 从姓名查找学号
        dic.get("小力"); // -> 10001

    }
    int hash(int id) {
        int index = (id - 1) % 10000;
        return index;
    }
}
