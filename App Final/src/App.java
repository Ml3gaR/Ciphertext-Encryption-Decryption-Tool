import java.util.Scanner;



public class App {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int choose = 0;
        try {
        do {
            System.out.print("\nChoose an option\n"
                    + "--------------------------------------------------------------------------\n"
                    + "1) Encryption\n"
                    + "2) Decryption\n"
                    + "3) Quit\n"
                    + "--------------------------------------------------------------------------\n"
                    + "Enter your option :> ");
            choose = kb.nextInt();
            kb.nextLine();
            if (choose == 1) {
                int enc = 0;
                System.out.print("\nChoose an option\n"
                        + "--------------------------------------------------------------------------\n"
                        + "1) Encryption using monoalphabetic substitution\n"
                        + "2) Encryption using the Playfair Algorithm\n"
                        + "3) Encryption using the Vigenere Algorithm\n"
                        + "4) Encryption using the Keyed Transposition\n"
                        + "5) Encryption by combining monoalphabetic substitution and the Keyed Transposition\n"
                        + "6) Encryption using bitwise XOR\n"
                        + "7) Encryption using DES\n"
                        + "--------------------------------------------------------------------------\n"
                        + "Enter your option :> ");
                enc = kb.nextInt();
                kb.nextLine();
                if (enc == 1) {
                    // Encryption using monoalphabetic substitution
                    String plainText;
                    System.out.println("Enter Plaintext ");
                    plainText = kb.nextLine();
                    MonoSubstitution m = new MonoSubstitution();
                    String encrypted = m.EncryptedMessage(plainText.toLowerCase());
                    System.out.println("Encrypted Message is: " + encrypted);

                } else if (enc == 2) {
                    playfair x = new playfair();
                    System.out.println("Enter a keyword:");
                    String keyword = kb.next();
                    x.setKey(keyword);
                    x.KeyGen();
                    System.out.println("Enter a word to encrypt:");
                    String key_input = kb.next();
                    x.Encript(key_input);
                }

                else if (enc == 3) {
                    // Encryption using the Vigenere Algorithm
                    System.out.print("Enter message :> ");
                    String text = kb.nextLine();
                    System.out.print("Enter key :> ");
                    String key = kb.next();
                    Vigenere v = new Vigenere();
                    String cipheredText = v.cipherText(text, key);
                    System.out.println("Ciphered message is : " + cipheredText);

                } else if (enc == 4) {
                    // Encryption using the Keyed Transposition
                    System.out.print("Enter message :> ");
                    String text = kb.nextLine();
                    KeyedTransposition k = new KeyedTransposition();
                    String cipheredText = k.cipherText(text);
                    System.out.println("Ciphered message is : " + cipheredText);

                } else if (enc == 5) {
                    // Encryption by combining monoalphabetic substitution and the Keyed
                    // Transposition
                    String plainText;
                    System.out.println("Enter Plaintext ");
                    plainText = kb.nextLine();
                    MonoSubstitution m = new MonoSubstitution();
                    KeyedTransposition k = new KeyedTransposition();
                    String encrypted = m.EncryptedMessage(plainText.toLowerCase());
                    encrypted = k.cipherText(encrypted);
                    System.out.println("Encrypted Message is: " + encrypted);

                } else if (enc == 6) {
                    // Encryption using bitwise XOR
                    XOREncryption x = new XOREncryption();
                    System.out.println("Please Enter Plaintext: ");
                    String sampleString = kb.nextLine();

                    // Encrypt the string
                    System.out.println("Encrypted Ciphertext: ");
                    x.Encrypt(sampleString);

                } else if (enc == 7) {
                    // Encryption using DES
                   
                    String key = "7777777777777777";
                   
                    DES cipher = new DES();
                    System.out.println("Enter Plaintext: ");
                    String plain = kb.next();
                    try {
                    String plain2 = cipher.toHex(plain);
                    cipher.encrypt(plain2, key);
                    System.out.println("\nCipher Text: " + cipher.CipherMessage.toUpperCase() + "\n");
                    System.out.println("To show steps and Feistel rounds enter 1, to stop enter any number: ");
                    int choice = kb.nextInt();
                    if (choice == 1) {
                    	cipher.toString();
                        System.out.println("Rounds: ");
                      	System.out.println(cipher.StringRounds);
                    }
                   
                    else {
                    	System.out.println("Thank you! ");
                    	System.exit(0);
                    }
                    
                    } catch(Exception e) {
                    	System.out.println("Error! You may only encrypt 8 character long Strings ie: 64 bits message ");
                    }
                   

                } else {
                    System.out.println("Error");
                }
            } else if (choose == 2) {
                int dec = 0;
                System.out.print("\nChoose an option\n"
                        + "--------------------------------------------------------------------------\n"
                        + "1) Decryption using monoalphabetic substitution\n"
                        + "2) Decryption using the Playfair Algorithm\n"
                        + "3) Decryption using frequency analysis\n"
                        + "--------------------------------------------------------------------------\n"
                        + "Enter your option :> ");
                dec = kb.nextInt();
                kb.nextLine();
                if (dec == 1) {
                    // Decryption using monoalphabetic substitution
                	MonoSubstitution m = new MonoSubstitution();
                    System.out.println("Enter ciphertext: ");
                    String cipherText = kb.nextLine();

                    String decrypted = m.DecryptMapping(cipherText.toLowerCase());
                    System.out.println("ciphertext: " + decrypted);
                    m.shiftArr();
                    decrypted = m.DecryptMapping(cipherText.toLowerCase());
                    System.out.println(" \n Plaintext: " + decrypted);

                    while (true) {
                        System.out.println("\n is this correct? \n ");
                        System.out.println("press 1 to stop, or press 2 to continue ");
                        int y = kb.nextInt();
                        if (y == 1) {
                            System.out.println("Thank you!");
                            break;
                        } else {
                            m.shiftArr();
                            decrypted = m.DecryptMapping(cipherText.toLowerCase());
                            System.out.println(" ");
                            System.out.println(" Plaintext: " + decrypted);
                        }

                    }

                } else if (dec == 2) {
                    playfair x = new playfair();
                    System.out.println("Enter a keyword:");
                    String keyword = kb.next();
                    x.setKey(keyword);
                    x.KeyGen();

                    System.out.println("enter the  word to decrypt:");
                    String decripted = kb.next();

                    x.Decript(decripted);

                } else if (dec == 3) {
                    // Decryption using frequency analysis
                    System.out.println("Enter ciphered message :> ");
                    String text = kb.nextLine();
                    Frequency f = new Frequency();
                    String[] top5 = f.freqAnalysis(text);
                    System.out.println("*******************************\n" + "Top 5 decrypted messages : ");
                    for (int i = 0; i < top5.length; i++) {
                        System.out.println((i + 1) + ") " + top5[i]);
                    }
                    System.out.println("*******************************");

                } else {
                    System.out.println("Error");
                }

            } else if (choose != 3) {
                System.out.println("Please enter valid input!!");
            }

        } while (choose != 3);
        System.out.println("Thanks Goodbye !");
        kb.close();

    }
     catch(Exception e) {
    	 System.out.println(" Wrong input ");
     }
}
}
