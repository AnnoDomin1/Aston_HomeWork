package practicalЕxerciseL9;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueValues {

    public static ArrayList<String> arrayListToHashSet(ArrayList<String> arrayList) {
        HashSet<String> hashSetList = new HashSet<String>(arrayList);
        ArrayList<String> list = new ArrayList<>(hashSetList);
        return list;
    }

    public static void printElementsArrayList(ArrayList<String> list) {
        int count = 0;
        ArrayList list1 = arrayListToHashSet(list);
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list1.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            System.out.print("Количество слов \"" + list1.get(i) + "\" в списке - " + count);
            System.out.println();
            count = 0;
        }
    }
}
