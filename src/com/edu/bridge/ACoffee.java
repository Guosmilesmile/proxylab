package com.edu.bridge;

public abstract class ACoffee {
	public ACupSize cupSize;
	public AFoam foam;
	public AMilk milk;
	public abstract String getCoffeeName();
	public String makeCoffee() {
		String result = "coffeename is"+getCoffeeName()+",";
		result+= " size is "+ getCupSize().getSize()+",";
		result+= " milk is "+getMilk().getMilkWeight()+",";
		result+=" foam is "+getFoam().getFoamWeight();
		return result;
	}
	public ACoffee(ACupSize cupSize, AFoam foam, AMilk milk) {
		super();
		this.cupSize = cupSize;
		this.foam = foam;
		this.milk = milk;
	}
	public ACupSize getCupSize() {
		return cupSize;
	}
	public void setCupSize(ACupSize cupSize) {
		this.cupSize = cupSize;
	}
	public AFoam getFoam() {
		return foam;
	}
	public void setFoam(AFoam foam) {
		this.foam = foam;
	}
	public AMilk getMilk() {
		return milk;
	}
	public void setMilk(AMilk milk) {
		this.milk = milk;
	}
	
}
