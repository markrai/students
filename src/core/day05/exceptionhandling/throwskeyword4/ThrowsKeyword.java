package core.day05.exceptionhandling.throwskeyword4;

public class ThrowsKeyword {

	public void save() throws MyCustomException  {

		throw new MyCustomException("hi", "bye");

	}

}


/* if we have a throw, then we must either surround it with a try/catch
*  or we must have the method specify a "throws" keyword.
* 
*  throws - sends error back to caller method. The caller method can
*  either try/catch it, or send it higher up the call stack.
*
*  in try/catch you are dealing with it in the current method.
*
*/