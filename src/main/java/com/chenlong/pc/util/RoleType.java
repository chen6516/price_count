package com.chenlong.pc.util;

public enum RoleType {
	// 角色 0 管理员, 1内部人员, 2来访人员
	MANAGER,INSIDER,VISTOR;
	
	public static byte getOrdinal(RoleType roleType){
		return (byte)roleType.ordinal();
	}
}
