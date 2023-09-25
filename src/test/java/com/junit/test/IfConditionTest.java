package com.junit.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Condition
{
   public Integer a,b,c;
   public String str=null;
   
   public  void showCondition()
   {
	   if(str=="add")
	   {
		   c=a+b;
	   }
	   else if(str=="sub")
	   {
		   c=a-b;
	   }
   }
}
public class TestCondition
{
	 static testMethod void testMethod()
	 {
		 List<String> types = new ArrayList<>();
		 types.add("add");
		 types.add("sub");
		 for(String type: types) {
			 Condition condition = new Condition();
			 condition.a=5;
			 condition.b=5;
			 condition.str= type;
			 condition.showCondition();
			 System.AssertEquals(condition.c,10);
		 }
	 }
}
@isTest public class IfConditionTest {
  static testFunction void testAddFunction()
  {
	  Condition obj = new Condition();
	  obj.a = 6;
	  obj.b = 6;
	  obj.str = "add";
	  obj.showCondition();
	  
	  System.AssertEquals(obj.c,12);
  }
  static testFunction void testsubFunction()
  {
	  Condition obj = new Condition();
	  obj.a = 6;
	  obj.b = 6;
	  obj.str = "sub";
	  obj.showCondition();
	  
	  System.AssertEquals(obj.c,0);
	  
  }
}
