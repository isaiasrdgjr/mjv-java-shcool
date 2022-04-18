import java.util.StringJoiner;

public class ExStringJoiner {

	public static void main(String[] args) {
		
		StringJoiner banda = new StringJoiner(" ","Rock - "," /SP - Santos");
		
		//System.out.println(banda);
		banda.toString();
		banda.add("Charlie");
		banda.add("Brown");
		banda.add("Junior");
		System.out.println(banda);
		
		StringJoiner banda1 = new StringJoiner(" ","\nRock - "," /RJ - Rio de Janeiro");
		
		banda1.add("e Detonautas");
		System.out.println(banda1);
		
		banda.merge(banda1);
				
		StringJoiner asDuasBandas = new StringJoiner("-", "\n "," São as duas bandas");
		asDuasBandas.merge(banda);
		System.out.println(asDuasBandas);
		
				
	
	}

}
