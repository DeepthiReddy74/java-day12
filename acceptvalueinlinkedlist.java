import java.util.*;
class acceptvalueinlinkedlist
{
    public static void mian(String args[])
    {
        LinkedList<Integer> a=new LinkedList<>();
        Scanner sc=new Scanner(system.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            int s=sc.nextInt();
            a.addFirst(s);

        }
        for(int i=0;i<size;i++)
        {
            System.out.println(a.get(i)+" ");
        }
    }
}