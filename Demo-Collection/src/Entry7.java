import java.util.HashMap;

public class Entry7 {
	public static void main(String[] args) {
		
		HashMap<Long, String> entries;
		entries = new HashMap<>();
		
//		byte b = 127;
		
		entries.put(9890012345L,"AirTel");
		entries.put(null,"JIO");
		entries.put(null,"JIO");
		
		entries.put(98220567220L,"Idea");
		String oldVal = entries.put(98220567220L,"Vodafone");
		System.out.println(oldVal);
	    oldVal = entries.put(98220567220L,"BSNL");
		System.out.println(oldVal);
		
		
		
		System.out.println(entries.size());
		
		
		
	}
}
