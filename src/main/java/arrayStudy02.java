package kopo;

import java.util.HashMap;
import java.util.Map;

public class arrayStudy02 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name", "hyeopgun");
        map.put("email", "hglee67@kopo.kr");
        map.put("dept", "datagwa");

        System.out.println("result");
        System.out.println(map.get("name"));
        System.out.println(map.get("email"));
        System.out.println(map.get("dept"));

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}
