
import java.util.EmptyStackException;
/**
 * Invariant of the IntLinkedStack class:
 * 1. The items in the stack are stored in a linked list, with the top of
 * the stack stored at the top node, down to the bottom of the stack
 * at the final node.
 * 2. The instance variable top is the head reference of the linked list of items.
 * 
 * @author Samuel Vossen
 *
 */

public class HouseLinkedStack implements HouseStackInterface
{
   
	private HouseNode top; 
	private int manyItems;

	   /**
	   * Initialize an empty stack. 
	   **/   
	   public HouseLinkedStack( ){
	      top = null;
	   }

	   
	     
	   /**
	   * Determine whether this stack is empty.
	   * @return true if this stack is empty and false otherwise. 
	   **/
	   public boolean isEmpty( ){
	      return (top == null);
	   }
	   

	   /**
	   * @return the top item of the stack without removing it
	   * @exception EmptyStackException Indicates that this stack is empty.
	   **/   
	   public House peek( )   {
	      if (top == null)
	         // EmptyStackException is from java.util and its constructor has no argument.
	         throw new EmptyStackException( );
	      return top.getData( );
	   }

	   
	   /**
	   * Get the top item, removing it from this stack.
	   * @return The return value is the top item of this stack, and the item is removed.
	   * @exception EmptyStackException Indicates that this stack is empty.
	   **/    
	   public House pop( ) {
		   House answer;
	      
	      if (this.top == null)
	         // EmptyStackException is from java.util and its constructor has no argument.
	         throw new EmptyStackException( );
	      
	      answer = this.top.getData( );
	      this.top = this.top.getLink( );
	      manyItems--;
	      return answer;
	   }    


	   /**
	   * Push a new item onto this stack. 
	   * @param item - the item to be pushed onto this stack 
	   **/    
	   public void push(House item){
	      this.top = new HouseNode(item, this.top);
	      manyItems++;
	   }
	              

	   /**
	   * Accessor method to determine the number of items in this stack.
	   * @return the number of items in this stack
	   **/ 
	   public int size( ) {
	      return HouseNode.listLength(this.top);
	   }
	   
	   /** convert the stack to a printable string
	    * @return	a string representing the stack
	    */
	   	public String toString() {
	   		String output = "[ ";
	   		HouseNode cursor = top;
	   	
	   		while (cursor != null){
	   			output += cursor.getData()+"\t";
	   			cursor = cursor.getLink();
	   		}
	   	
	   		output  += " ] \n";
	   		return output;
	   }




}

