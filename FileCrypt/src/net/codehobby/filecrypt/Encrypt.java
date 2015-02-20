package net.codehobby.filecrypt;

public class Encrypt
{

	/**
	 * Encrypts unencryptedData using AES and returns the encrypted data.
	 * 
	 * @param unencryptedData The data to encrypt.
	 * @param initializationVector The initialization vector to use for encrypting.
	 * @param key The key to use for encrypting.
	 * @return
	 */
	public byte[] encryptData( byte[] unencryptedData, byte[] initializationVector, byte[] key )
	{
		byte[] encryptedData;

		//TODO: Finish this method.

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
