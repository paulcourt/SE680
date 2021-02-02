/*
 *This program written by Paul Court for SE 670 for Dr. Omar Al-Azzam
 *will use Java to take two assigned vectors and 
 *give their union.  It ensures that if either vector has a duplicate 
 *item, it is NOT repeated in the union.
 *There are two methods defined in the program.  A method, union, to create the 
 *union, which has two vector arguments and a method, outputVector which has
 *an iterator for the union vector and an integer for the test case number.
 */
package vectorunion1;
import java.util.Vector;
import java.util.Iterator;

public class VectorUnion1 {
 
    public static void main(String[] args) {
  
        //Test Case 1.
        
       Integer testCase = 1;
        
    // Trial Vector a
    Vector<Object> a = new Vector<Object>();
    a.add(1);
    a.add(2);
    a.add(3);  
    // Trial Vector b
    Vector<Object> b = new Vector<Object>();
    b.add(4);
    b.add(5);
    b.add(6);

    Vector<Object> unionVect = union(a, b);

//Initializes an iterator for the unionVector.
    Iterator it = unionVect.iterator();
    
    outputVector (it, testCase);

    //Test Case 2.
    
    testCase = 2;
    
     // Trial Vector c
    Vector<Object> c = new Vector<Object>();
    c.add(1);
    c.add(2);
    c.add(3);  
    // Trial Vector d
    Vector<Object> d = new Vector<Object>();
    d.add(3);
    d.add(5);
    d.add(6);

    unionVect = union(c, d);
  
//Initializes an iterator for the unionVector in test case 2.
    it = unionVect.iterator();
    
    outputVector (it, testCase);

    //Test Case 3.
    testCase = 3;
   // Trial Vector e
    Vector<Object> e = new Vector<Object>();
    e.add('a');
    e.add('b');
    // Trial Vector f
    Vector<Object> f = new Vector<Object>();
    f.add('c');
    f.add('d');

    unionVect = union(e, f);
  
//Initializes an iterator for the unionVector for test case 3.
    it = unionVect.iterator();
    
    outputVector (it, testCase);
        
    //Test Case 4.
         
    testCase = 4;
    
    // Trial Vector g
    Vector<Object> g = new Vector<Object>();
    g.add('a');
    g.add('b'); 
    // Trial Vector h
    Vector<Object> h = new Vector<Object>();
    h.add('b');
    h.add('a');

    unionVect = union(g, h);
  
//Initializes an iterator for the unionVector for test case 4.
    it = unionVect.iterator();
    
    outputVector (it, testCase);

    //Test Case 5.
         
    testCase = 5;
    
    // Trial Vector i
    Vector<Object> i = new Vector<Object>();

    // Trial Vector j
    Vector<Object> j = new Vector<Object>();
    j.add(1);

    unionVect = union(i, j);
  
//Initializes an iterator for the unionVector for test case 5.
    it = unionVect.iterator();
    
    outputVector (it, testCase);
    
    
    //Test Case 6.
    testCase = 6;
    
    // Trial Vector k
    Vector<Object> k = new Vector<Object>();
    k.add('a');
    k.add('b');
    // Trial Vector m
    Vector<Object> m = new Vector<Object>();
    m.add(1);
    m.add(2);

    unionVect = union(k, m);
  
//Initializes an iterator for the unionVector test case 6.
    it = unionVect.iterator();
    
    outputVector (it, testCase);
    
    //Test Case 7.
         
    testCase = 7;
    
    // Trial Vector n
    Vector<Object> n = new Vector<Object>();
    n.add('a');
    n.add('b');
    n.add('a');  
    // Trial Vector p
    Vector<Object> p = new Vector<Object>();
    p.add('c');
    p.add('d');
    p.add('c');
    p.add('c');

    unionVect = union(n, p);
  
//Initializes an iterator for the unionVector for test case 7.
    it = unionVect.iterator();
 
    outputVector (it, testCase);
        
    //Test Case 8.
        
    testCase = 8;
    
    // Trial Vector q
    Vector<Object> q = new Vector<Object>();
    q.add(1);
    q.add(2);
    q.add(3); 
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(8); 
    q.add(-1);
    q.add(4);
    q.add(3.2);
    q.add(8); 
    // Trial Vector r
    Vector<Object> r = new Vector<Object>();
    r.add(3);
    r.add(5);
    r.add(6);
    r.add(12);
    r.add(1000);

    unionVect = union(q, r);
  
//Initializes an iterator for the unionVector for test case 8.
    it = unionVect.iterator();
     
    outputVector (it, testCase);
        
    //Test Case 9.
    
    testCase = 9;

    // Trial Vector u
    Vector<Object> u = new Vector<Object>();

    // Trial Vector v
    Vector<Object> v = new Vector<Object>();

    unionVect = union(u, v);
    
//Initializes an iterator for the unionVector for test case 9.
    it = unionVect.iterator();
    
    outputVector (it, testCase);

        
    //Test Case 10.
    
    testCase = 10;
    
    // Trial Vector w
    Vector<Object> w = new Vector<Object>();
    w.add("Ford");
    w.add("Chevy");
    w.add("Toyota");
    w.add("BMW");
    // Trial Vector x
    Vector<Object> x = new Vector<Object>();
    x.add("The");
    x.add("The");
    x.add("sly");
    x.add("brown");
    x.add("fox");
    x.add("jumped");
    x.add("over");
    x.add("the");
    x.add("BMW");
    unionVect = union(w, x);
    
//Initializes an iterator for the unionVector for test case 10.
    it = unionVect.iterator();
    
    outputVector (it, testCase);
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

//************** Start of Java Method, outputVector *************************

public static void outputVector (Iterator it, Integer n) {

//Initializes an iterator for the unionVector for test case n.

    	System.out.println("The union vector for test case " + n + " is: ");
        System.out.print("[");
        
//This loop prints the union vector to see if it is correct.
    while (it.hasNext())
        {
        System.out.print(it.next());
                if (it.hasNext())
                {
                System.out.print(",");
                };
        }
        System.out.print("]");
        System.out.println();
}
    
}
