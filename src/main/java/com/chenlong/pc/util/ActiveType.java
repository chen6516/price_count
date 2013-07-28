package com.chenlong.pc.util;

public enum ActiveType {
	/**
	 * FADE: 无效
	 * ACTIVE:有效
	 */
	
	FADE,ACTIVE;
	
	public static byte getOrdinal(ActiveType activeType){
		return (byte)activeType.ordinal();
	}
}
