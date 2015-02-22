package net.codehobby.filecrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.xml.bind.DatatypeConverter;

public class FileCrypt {

	public static void main(String[] args)
	{
		Encrypt encryptor = new Encrypt();

		String cipherText = "This is a test.";
		String key = "878547abaa437d1f3e993bc2a35d9eeebe2b036786afa066fc3009393cdfb99b9e6bc588b605b93fb894880997fe3f907f823cb83eaa060fbe3e62c36068d2e0";
		String initializationVector = "a1a4b8fd22aa74504d40381a35791eeb6a08aec3ef17a40682b189637d6f9a5f280a69994766d7c09aa19931558eccaa1388fc7e03df2b7e3515950205e4a724";
		
		byte[] encryptedData;

		//Encrypt the data
		try {
			encryptedData = encryptor.encryptData(cipherText.getBytes(), DatatypeConverter.parseHexBinary(initializationVector), DatatypeConverter.parseHexBinary(key) );
		} catch (InvalidKeyException | NoSuchAlgorithmException
				| NoSuchPaddingException | IllegalBlockSizeException
				| BadPaddingException e)
		{
			System.err.println( "Error trying to encrypt the data: " + e.getMessage() );
			e.printStackTrace();
			return;
		}

		//Print the results of the encryption.
		System.out.println( "Encryption finished!" );
		System.out.println( "Ciphertext: " + cipherText );
		System.out.println( "Key: " + key );
		System.out.println( "Initialization Vector: " + initializationVector );
		System.out.println( "Encrypted Data: " + encryptedData.toString() );

		//Encrypt the data
		try {
			encryptedData = encryptor.encryptData(encryptedData, DatatypeConverter.parseHexBinary(initializationVector), DatatypeConverter.parseHexBinary(key) );
		} catch (InvalidKeyException | NoSuchAlgorithmException
				| NoSuchPaddingException | IllegalBlockSizeException
				| BadPaddingException e)
		{
			System.err.println( "Error trying to encrypt the data: " + e.getMessage() );
			e.printStackTrace();
			return;
		}

		//Print the results of the encryption.
		System.out.println( "Decryption finished!" );
		System.out.println( "Key: " + key );
		System.out.println( "Initialization Vector: " + initializationVector );
		System.out.println( "Decrypted Data: " + encryptedData.toString() );
	}

}
