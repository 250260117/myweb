import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHash {
	
	public static void main(String[] args) {
		
		//hashmap��������ͨ��key����value
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("��ɫ", "yellow");
		map.put("��ɫ","green");
		
		//System.out.println(map.get("��ɫ").toString());
		
		Iterator<Map.Entry<String, Object>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Object> next = iter.next();
			System.out.println(next.getKey()+":"+next.getValue());
			
			
		}
		
		
	}

}
