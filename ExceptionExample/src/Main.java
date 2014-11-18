
public class Main {

	public static void main(String[] args) {
		
		String[] s = new String[2];
		s[0] = "Steve";
		s[1] = "Bruce";
	
		try{
			System.out.println(s[1] + "\n" + s[1]);
		}catch(Throwable ex){
			System.out.println("Index array!!!!");
		}
		

	}

}
