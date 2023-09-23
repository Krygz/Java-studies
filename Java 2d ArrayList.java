import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
  
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		
ArrayList<String> drinksList = new ArrayList();
drinksList.add("soda");
drinksList.add("coffe");

 

 ArrayList<String> backryList = new ArrayList();
 backryList.add("pasta");
 backryList.add("garlic bread");
 backryList.add("donuts");

 
 ArrayList<String> produceList = new ArrayList();
 produceList.add("tomatos");
 produceList.add("zucchini");
 produceList.add("pepper");

 
 groceryList.add(drinksList);
 groceryList.add(backryList);
 groceryList.add(produceList);
 
 
 System.out.println(groceryList.get(0).get(0));
 
 
   }
   
		
		
		
	}
