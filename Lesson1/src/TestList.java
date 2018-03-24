import java.util.ArrayList;
import java.util.List;

public class TestList {
	
     public static void main(String[] args) {
    	 
    	 //list 的作用是用来存放一些同种类型的元素
    	 //通常list有两种 
    	 
        List<String> list = new ArrayList<String>();
        list.add("黄色");
        list.add("绿色");
        
        int i;
        for (i=0; i<list.size(); i++) {
        	
        	System.out.println(list.get(i));
        	
        }
    	 
     }

}
