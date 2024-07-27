import java.util.InputMismatchException;
import java.util.Scanner;

public class MonoSubstitution {

	static char mapped[] = new char[26];
	
	public static char alphabet[] =
        { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
          'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
          's', 't', 'u', 'v', 'w', 'x', 'y', 'z' }; 
	
	 public static char mappingArr[] = // key = +5        //encrypt
         { 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
           'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
           'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E' };
	
	 {
		for(int i = 0; i < alphabet.length; i++) {
			mapped[i] = alphabet[i];
		}
	}
	 
	public void shiftArr() {
	 
		char temp;
		temp = mapped[0];
		for (int i = 0; i < mapped.length - 1; i++) {
			mapped[i] = mapped[i+1];
			}
		mapped[mapped.length - 1] = temp;
	}
	 
	 public void Print()
	 {
		 for (int i = 0; i < mapped.length; i++) {
			 System.out.println(mapped[i]);
		 }
	 }
	 
	 public static String DecryptMapping(String user) {
		 String DecryptedMessage = "";
		 
		 for (int i = 0; i < user.length(); i++) {
			 for(int x = 0; x < 26; x++) {
				 if(user.charAt(i) == alphabet[x]) {
					 DecryptedMessage += mapped[x];
				 }
			 }
		 }
		 
		 if(DecryptedMessage.isEmpty() || DecryptedMessage == " ") {
			 System.out.println( "Please Enter a String that is Made of Atleast One English Character ");
			 System.exit(0);
		 }
		 return DecryptedMessage;
	 }
	 
	 public static String EncryptedMessage(String user) { 
	        String EncryptedMessage = ""; //Empty string
	        
	        for(int i = 0; i < user.length(); i++) {
	            for(int x = 0; x < 26; x++) {
	                
	                if(user.charAt(i) == alphabet[x]) {
	                    EncryptedMessage += mappingArr[x];
	                }
	            }
	            if (user.charAt(i) == ' ')
	            {
	                EncryptedMessage += user.charAt(i);              
	                }
	        } 
	        if (EncryptedMessage.equalsIgnoreCase(" ")) {
	            EncryptedMessage = "Please Enter a String that is Made of Atleast One English Character ";
	        }
	        if(EncryptedMessage.isEmpty()) {
	            EncryptedMessage = "Please Enter a String that is Made of Atleast One English Character ";
	    }
	        return EncryptedMessage;
	    }
	 
	 }