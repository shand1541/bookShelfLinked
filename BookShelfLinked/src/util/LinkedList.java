package util;

//This class implements the ADT definition of a linked list using the same signatures. Note that we can add extra methods
//here once all of the methods listed in the ADT interface are included.

public class LinkedList<T> implements LinkedListADT<T> {
	
	 private int count;  // the current number of elements in the list
	 private LinearNode<T> front; //pointer to the first element 
	 private LinearNode<T> last; //pointer to the last element 
	 
	 //-----------------------------------------------------------------
	 //  Creates an empty list.
	 //-----------------------------------------------------------------
	    public LinkedList()
	    {
	       this.count = 0;
	       this.last = null;
	       this.front = null;
	    }

	    
	 //  Adds one element to the end of this list
	    //diagram
	   public void add (T element)
	   {      
		   LinearNode<T> node = new LinearNode<T> (element); 
       
		   if (size() == 0) {  
			   	this.last = node; // This is the last and the 
			 	this.front = node; // first node
			 	this.count++;
		   }//end if
		   else
		     { 
				  last.setNext(node); // add node to the end of the list
				  last = node; // now make this the new last node.  
			     
				  this.count++;   
		      } //end else
	   }
	   

	   //  Removes and returns the first element from this list
	
	public T remove()
	   {
		   LinearNode<T> temp = null;
		   T result = null;
			if (isEmpty()) {
				System.out.println("There are no nodes in the list");
			}//end if
			else {
				
				result = this.front.getElement();
				temp = this.front;
				this.front = this.front.getNext();
				temp.setNext(null); //dereference the original first element
				count--;
			}//end else
			return result;

	   }
	
	//extended 
	   public T get(int i) {
		
		   
		   return null;//element doesn't exist 
	
		   //returns i 
		   //similar to to string loop
	   }
	   
	   public boolean contains(T element) {
		return true;//if dupe element in list 
		   
	   }

	  
	   //  Returns true if this list contains no elements
	   public boolean isEmpty()
	   {
		   if (this.front == null)
			   return true;
		   else
			   return false;
	   }


	   //  Returns the number of elements in this list
	   public int size()
	   {
		   return this.count;
	   }

	   //  Returns a string representation of this list
	   public T get1(int i) {
		    if (i < 1 || i > size()) {
		        return null; // return null if index is out of bounds
		    }
		    LinearNode<T> current = front;
		    for (int count = 1; count < i; count++) {
		        current = current.getNext();
		    }
		    return current.getElement();
		}
	   public boolean contains(T element) {
		    LinearNode<T> current = front;
		    while (current != null) {
		        if (current.getElement().equals(element)) {
		            return true; // Element found
		        }
		        current = current.getNext();
		    }
		    return false; // Element not found
		}




	public String toString()
	   {
		   LinearNode<T> current = null;
		   String fullList = "";
		   
		   for (current = this.front; current != null; current = current.getNext())
		   {
			   fullList = fullList + "\n" + current.getElement().toString();
		   }//end for
		   
		   return fullList + "\n";
	   }

}
