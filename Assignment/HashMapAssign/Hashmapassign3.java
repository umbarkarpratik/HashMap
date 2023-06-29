//Detect if an Array contains a duplicate element. At Most 1 duplicate
//would be there.
//Input: 1,2,3,4
//Output: No

package DSA.Assignment.HashMapAssign;

import java.util.HashMap;
import java.util.Map;

public class Hashmapassign3 {
    
    public static void main(String[] args) {
        int res=-1;
        int arr[]={1,2,3,4};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                System.out.println("yes");
                 res=1;
                 break;
            }
            map.put(arr[i],i);
           
            
        }
        if(res==-1)
         System.out.print("No");

    }
    
}