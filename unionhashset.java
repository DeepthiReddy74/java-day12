import java.util.*;
class unionhashset
{
    public static void main(String args[])
    {
        int arr1[]={99,5,6,1,2,3};
        int arr2[]={1,2,3,4,5,6};
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int s:arr1)
        a.add(s);
        for(int s1:arr2)
        a.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<Integer>union=new HashSet<>(a);
        union.addAll(b);
        System.out.println(union);
    }
}