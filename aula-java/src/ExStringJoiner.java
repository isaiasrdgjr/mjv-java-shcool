import java.util.StringJoiner;

public class ExStringJoiner {

	public static void main(String[] args) {
		
		StringJoiner banda = new StringJoiner(" ");
		
		System.out.println(banda);
		banda.toString();
		banda.add("Charlie");
		banda.add("Brown");
		banda.add("Junior");
		System.out.println(banda);
		
		
			
				

	}

}
