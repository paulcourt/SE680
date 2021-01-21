/*
 *This program will use Java to take two assigned vectors and 
 *give their union.  It ensures that if either vector has a duplicate 
 *item, it is NOT repeated in the union.
 */
package vectorunion;
import java.util.Vector;
import java.util.Iterator;

public class VectorUnion {
 
    public static void main(String[] args) {
  
    // Trial Vector a
    Vector<Object> a = new Vector<Object>();
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(1);
  
    // Trial Vector b
    Vector<Object> b = new Vector<Object>();
    b.add(11);
    b.add(2);
    b.add(13);
    b.add(11);
    
    Vector<Object> unionVect = union(a, b);
  
//Initializes an iterator for the unionVector.
    Iterator it = unionVect.iterator();
    	System.out.println("The union vector");
    
//This loop prints the union vector to see if it is correct.
    while (it.hasNext())
        {
        System.out.println(it.next());
        }
    }
    
//************** Start of Java Method, union ***************************
    
public static Vector union(Vector a, Vector b) {
        
//Initalizes a union vector of type Object.
  Vector<Object> uVect = new Vector<Object>();
  
//Initializes an iteratior as "it" and initializes it for Vector a.
  Iterator it = a.iterator();
  
//This loop will store the items in the vector a into the union vector, 
//uVect and check to see if vector a has any repeated items.
  
  while (it.hasNext())
  {
  	Object thisItem = it.next();
    if (!uVect.contains(thisItem))
    	{ //If the union vector doesn't already have the item, add it!
        uVect.add (thisItem);
        }
  }

//Establishes an iterator for Vector b.
	it = b.iterator();
        
//This loop will store the items from vector b into the union vector if they are not already there.
  while (it.hasNext())
  {
  	Object thisItem = it.next();
    if (!uVect.contains(thisItem))
    	{ //If the union vector doesn't already have the item, add it!
        uVect.add (thisItem);
        }
  }

  //Returns the finished union vector.
    return uVect;
}
}
