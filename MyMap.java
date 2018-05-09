import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Iterator;
public final class MyMap<K,V> implements Map<K,V> {
    public LinkedHashSet<Entry<K,V>> entries = new LinkedHashSet<Entry<K,V>>();  // Originally
    int size;                                                            // a Set variable, but we thought
                                                                         // LinkedHashSet's methods
    public int size() {                                                  // would be useful
        return this.size;
    }
    
    public Set<Entry<K, V>> entrySet() { // Returns Set of key-value pairs
        return entries;
    }

    public Set<K> keySet() {
        Set<K> keys = new LinkedHashSet<>(); // Returns set of keys, often for iteration
        for(Entry<K,V> entry: entries) {
            keys.add(entry.getKey());
        }
        return keys;
    }
    
    public void clear() {    //  empties LinkedHashSet
        entries.clear();
        size = 0;
    }

    public Collection<V> values() {
        Collection<V> vals = new ArrayList<V>();
        for(Entry<K,V> entry : entries) {
            vals.add(entry.getValue());
        }
        return vals;
    }
    
    public void putAll(final Map<? extends K, ? extends V> map) {
        Set<? extends K> keys = map.keySet(); // Inputs an entire collection
        for(K key : keys){                    // into the linked hash set
            put(key, map.get(key));
        }
    }

    public V remove(final Object key) {
        Iterator<Entry<K,V>> it = entries.iterator();
        int numEntries = entries.size();
        int i = 0;
	V toReturn;
        Entry<K,V> toCheck;      // Entry's abstractness only prevents instantiation with new
        boolean reached = false;
        while((!reached) && (it.hasNext())){ // Iterates through set until matching key is found
            toCheck = it.next();             
            if(toCheck.getKey().equals(key)){
		toReturn = toCheck.getValue();//Store entry's value for later return, remove from Set
                entries.remove(key);
            }else{
                i++;
            }
            
        }
	
        return toReturn;  //  Return removed value
    }

    public V put(final K key, final V value) {
        V toReturn = get(key);
        entries.put(key, value);             // entries.put(K, V) is not a real method. Trying
        size++;                              // to achieve minimal nodes gave us few options here
        return toReturn;
    }

    public V get(final Object key) {
        Iterator<Entry<K,V>> it = entries.iterator();
	Entry<K,V> toCheck;
        V toReturn;
        boolean found = false;
        int i=0;
        while((!found) && it.hasNext()){  // Iterates through this Map to find matching key
            toCheck = it.next();
            if(toCheck.getKey().equals(key)){
                found = true;   
            }else{
                i++;
            }
        }
	toReturn = toCheck.getValue();
        return toReturn;
    }
    
    public boolean containsValue(Object value) {
        Iterator<Entry<K,V>> it = entries.iterator();
        int numEntries = entries.size();
        Entry<K,V> toCheck;
        boolean toReturn = false;
        int i=0;
        while(!(toReturn) && i<numEntries){
            toCheck = it.next();
            if(toCheck.getValue() == value){
                toReturn = true;
            }else{
                i++;
            }
        }
        return toReturn;
    }

    public boolean containsKey(Object key) {
        Iterator<Entry<K,V>> it = entries.iterator();
        int numEntries = entries.size();
        Entry<K,V> toCheck;
        boolean toReturn = false;
        int i=0;
        while(!(toReturn) && i<numEntries){
            toCheck = it.next();
            if(toCheck.getKey() == key){
                toReturn = true;
            }else{
                i++;
            }
        }
        return toReturn;
    }
    
    public boolean isEmpty() {
        if (size>0){
        return false;
        }else{
        return true;
        }
    }
}
