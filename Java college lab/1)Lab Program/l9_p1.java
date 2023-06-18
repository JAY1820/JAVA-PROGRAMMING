//collection framework
import java.util.*;
import java.util.ArrayList;
public class l9_p1 {
    
    public static void main(String[] args) {
        
      ArrayList<String> list=new ArrayList<String>();
      list.add("jay");
      list.add("jaya");
      list.add("jayant");
      list.add("jayesh");
      

      Iterator itr=list.iterator();
      while(itr.hasNext()){
          System.out.println(itr.next());
      }
      //sorting
      Collections.sort(list);
      //traversing list through for-each loop
      for(String str:list)
        System.out.println(str);

        //removing specific element from arraylist
        list.remove("jay");
        System.out.println("after removing jay");
        for(String str:list)
        System.out.println(str);

        //searching element in arraylist
        System.out.println("searching element in arraylist");
        System.out.println(list.contains("jayant"));

        //converting arraylist into array
        System.out.println("converting arraylist into array");
        Object[] arr=list.toArray();
        for(Object obj:arr)
        System.out.println(obj);
        




    }
}
