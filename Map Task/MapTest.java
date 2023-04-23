import java.util.*;

public class MapTest
{
	
	public static void main(String args[])
	{
		Map<Character,ArrayList<String>> map = new HashMap<>();
		MapTest obj = new MapTest();
		map.put('A',new ArrayList<String>(Arrays.asList("Ahmed")));
		map.put('a',new ArrayList<String>(Arrays.asList("alike")));
		map.put('B',new ArrayList<String>(Arrays.asList("Bald")));
		map.put('f',new ArrayList<String>(Arrays.asList("fay")));
		map.put('c',new ArrayList<String>(Arrays.asList("car","cool")));
		map.get('c').add("cad");
		obj.add('d',"diablo",map);
		obj.print(map);
	}
	
	
	public void add(Character c,String s,Map<Character,ArrayList<String>> map)
	{
		if (map.get(c)==null) map.put(c,new ArrayList<String>(Arrays.asList(s)));
		else{
			map.get(c).add(s);
			Collections.sort(map.get(c));
		}
	}
	public void print(Map<Character,ArrayList<String>> map)
	{
		int i=65,j=97;
		while(i<91)
		{
			if(map.get((char)i)!= null) System.out.println(map.get((char)i));
			if(map.get((char)j)!= null) System.out.println(map.get((char)j));
			i++;
			j++;
		}
	}
	public void print(Map<Character,ArrayList<String>> map,Character c)
	{
		if(map.get(c)== null) System.out.println("There's no data that starts with "+c+".");
		else System.out.println(map.get(c));
	}
}
