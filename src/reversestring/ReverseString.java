package reversestring;

import java.io.*;
/**
 *
 * @author mansisaini
 * Reverse the order of a string
 */
public class ReverseString 
{
  public static void main(String[] args) throws IOException 
    {
        String input = "";
        System.out.println("Enter string of elements: ");
        
        try {
            //Reads the input String
            BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
            //Takes the uder input and puts it into input
            input = reader.readLine();
            //converts the elements from input to chars and puts them in array 
            char[]arr = input.toCharArray();
            
            //this loop runs from the end of the array to the beginning
            for(int i=arr.length-1; i>=0; i--)
            {
                System.out.print(arr[i]);
            }
            System.out.println("\n");
            
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
