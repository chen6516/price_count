package com.chenlong.pc.util;

import java.util.UUID;

public class UUIDCreator {
	private static String lastUuId = "";
	private static String newUuId = "";
	
	 public static String getUuId(){
		 lastUuId = newUuId;
		 UUID uuid = UUID.randomUUID();
		 String str = uuid.toString();
		 StringBuilder sb = new StringBuilder();
		for (String s :str.split("-") ) {
			sb.append(s);
		}
		newUuId = sb.toString();
		return newUuId;
	 }
	 public static String getLastUuId() {
		return lastUuId;
	 }
}
