package hashing;


import java.util.*;
public class hashing {
public static void main(String args[])
{
    Map<String, Integer> yo=new HashMap<>();
    int minsum=Integer.MAX_VALUE;
    String list1[]= {"Shogun", "Tapioca Express", "Burger King", "KFC"};
    //LinkedList res=new LinkedList();
    String list2[]= {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        List<String> res = new LinkedList<>();
        for (int i=0;i<list1.length;i++)
            yo.put(list1[i], i);
        for (int i=0;i<list2.length;i++) {
            Integer j = yo.get(list2[i]);
            if (j != null && i + j <= minsum) {
                if (i + j < minsum)
                {
                   // res = new LinkedList<>();
                	res.clear();
                    minsum = i+j;
                }
                res.add(list2[i]);
            }
        }
       // String yo1[]=res.toArray(new String[res.size()]);
        //for(int k=0;k<yo1.length;k++)
      //  {
          //  System.out.print(yo1[k]);
       // }
        System.out.println(res);
}
}


