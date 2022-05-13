package com.Inimai_Tamizhan;
import java.util.Scanner;
class Icecream{
	  static  int typeOfIce(String type){
		  int cost=0;
	      switch(type) {
	      case "stick" :
	    	  cost=5;
	    	  break;
	      case "cone" :
	    	  cost=15;
	    	  break;
	      case "cup":
	    	  cost=10;
	    	  break;
	      }return cost;
		  }
	  
}
	 
class Chocolate extends Icecream3{
	static void getChoco(String type){
		int cost=35;
		int total=cost+typeOfIce(type);
		System.out.println("total cost is: "+total);
	}
}
class Vannila extends Chocolate3{
	static void getVannila(String type){
		int cost=30;
		int total=cost+typeOfIce(type);
		System.out.println("total cost is: "+total);

	}
}
class Strawberry extends Vannila3{
	
	static void getStrawberry(String type){
		int cost=25;
		int total=cost+typeOfIce(type);
		System.out.println("total cost is: "+total);

	}
}
	class Flavour extends Strawberry3{

	      static void ChooseFlavour(String flavor,String type){
	    	   switch(flavor){
	    	   case "chocolate" :
	    		   getChoco(type);
	    		   break;
	    	   case "vannila" :
	    		   getVannila(type);
	    		   break;
	    	   case "strawberry" :
	    		   getStrawberry(type);
	    		   break;
	    		   
	    	   }
	       }
	    }
	    
class UserMenu2{
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Select any flavor: chocolate/vannila/strawberry"); //   1.strawberry - 25      2.vannila- 30           3.chocolate-35 
	        String flavor=sc.next();
	        System.out.println("Select any type: stick/cup/cone"); // 1.stick - 5      2.cup - 10          3.cone - 15    
	        String type=sc.next();
	        flavor=flavor.toLowerCase();
	        type=type.toLowerCase();
	    	Flavour3 f=new Flavour3();
	         f.ChooseFlavour(flavor,type);
	    }
	}

