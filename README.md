Readme File

Encryption / Decryption Software tool

======================================================================================================================================================================================================================
Description:
This tool uses multiple encryption and decryption algorithms. - 
Encryption algorithms used are useful to protect private and senstive information and to preserve confidentiality. -
Decryption algorithms are useful to either convert data to its original form, or to try to find meaning from encrypted data. - 
The main goal of this software is to grant the user different encryption/decryption algorithms that user can choose from with different levels of confusion and difusion which can be both educative and interactive.
======================================================================================================================================================================================================================

================================================================
Algorithms used:

This tool uses the following algorithms to encrypt plaintexts:
- Monoalphabetic Substitution
- Playfair
- Keyed Transposition'
- Combonation of monoalphabetic substitution and keyed transposition
- Bitwise Exclusive or 
- DES

This tool uses the following algorithms to decrypt ciphertexts:
- Monoalphabetic Substitution
- Playfair
- Frequency Analysis
================================================================

===============================================================================================================================
How to run the tool:
To start using the tool, The user must first go to App.java class found in the src file and start the program using CTRL + F11.
===============================================================================================================================

====================================================================================================================================================================================================================================================================================================================================
How to use the tool:

After the user has started the software, the user is given three choices: 1- Encryption 2- Decryption 3- Quit 

To use monoalphabetic substitution encryption the user must enter: " 1 " then " 1 " then the user must enter a string plaintext as input to be encrypted. 

To use playfair encryption the user must enter " 1 " then " 2 " then the user must enter a string keyword as input to fill the 5x5 matrix then, the user must enter a string plaintext as input to be encrypted.

To use Vigenere encryption the user must enter " 1 " then " 3 " then the user must enter a string plaintext as input, then the user must enter a string key as input.

To use Keyed transposition encryption the user must enter " 1 " then " 4 " then the user must enter a string plaintext as input.

To use a combination of monoalphabetic substitution and keyed transposition encryption the user must enter " 1 " then " 5 " then the user must enter a string plaintext as input.

To use bitwise XOR encryption the user must enter " 1 " then " 6 " then the user must enter a string plaintext as input.

To use DES the user must enter " 1 " then " 7 " then the user must enter a 64 bit plaintext that is an 8 character string as an input.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

To use monoalphabetic substitution decryption the user must enter " 2 " then " 1 " then the user must enter a string ciphertext as input to be decrypted. the tool will provide a suggested plaintext the user can either enter " 1 " if the plaintext is correct or press " 2 " to try another plaintext of an another iteration.

To use Playfair decryption the user must enter " 2 " then " 2 " then the user must enter a string keyword as input to fill the 5x5 matrix, then the user must enter a string ciphertext as input to be decrypted.

To use Frequency Analysis decryption the user must enter " 2 " then " 3 " then the user must enter a string ciphertext as input and the tool will display the top 5 probable plaintexts.
====================================================================================================================================================================================================================================================================================================================================

