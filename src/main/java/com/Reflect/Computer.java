package com.Reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

/**
 *com.Reflect.Computer.java 
 *
 * @author 张富成
 * @history
 * <TABLE id="HistoryTable" border="1">
 * 	<TR><TD>时间</TD><TD>描述</TD><TD>作者</TD></TR>
 *	<TR><TD>2014-5-6</TD><TD>创建初始版本</TD><TD>张富成</TD></TR>
 * </TABLE>
 */
public class Computer {
     
	
	@Test
	public void test() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		Computer computer = new Computer();
		computer.user();
	}
	
	public void user() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		InputStream ins = this.getClass().getClassLoader().getResourceAsStream("PCI.properties");
		Properties properties= new Properties();
		properties.load(ins);
		for(int i=0;i<properties.size();i++){
			String classname=properties.getProperty("pci"+i);
			Class clazz=Class.forName(classname);
			PCI pci=(PCI) clazz.newInstance();
			if(pci!=null){
				pci.open();
				pci.close();
			}
		}
		ins.close();
	}
}

/**
 * Copyright © 2014,天津天安怡和科技有限公司 All rights reserved.
 */