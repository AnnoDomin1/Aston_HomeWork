package practicalЕxerciseL9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //задание 1
        ArrayList<String> list = new ArrayList<>();
        list.add("Вася");
        list.add("Коля");
        list.add("Петя");
        list.add("Вася");
        list.add("Виктория");
        list.add("Вася");
        list.add("Петя");
        list.add("Саша");
        list.add("Вася");
        list.add("Коля");
        list.add("Миша");
        list.add("Настя");
        list.add("Коля");
        list.add("Кирилл");
        list.add("Петя");
        list.add("Олег");
        list.add("Дима");
        list.add("Ваня");
        UniqueValues.printElementsArrayList(list);
        //задание 2
        HashMap <String,String> hashMap = new HashMap<String,String>();
        PhoneDirectory myPhoneDirectory = new PhoneDirectory(hashMap);
        myPhoneDirectory.add("89991631633","Федоров");
        myPhoneDirectory.add("89990000000","Сидоров");
        myPhoneDirectory.add("87777777777","Ермаков");
        myPhoneDirectory.add("89991112223","Иванов");
        myPhoneDirectory.add("80005553331","Трунин");
        myPhoneDirectory.add("89991717171","Иванов");
        myPhoneDirectory.add("87773201322","Ермаков");
        myPhoneDirectory.add("89176663332","Иванов");
        System.out.println(myPhoneDirectory.get("Иванов"));
        System.out.println(myPhoneDirectory.get("Сидоров"));
    }
}
