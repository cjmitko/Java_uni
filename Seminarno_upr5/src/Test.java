import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;
public class Test {

 String options;

User[] arr;

BufferedReader bf = new BufferedReader(new FileReader("User.txt"));


   {
  try {
   String line = bf.readLine();
   StringBuilder sb = new StringBuilder();
   while(line!=null)
   {
    sb.append(Arrays.toString(arr));
    sb.append("\n");
    line = bf.readLine();
   }
   String everything = sb.toString();
  } catch (IOException e) {
   throw new RuntimeException(e);
  }

 }

 public Test() throws FileNotFoundException {
 }
}

