import java.util.ArrayList;
import java.util.List;

public class TestList {
	
     public static void main(String[] args) {
    	 
    	 //list ���������������һЩͬ�����͵�Ԫ��
    	 //ͨ��list������ 
    	 
        List<String> list = new ArrayList<String>();
        list.add("��ɫ");
        list.add("��ɫ");
        
        int i;
        for (i=0; i<list.size(); i++) {
        	
        	System.out.println(list.get(i));
        	
        }
    	 
     }

}
