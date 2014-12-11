package com.Reflect;

/**
 *com.Reflect.SoundCard.java 
 *
 * @author 张富成
 * @history
 * <TABLE id="HistoryTable" border="1">
 * 	<TR><TD>时间</TD><TD>描述</TD><TD>作者</TD></TR>
 *	<TR><TD>2014-5-6</TD><TD>创建初始版本</TD><TD>张富成</TD></TR>
 * </TABLE>
 */
public class SoundCard implements PCI{

	public void open() {
		System.out.println("声卡打开");
	}

	public void close() {
		System.out.println("声卡关闭");
	}

}

/**
 * Copyright © 2014,天津天安怡和科技有限公司 All rights reserved.
 */