import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(35,"Híu");
        map.put(2,"Lực");
        map.put(18,"Hà");
        map.put(40,"Hoàng");
        map.put(10,"Hoàng");
        System.out.println(map);
        System.out.println("treeMap");
        Map<Integer,String> treeMap =new TreeMap<>(map);
        System.out.println(treeMap);
        System.out.println("linkedMap");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
//        Set<Integer> name = map.keySet();
//        Set<Map.Entry<Integer,String> >name =  map.entrySet();
//        System.out.println(name);
//        for (
//             ) {
////            System.out.println("key: "+ o+ " giá trị: "+map.get(o));
//        }
    }
}
