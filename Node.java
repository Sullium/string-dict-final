public class Node{
    private ArrayList<Node> allNext;    //  "Pointers" to all subsequent Nodes
    private int numNext;                //  Number of Nodes branching off this one
    private boolean isEndOfWord;        //  Internally tracks whether a word can end on this Node
    private char ch;                    //  Character stored by this Node
    
    public Node(char c){    //  Constructs a Node containing a character, w/o any subsequent nodes
        this.ch = c;
        numNext = 0;
    }
    
    public char getCharValue(){     //  Returns this Node's character
        return ch;
    }
    
    public char setCharValue(char desiredValue){    //  Unsure if needed?
        ch = desiredValue;
    }
    
    public Node getNextNodeAt(int index){
        if(i<numNext){
            Node toReturn = allNext[i];
            return toReturn;
        }else{
            return null;
        }
    }
    
    public int getNextNodeIndexWith(char toFind){
        boolean found = false;
        int i=0;        
        while((!found) && (i<numNext)){
            if(allNext[i].getCharValue() = toFind){
                found = true;
            }
            i++;
        }
        if(found)
            return i;
        else
            return -1;
    }
    
    public Node getNextNodeWith(char toFind){   //  Finds and returns the Node branching off current one 
        Node toReturn;                          //  which contains parameter character.
        boolean found = false;
        int i=0;
        while((!found) && (i<numNext)){             //  Compare next Nodes until match is found or
            toReturn = allNext[i];                  //  none are left.
            if(toReturn.getCharValue() == toFind){
                found = true;
            }
            i++;
        }
        if(found){
            return toReturn;    // Return next Node with desired character
        }else{
            return null;    //  Return null if desired character does not follow this one
        }
    }
    
    
}
