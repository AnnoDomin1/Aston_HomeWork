package practicalЕxerciseL9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneDirectory {
    HashMap<String,String> hashMap = new HashMap<String,String>();

    public PhoneDirectory(HashMap<String,String> hashMap){
        this.hashMap = hashMap;
    }
    public String add (String key, String surname) {
        return hashMap.put(key, surname);
    }
    public String get(String surname) {
        String str = "";
        for(Map.Entry<String, String> entry: hashMap.entrySet()) {
            if(surname.equals(entry.getValue())){
                str += entry.getKey() + "\n";
            }
        }
        return str;
    }
    public int size(){
        return this.hashMap.size();
    }

}
