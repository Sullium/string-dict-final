# string-dict-final

My first GitHub repo.

Here is the project description: 

Suppose that you want to store a dictionary of strings. One way of doing this is to store each string in an
array or array list. But this leads to slow lookups, since you must search through the array. If you’re storing
a lot of strings, this could take a long time. Another option is to use a hash table. This, however, uses a lot
of RAM.
One way of accomplishing this is to use a special kind of tree, where each node in the tree stores a
character in a string. Each descendant of a given node will contain the next character in a string. In this
way, the tree only needs to store enough information for single characters. Internally, there should be no
strings or tables inside of the tree. At most, your nodes may contain an Character objects and a boolean
to determine whether or not a given element is contained within the tree. If you use Java, your tree should
implement the Java Set interface and be called SearchTreeSet. Your implementation may also have
an ArrayList of all of the elements in the tree.
You should be able to instantiate your tree in the following way:
Set<String> s = new SearchTreeSet<>();
Figure 1: Search tree. Blue nodes are non-terminal nodes; yellow nodes are terminal nodes. This tree
contains the following words: he, hello, help, held, hit, hold, hold.
