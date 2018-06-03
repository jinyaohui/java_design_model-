package com.yaohuijin.java.designpattern.factorypattern;

public class NormalHumanFactory {
	public Human createHuamn(String generate){
		if("man".equals(generate)){
			return new Man();
		}else if ("woman".equals(generate)){
			return new Woman();
			
		}else{
			System.out.print("请输入正确的类型");
		}
		return null;
	}
}
