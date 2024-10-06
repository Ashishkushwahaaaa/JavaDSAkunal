package Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;


class MapUsingHash{
    private Entity[] entities;
    public MapUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key, String value){
        int hash = Math.abs(key.hashCode()%entities.length);
        entities[hash] = new Entity(key, value); //Overriding if the two key's hash comes out to be same first will be overridden;
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }
    public void remove(String key){
        int hash = Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }
    private class Entity{
        String key;
        String value;
        public Entity(String key, String value){
            this.key = key; 
            this.value = value;
        }
    }
}


public class Main {
    public static void main(String[] args) {
    //    hashDemo();

        MapUsingHash map = new MapUsingHash();
        map.put("Mango", "King of fruit");
        map.put("Apple", "Doctor's choice");
        map.put("Banana", "A sweet fruit");

        System.out.println(map.get("Apple"));
        map.remove("Apple");
        System.out.println(map.get("Apple"));
        System.out.println(map);

    }
    public static void hashDemo(){
         // TreeMap<String, Integer> map = new TreeMap<>(); //work same as the HashMap but internally it is different;
         HashMap<String, Integer> map = new HashMap();
         map.put("Ashish", 45);
         map.put("Ashika", 38);
         map.put("Rahul", 34);
 
         System.out.println(map.get("Ashish"));
         System.out.println(map.remove("Rahul"));
         System.out.println(map.get("Rahul"));
         System.out.println(map.getOrDefault("Rohit", 100)); // if not found key "Rohit" then print default value 100;
         System.out.println(map.containsKey("Ashika"));
 
 
         HashSet<Integer> set = new HashSet<>();
         set.add(43);
         set.add(34);
         set.add(55);
         set.add(12);
         set.add(43);
         set.add(9);
 
         System.out.println(set); //Not add same value twice and prints in no order;
    }
}
