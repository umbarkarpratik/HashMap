//Q4. Given an array nums of size n, return the majority element.
//Input: 4,2,7,1,9
//Output: 9
package DSA.Assignment.HashMapAssign;
import java.util.*;

public class Hashmapassing4 {
    public static void main(String[] args) {
        int i=0;
        
        TreeMap<Integer,Integer> map=new TreeMap();
        System.out.println("enter the number of element");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for( i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            map.put(arr[i],i);

        }
        System.out.println("LARGEST element is "+map.lastKey());
        
    }
    
}
