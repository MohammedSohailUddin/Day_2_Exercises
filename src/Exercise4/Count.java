package Exercise4;

import java.util.HashMap;
public class Count {
   public static void main(String[] args) {
      String str = "dgdfgdfhdfsdfsdfdgdfhgfjghjgfhjghjgfghdfgdfgsdfsdcfdfgfgnmfzsdfdfdffffsdfsddasdsghjhgg";
      System.out.println("Given String: "+str);
      HashMap <Character, Integer> hashMap = new HashMap<>();
      for (int i = 0; i <= str.length()-1; i++) {
         if (hashMap.containsKey(str.charAt(i))) {
            int count = hashMap.get(str.charAt(i));
            hashMap.put(str.charAt(i), ++count);
         } else {
            hashMap.put(str.charAt(i),1);
         }
      }
      System.out.println("Count of occurrences of each character is: "+hashMap);
   }
}

//Output:

//	Given String: dgdfgdfhdfsdfsdfdgdfhgfjghjgfhjghjgfghdfgdfgsdfsdcfdfgfgnmfzsdfdfdffffsdfsddasdsghjhgg
//	Count of occurrences of each character is: {a=1, s=9, c=1, d=20, f=23, g=16, h=8, j=5, z=1, m=1, n=1}
