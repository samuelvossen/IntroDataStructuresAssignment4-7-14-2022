import java.util.EmptyStackException;

public interface HouseStackInterface {
	 
	/**Determine whether this stack is empty.
	 * @return true if this stack is empty and false otherwise. 
	 */
	public boolean isEmpty( );
	 
	/**@return the top item of the stack without removing it
	 * @exception EmptyStackException Indicates that this stack is empty.
	 **/ 
	public House peek( );
	
	/** Get the top item, removing it from this stack.
	 * @return The return value is the top item of this stack, and the item is removed.
	 * @exception EmptyStackException Indicates that this stack is empty. 
	 **/
	public House pop( );
	
	/**Push a new item onto this stack. 
	 *  @param item - the item to be pushed onto this stack 
	 **/ 
	public void push(House item);
	
	/**
	 * Accessor method to determine the number of items in this stack.
	 * @return the number of items in this stack
	 * **/ 
	public int size( );
	
	/** convert the stack to a printable string
	 * @return	a string representing the stack
	 **/
	public String toString();

}