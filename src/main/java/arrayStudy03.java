package poko;

import java.util.*;

public class arrayStudy03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map =null;

        for(int i=0;i<3;i++) {

            System.out.print("name : ");
            String name = sc.next();

            System.out.print("email : ");
            String email = sc.next();

            System.out.print("password : ");
            String password = sc.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("password", password);

            list.add(map);

            map = null;
        }

        int listSize  = list.size();

        System.out.print("numbers of data stored : " + listSize);
    }
}
