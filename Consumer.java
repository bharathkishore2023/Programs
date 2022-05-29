package com.Inimai_Tamizhan;

import java.util.*;
class Items{
	int quantity;
	float price;
	int totalQuantity=0;
	float totalPrice=0;
	float discount;
	ArrayList<String>listOfItems=new ArrayList<>();
	void getListOfItems() {
		
		listOfItems.add("4 biscuits at 10");
		listOfItems.add("3 icecream at 50.00");
		listOfItems.add("2 pencil at 5.00");
		System.out.println("List Of Items");
		 displayItems(listOfItems);
	System.out.println(""
			+ ""
			+ "");
	}
	void displayItems(ArrayList<String>listOfItems) {
		listOfItems.forEach((i)->System.out.println(i));
	}
	void setQuantity(String Quantity) {
		this.quantity=Integer.parseInt(Quantity);
		totalQuantity+=quantity;
	}
}
class Shopping extends Items{
	float taxOfItems;
	String nameOfitem;
	float costAfterTax;
	float totalTax=0;
	float pricewithquantity=0;
	float overAllcost;
	ArrayList<String>TaxlessItems=new ArrayList<>();
	void billingItems(){
		System.out.println("name   "+"  Quantity   "+"  price   "+" taxOfItem  "+" costAfterTax   ");
		for(int i=0;i<listOfItems.size();i++) {
			listOfItems.get(i).toLowerCase();
			String ArrayItems[]=listOfItems.get(i).split(" ");
			setQuantity(ArrayItems[0]);
			price=Float.parseFloat(ArrayItems[ArrayItems.length-1]);
			calculatePrice(price);
			calculateTax(ArrayItems[1]);
			displayBilling();
		}
		calculateDiscount();
		FinalBill();
	}
	void displayBilling() {
		System.out.println(""
				+ ""
				+ "");
		System.out.println(nameOfitem+"      "+quantity+"       "+price+"      "+taxOfItems+"     "+costAfterTax+"  ");
	}
	float calculatePrice(float price) {
		pricewithquantity=price*quantity;
		totalPrice+=pricewithquantity;
		return price ;
		
	}
	void calculateTax(String nameOfItem) {
		nameOfitem=nameOfItem;
		if(!checkTaxlessOrNot(nameOfItem)) {
		taxOfItems=(price*15)/100;
		totalTax+=taxOfItems;
		costAfterTax=pricewithquantity+taxOfItems;
		}
		else {
			taxOfItems=0;
			totalTax+=taxOfItems;
			costAfterTax=pricewithquantity+taxOfItems;
		}
	}
	boolean checkTaxlessOrNot(String nameOfItem){
		TaxlessItems.add("milk");
		TaxlessItems.add("egg");
		TaxlessItems.add("curd");
		TaxlessItems.add("biscuits");
		boolean res=false;
		for(int i=0;i<TaxlessItems.size();i++) {
			if(	TaxlessItems.get(i).equals(nameOfItem))
			{
				res=true;
				break;
			}
		}
		return res;
	}
	void calculateDiscount() {
		overAllcost=totalPrice+totalTax;
		discount=(overAllcost*5)/100;
	}
	void FinalBill() {
		System.out.println("         "
				+ ""
				+ "    ");
		System.out.println("Total No. of Items:    "+totalQuantity);
		System.out.println("Totalprice:     "+totalPrice);
		System.out.println("Totaltax:    "+totalTax);
		System.out.println("Discount(5%)  "+discount);
		System.out.println("overall cost Actually:  "+overAllcost);
		System.out.println("Overall Cost After Discount     "+(overAllcost-discount));
	}
}


public class Consumer {

	public static void main(String[] args) {
		Shopping s=new Shopping();
		s.getListOfItems();
		s.billingItems();
	}

}
