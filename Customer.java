package com.Inimai_Tamizhan;
class IcecreamFlavour{
	String iceFlavour;
	int icePrice;
	int iceTypecost;
	String iceType;
	void setIceflavour(String iceFlavour,int icePrice) {
		this.iceFlavour=iceFlavour;
		this.icePrice=icePrice;
	}
	void setIcetype(String iceType,int iceTypecost) {
		this.iceType=iceType;
		this.iceTypecost=iceTypecost;
	}
	String getIceflavour() {
		return iceFlavour;
	}
	String getIceType() {
		return iceType;
	}
	
}
class Shop extends IcecreamFlavour{
	String toppings;
	int count;
	int cost;
	
	void choseflavour(){
		 setIceflavour("chocolate",25);
		 setIceflavour("vanilla",15);
		 setIceflavour("strawberry",20);
		 if(getIceflavour().equals("chocolate")) {
			 choseToppings();
		 }
		 }
	void choseType() {
		setIcetype("stick",5);
		setIcetype("cup",10);
		setIcetype("cone",15);
	}
	 void choseToppings() {
		 setToppings("oreo crumbles",20);
		 setToppings("cherries",35);
		 setToppings("choclate chips",60);
		 setToppings("fruity-fruity",10);
	}
	void  setToppings(String toppings,int cost) {
		 this.toppings=toppings;
		 this.cost=cost;
		 icePrice+=cost;
		 
	 }
	 String getToppings() {
		 return toppings;
	 }
	 void setQuantity(int count){
		
		this.count=count;
		 
	 }
	int getFinalBill() {
		 int total=icePrice+iceTypecost+cost;
		 return count*total;
	 }
	void calculateBill(){
		 System.out.println("flavour choosed: "+getIceflavour());
		 System.out.println("Type chosed: "+getIceType());
		 System.out.println("Topping chosen: "+getToppings());
		 System.out.println("FinalBill: "+getFinalBill());
		 
	 }
}
public class Customer {

	public static void main(String[] args) {
		Shop s=new Shop();
		s.choseflavour();
		s.choseType();
		s.setQuantity(1);
		s.choseToppings();
		s.calculateBill();

	}

}
