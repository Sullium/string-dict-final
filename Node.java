public class Node{
    private Character ch;   //  Character stored by this Node
    
    public Node(char c){    //  Constructs a Node containing a character, w/o any subsequent nodes
        this.ch = c;
    }
    
    public char getCharValue(){     //  Returns this Node's character
        return ch;
    }
    
    public char setCharValue(char desiredValue){    //  Unsure if needed?
        ch = desiredValue;
    }
    
    // TURNS OUT THE BELOW CONTRADICTS THE PROJECT INSTRUCTIONS. LOGIC MAY BE USEFUL IN SearchTreeSet
/*    
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
    
    */
}
