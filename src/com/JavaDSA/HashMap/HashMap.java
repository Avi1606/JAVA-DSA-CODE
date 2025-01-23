package com.JavaDSA.HashMap;

public class HashMap{

   private Entity [] buckets; //class ka object banaya pr size hmne constructor me iniciate ki hai for more convinient for future

   public HashMap(){
       buckets = new Entity[100];
   }

   public void put(String key , String value){
       int index = Math.abs(key.hashCode()%buckets.length);
       buckets[index] = new Entity(key , value);// new Entity is created an storing the key value at index(index) value
   }

    public String get(String key) {
       int index = Math.abs(key.hashCode() % buckets.length);
       if(buckets[index] != null && buckets[index].key.equals(key)){
           return buckets[index].value;
       }
       return null;
    }

    public void remove(String key) {
       int index = Math.abs(key.hashCode() % buckets.length);
        if (buckets[index] != null && buckets[index].key.equals(key)) {
            buckets[index] = null;
        }
    }


    private class Entity{ // defing the type of array called bucket
        String key;
        String value;


        public Entity(String key ,String value){
            this.key = key;
            this.value= value;
        }
    }
}


