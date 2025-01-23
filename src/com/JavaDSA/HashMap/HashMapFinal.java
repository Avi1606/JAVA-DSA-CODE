package com.JavaDSA.HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapFinal<k, v> {

    ArrayList<LinkedList<Entity>> buckets;
    int size = 0;

    private float load_factor= 0.5f;

    public HashMapFinal() {
        buckets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    public void put(k key, v value) {
        int index = Math.abs(key.hashCode() % buckets.size());
        LinkedList<Entity> col = buckets.get(index); // first find that index of buckets array

        for (Entity item : col) { // finding item if it exists already then we will just update it
            if (item.key.equals(key)) {
                item.value = value;  // Update value
                return;
            }
        }
        if ((float) size / buckets.size() > load_factor) {
            rehash();
        }

        col.add(new Entity(key , value));
    }

    private void rehash() { // use ti handel collision in col
        ArrayList<LinkedList<Entity>>old = buckets;
        buckets = new ArrayList<>();
        
        size =0;

        for (int i = 0; i < 2*old.size(); i++) { // create new bucket of doubled size
            buckets.add(new LinkedList<>());
        }

        for (LinkedList<Entity> items : old) {// there is array and every col hase its own elements in LL
            for(Entity item : items){
                put(item.key , item.value);

            }
        }

    }

    public v get( k key) {
        int index = Math.abs(key.hashCode() % buckets.size());
        LinkedList<Entity> col = buckets.get(index);

        for (Entity ans : col) {
            if (ans.key.equals(key)) {
                return ans.value;
            }
        }
        return null;
    }

    public void remove(k key) {
        int index = Math.abs(key.hashCode() % buckets.size());
        LinkedList<Entity> items = buckets.get(index);

        for (Entity item : items) {
            if (item.key.equals(key)) {
                item.key =null;
                size--;
                break;
            }
        }
    }

    public boolean containskey( k key) {
        return get(key) != null;
    }

    private class Entity {
        k key;
        v value;

        public Entity(k key, v value) {
            this.key = key;
            this.value = value;
        }
    }
}

