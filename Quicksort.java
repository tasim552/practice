
package quicksort;

import java.util.Scanner;

public class Quicksort {
public static void main(String[] args) {
int i;
char[] arr = {'G','r','e','e','n','U','n','i','v','e','r','s','i','t','y'};
   quicksort(arr, 0, arr.length−1);
   
      System.out.println(&quot;The sorted array is: &quot;);  
      
       for (i = 0; i &lt; arr.length; i++) {
    
}
      System.out.println(arr[i]);
 }

    private static void quicksort(char[] arr, int i, int length) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static void quickSort(char[] arr, int i, int length) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
 }
       public static char partition(char a[], char beg, char end) {
   char left, right, temp, loc, flag;
     loc = left = beg;
  right = end;
    flag = 0;
     while (flag != 1) {
    while ((a[loc] &lt;= a[right]) &amp;&amp; (loc != right)) {
 right−−;
    }
  if (loc == right) {
  flag = 1;
    } else if (a[loc] &gt; a[right]) {
     temp = a[loc];
   a[loc] = a[right];
    a[right] = temp;
    loc = right;
}
    if (flag != 1) {
   while ((a[loc] &gt;= a[left]) &amp;&amp; (loc != left)) {
  left++;
   }
   if (loc == left) {
   flag = 1;
   } else if (a[loc] &lt; a[left]) {
   temp = a[loc];
  a[loc] = a[left];
   a[left] = temp;
   loc = left;
  }

  }
}
  return loc;
}
  static void quicksort(char a[], char beg, char end) {
   int loc;
  if (beg &lt; end) {
  loc = partition(a, beg, end);
     quicksort(a, beg, loc − 1);
     quicksort(a, loc + 1, end);
  }
  }
  

