import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.ArrayList;
public final class MyMap<K,V> implements Map<K,V> {
    public Set<Entry<K,V>> entries = new LinkedHashSet<Entry<K,V>>();
    int size;
    
    public int size() {
        return this.size;
    }
    
    public Set<Entry<K, V>> entrySet() {
        return entries;
    }

    public Set<K> keySet() {
        Set<K> keys = new LinkedHashSet<>();
        for(Entry<K,V> entry: entries) {
            keys.add(entry.getKey());
        }
        return keys;
    }
    
    public void clear() {
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
        Set<K> keys = map.keySet();
        int mapSize = map.size();
        for(K key : keys){
            put(key, map.get(key));
        }
    }

    public V remove(final Object key) {
        return null;
    }

    public V put(final K key, final V value) {
        //returns old value after insertion
        toReturn = get(key);
        entries.add(key, value);
        size++;
        return toReturn;
    }

    public V get(final Object key) {
        int numEntries = entries.size();
        Iterator<Object> it = entries.iterator();
        V toReturn;
        boolean found = false;
        int i=0;
        while((!found) && i<numEntries){
            toReturn = it.next();
            if(toReturn.getKey().equals(key)){
                found = true;   
            }else{
                i++;
            }
        }
        return toReturn;
    }
    
    public boolean containsValue(Object value) {
        return false;
    }

    public boolean containsKey(Object key) {
        return false;
    }
    
    public boolean isEmpty() {
        if (size>0){
        return false;
        }else{
        return true;
        }
    }
}
