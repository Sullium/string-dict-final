import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public class SearchTreeSet implements Set{
    private Node first;  //  We eventually figured out that Nodes would ideally be linked backwards
    private int size;     // (ie. each node has a pointer to its parent). We had spent much time
                          // trying to work with more strictly minimal Nodes
    public boolean add(Object e){
        if(size==0){
            first = new Node;
        }else{
	    
        }
        iterator<n> itr = n.iterator();
        boolean tf=true;
        while(it.hasNext) && (tf){
            if(e==Node){
                tf = false;
            } else{
                tf =true;
            }
        }
        n=n.next();
        n=e;
        size++;
        return tf;
    }
    
    public boolean addAll(Collection c){
        return true;
    }
    
    public void clear(){
		
    }
    
    public boolean contains(Object o){
        iterator<n> itr = n.iterator();
	
        return true;
    }
    
    public boolean containsAll(Collection c){
        return true;
    }
    
    public boolean equals(Object o){
        return true;
    }
    
    public int hashCode(){
        int toReturn;
        return toReturn;
    }
    
    public boolean isEmpty(){
        if(size==0){
            return true;
        }else {
            return false;
        }
    }
    
    public Iterator iterator(){  //  Our confusion on the structure of Nodes made this mostly
        Iterator itr;            //  impossible to even start
	}
    
    public boolean remove(Object o){
        return true;
    }
    
    public boolean removeAll(Collection c){
        return true;
    }
    
    public boolean retainAll(Collection c){
        return true;
    }
    
    public int size(){
        return numElements;
    }
    
    public Object[] toArray(){
        Object[] o = new Object[];
        return o;
    }

    public Object[] toArray(Object[] o){
        return o;
    }
    
        public <T> T[] toArray(Object a){
    
    }
}
