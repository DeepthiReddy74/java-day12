import jva.util.*;
class cloningarraylist
{
    public static void main(String args[])
    {
       LinkedList<Integer> a=new LinkedList<>();
        Scanner sc=new Scanner(system.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
           int s=sc.nextInt();
            a.addFirst(s);

        }
        LinkedList<Integer> b=new LinkedList<>();
        b=(LinkedList)a.clone();
        System.out.println(b);
        

    }
}