import java.io.PrintStream;


public class ExceptionMy extends Exception{

	@Override
	public void printStackTrace(PrintStream s) {
		System.err.println("Exception! Find error");
	}

	
	
	
	
}
