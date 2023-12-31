import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>(10);
        hashtable.put(2102002, "Hridoy");
        hashtable.put(2102003, "Khaled");
        hashtable.put(2102004, "Dipu");
        hashtable.put(2102005, "Arman");

        //hashtable.remove(2102004);
        for(Integer key : hashtable.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key+ "\t" + hashtable.get(key));//key Integer type hoile hash hashCode hobe int type er...
        }
        Hashtable<String ,String> hashtableS = new Hashtable<>(10);
        hashtableS.put("2102002", "Hridoy");
        hashtableS.put("2002002", "Tamim");
        hashtableS.put("2102003", "Khaled");
        hashtableS.put("2102004", "Dipu");
        hashtableS.put("2102005", "Arman");

        //hashtable.remove(2102004);
        for(String key : hashtableS.keySet()){
            System.out.println(key.hashCode()  + "\t" + key+ "\t" + hashtableS.get(key));//String key er jonne oonno formula diye hashCode hobe...
        }
    }
}
