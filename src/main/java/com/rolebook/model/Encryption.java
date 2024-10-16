package com.rolebook.model;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {
	private static String convertToHex(byte[] data) {
		
		StringBuffer buf = new StringBuffer(); //le stringbuffer est un type qu'on peut modif
		
		for(int i=0; i<data.length; i++) {
			
//			l'opérateur >>> permet de décaler le bits vers la droite non signé(non crypté) en java
//			il divise l'opérante par 4 à la puissance de l'opérante à droite(0x0F)
//			la data i est divisée en 4 à la puissance donnée par l'opérante de droite
			int halfByte = (data[i]>>>4) & 0x0F;
			
			int two_halfs = 0;
			
			//boucle faire
			do {
				if((0 <= halfByte) && (halfByte <=9)) {
					
					//je récupére la séquence de mon caractére
					buf.append((char)'0' + halfByte);
				}else {
					
					//On récupére les lettres a,b,c,d et e
					//En hexadécimal on à 1,2,3,4,5,6,7,8,9 et le 10 est remplacer par a
					
					buf.append((char)('a' + (halfByte-10)));
				}
				
				halfByte = data[i]& 0x0F;
			}while(two_halfs ++<1);
			
			
		}
		return buf.toString();
	
	}
	
	public static String getSHA1(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		//La classe messagedigest va fournir aux applications  
		//la fonctionnalité d'un algorithme de résumé de message
		//exemple: SHA-1 ou SHA-256
		MessageDigest md; 
		
		//Je prend un algorithme
		md=MessageDigest.getInstance("SHA-1");
		
		//on créer un tableau de bytes avec une dimension de 40 caractéres
		byte[] sha1hash = new byte[40];
		
		//le iso-8859-1 fait références aux caractéres de l'alphabet latin
		md.update(text.getBytes("iso-8859-1"),0, text.length());
		
		
		//je termine le calcul de hashage des opérations finales, telles que le remplissage
		sha1hash =md.digest();
		
		
		//On retourne le message converti en hexadécimal
		return convertToHex(sha1hash);
	}

}
