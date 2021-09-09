package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneNumber {
    HashMap<String, ArrayList<String>> entries=new HashMap<>();
    void add(String name, String phone){
        if (!entries.containsKey(name)){
            entries.put(name, new ArrayList<>());
        }
        entries.get(name).add(phone);
    }
    ArrayList<String> get(String name){
        if (entries.containsKey(name)){
            return entries.get(name);
        }
        else {return new ArrayList<>();}
    }
}
