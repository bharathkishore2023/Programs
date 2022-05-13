package com.Inimai_Tamizhan;
import java.util.Scanner;
	class Icecream3{
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
		 
	class Chocolate3 extends Icecream3{
		static void getChoco(String type,int quantity){
			int cost=35;
			int total=(cost+typeOfIce(type))*quantity;
			System.out.println("total cost is: "+total);
		}
	}
	class Vannila3 extends Chocolate3{
		static void getVannila(String type,int quantity){
			int cost=30;
			int total=(cost+typeOfIce(type))*quantity;
			System.out.println("total cost is: "+total);

		}
	}
	class Strawberry3 extends Vannila3{
		
		static void getStrawberry(String type,int quantity){
			int cost=25;
			int total=(cost+typeOfIce(type))*quantity;
			System.out.println("total cost is: "+total);

		}
	}
		class Flavour3 extends Strawberry3{

		      static void ChooseFlavour(String flavor,String type,int quantity){
		    	   switch(flavor){
		    	   case "chocolate" :
		    		   getChoco(type,quantity);
		    		   break;
		    	   case "vannila" :
		    		   getVannila(type,quantity);
		    		   break;
		    	   case "strawberry" :
		    		   getStrawberry(type,quantity);
		    		   break;
		    		   
		    	   }
		       }
		    }
		    
	class UserMenu3{
		    public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Select any flavor: chocolate/vannila/strawberry"); //   1.strawberry - 25      2.vannila- 30           3.chocolate-35 
		        String flavor=sc.next();
		        System.out.println("Select any type: stick/cup/cone"); // 1.stick - 5      2.cup - 10          3.cone - 15    
		        String type=sc.next();
		        System.out.print("Enter quantity:");
		        int quantity=sc.nextInt();
		        flavor=flavor.toLowerCase();
		        type=type.toLowerCase();
		    	Flavour3 f=new Flavour3();
		         f.ChooseFlavour(flavor,type,quantity);
		    }
		}




