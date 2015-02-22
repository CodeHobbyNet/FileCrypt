package net.codehobby.filecrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class Encrypt
{

	/**
	 * Encrypts unencryptedData using AES and returns the encrypted data.
	 * 
	 * @param unencryptedData The data to encrypt.
	 * @param initializationVector The initialization vector to use for encrypting.
	 * @param key The key to use for encrypting.
	 * @return The encrypted data.
	 * @throws NoSuchPaddingException Gets thrown if the cipher doesn't support the padding type specified.
	 * @throws NoSuchAlgorithmException Gets thrown if the cipher doesn't support the encryption algorithm.
	 * @throws InvalidKeyException Gets thrown if the encryption key is invalid in some way. (It's probably the wrong length.)
	 * @throws BadPaddingException Gets thrown if the data doesn't already have the appropriate padding.
	 * @throws IllegalBlockSizeException Gets thrown if the input length isn't a multiple of the block size (or if there's a general error with the input data apparently).
	 */
	public byte[] encryptData( byte[] unencryptedData, byte[] initializationVector, byte[] key ) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException
	{
		byte[] encryptedData;

		//TODO: Finish this method.

		SecretKeySpec sKey = new SecretKeySpec( key, 0, 16, "AES" );

		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		//Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");

		cipher.init(Cipher.ENCRYPT_MODE, sKey);

		encryptedData = cipher.doFinal(unencryptedData, 0, unencryptedData.length);

		return encryptedData;
	}
	
	/**
	 * Encrypts the file with the file name in inputFileName and saves it to a file with the file name in outputFileName.
	 * 
	 * @param inputFileName The file name of the input file.
	 * @param outputFileName The file to save the encrypted data to.
	 * @param key The key to use for encryption.
	 */
	public void encryptFile( String inputFileName, String outputFileName, byte[] key )
	{
		//TODO: Finish this method.
	}
}
