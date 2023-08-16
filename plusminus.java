import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
      int n=arr.size();
      int c=0;
      int d=0;
      int e=0;
      for(int num:arr)
      {
          if(num>0)
          {
              c++;
          }
          else if(num<0)
          {
              d++;
          }
          else{
              e++;
          }
      }
      double pr=(double)c/n;
      double ar=(double)d/n;
      double tr=(double)e/n;
      System.out.printf("%.6f%n",pr);
      System.out.printf("%.6f%n",ar);
      System.out.printf("%.6f%n",tr);
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
