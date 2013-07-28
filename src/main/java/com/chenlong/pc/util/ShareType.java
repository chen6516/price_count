package com.chenlong.pc.util;

public enum ShareType {
	 // 0内部, 1公摊, 2私人
	 SHARE_BY_INNER, SHARE_BY_PUBLIC, PRIVATE_ONESELF;
	 
	 public static byte getOrdinal(ShareType shareType){
			return (byte)shareType.ordinal();
		}
}
