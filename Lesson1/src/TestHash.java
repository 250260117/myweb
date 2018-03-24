import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHash {
	
	public static void main(String[] args) {
		
		//hashmap的作用是通过key来找value
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("黄色", "yellow");
		map.put("绿色","green");
		
		//System.out.println(map.get("黄色").toString());
		
		Iterator<Map.Entry<String, Object>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Object> next = iter.next();
			System.out.println(next.getKey()+":"+next.getValue());
			
			
		}
		
		
	}

}
