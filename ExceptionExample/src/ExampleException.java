
public class ExampleException {

	public static void main(String[] args) {
		
		try {
			throw new ExceptionMy();
		} catch (ExceptionMy e) {
			e.printStackTrace();
		}
	}

}
