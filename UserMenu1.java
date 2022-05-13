package com.Inimai_Tamizhan;

class Icecream1{
	  static  String typeOfIce(int val){
	        String type="";
	        switch(val){
	            case 1:
	                type="stick";
	                break;
	            case 2:
	                type="cone";
	                break;
	            case 3:
	                type="cup";
	                break;
	        }
	        return type;
	    }
	}
	class Flavour1 extends Icecream1{

	 static void chooseFlavour(){
	      String flavor;
	 int type=1,flavr=1;
	 while(flavr<=3){
	        switch (flavr){
	            case 1:
	                flavor="chocolate";
	                chooseTypeVal(flavor);
	                System.out.println();
	                break;
	            case 2:
	                flavor="vannila";
	                chooseTypeVal(flavor);
	                System.out.println();
	                break;
	            case 3:
	                flavor="strawberry";
	                chooseTypeVal(flavor);
	                System.out.println();
	                break;
	        }
	     flavr++;
	 }}
	     static void chooseTypeVal(String flavor){
	         
	          int n=1;
	          while(n<=3){
	              System.out.println("flavor:   "+flavor+"   -   "+typeOfIce(n));
	              n++;
	          }

	      }
	                
	    }
	    

	class UserMenu1{
	    public static void main(String[] args) {
	         Flavour1 f=new Flavour1();
	         f.chooseFlavour();
	    }
	}
