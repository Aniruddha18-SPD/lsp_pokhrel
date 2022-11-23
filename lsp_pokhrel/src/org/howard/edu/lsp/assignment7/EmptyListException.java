package org.howard.edu.lsp.assignment7;
/*
 * Exception defined for the EmptyListException
 */
public class EmptyListException extends Exception {
	private static final long serialVersionUID = 1L;

	public EmptyListException(String str)  
    {  
        super(str); 
    } 

}