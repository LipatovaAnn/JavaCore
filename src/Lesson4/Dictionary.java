package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        String[] words=new String[15];
        words[0]="one";
        words[1]="two";
        words[2]="two";
        words[3]="three";
        words[4]="four";
        words[5]="five";
        words[6]="six";
        words[7]="six";
        words[8]="seven";
        words[9]="eight";
        words[10]="nine";
        words[11]="ten";
        words[12]="ten";
        words[13]="eleven";
        words[14]="one";
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i=0; i< words.length;i++){
            if (hm.containsKey(words[i])) {
                int currentV=hm.get(words[i]);
                hm.put(words[i],currentV+1 );
            }
            else {
                hm.put(words[i],1 );
            }
        }
        for (Map.Entry<String, Integer> o : hm.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }

        PhoneNumber book=new PhoneNumber();
        book.add("Petrov", "1234567");
        book.add("Ivanov", "1236789");
        book.add("Ivanov", "7237789");

        ArrayList<String> numbers= book.get("Petrov");
        System.out.println("Petrov");

        for(String phone:numbers) {
            System.out.println( phone);
        }

        numbers= book.get("Ivanov");
        System.out.println("Ivanov");

        for(String phone:numbers) {
            System.out.println( phone);
        }
    }
}
