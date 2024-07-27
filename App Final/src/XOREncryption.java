import java.util.Scanner;

class XOREncryption
{
    
    static String Encrypt(String inputString)
    {
        //XOR Key
        char xorKey = 'K';
 
        // Empty String
        String outputString = "";
 
        // String length
        int len = inputString.length();
 
        // Perform XOR operation with key for every char from plaintext
        for (int i = 0; i < len; i++)
        {
            outputString = outputString +
            Character.toString((char) (inputString.charAt(i) ^ xorKey));
        }
 
        System.out.println(outputString);
        return outputString;
    }
 
   
   
}