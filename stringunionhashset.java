import java.util.*;
public class stringunionhashset {
  public static void main(String args[]){
        String arr1[]={"hai","hello","raj","jagu"};
        String arr2[]={"jagu","hello","gangadhar","deepthi"};
        Set <String> a=new HashSet<>();
        Set <String> b=new HashSet<>();
        for(String  s: arr1)
        a.add(s);
        for(String s1: arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set <String> union=new HashSet<>(a);
        union.addAll(b);
        System.out.println(union);
  }
}