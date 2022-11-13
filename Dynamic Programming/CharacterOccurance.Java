public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		
		
		String str = "SomeshBangadasadd";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		map.entrySet().forEach(stream -> {
			System.out.println(stream.getKey() + " "+stream.getValue());
		});

	}

}
