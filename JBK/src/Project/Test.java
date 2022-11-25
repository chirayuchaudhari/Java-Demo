package Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

public class Test
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Item i1 = new Item(12,"textbook", 150.0f, "stationary");
		Item i2 = new Item(15, "mouse", 1500.0f, "stationary");
		Item i3 = new Item(17, "Biscuits", 20.0f, "food");
		Item i4 = new Item(22, "sugar", 40.0f, "food");
		Item i5 = new Item(67, "Pen", 250.0f, "stationary");

		ArrayList<Item> itemlist = new ArrayList<Item>();

		itemlist.add(i1);
		itemlist.add(i2);
		itemlist.add(i3);
		itemlist.add(i4);
		itemlist.add(i5);

		Collections.sort(itemlist, new ItemNameComparator());

		System.out.println("Before Updation");	
		System.out.println();
		itemlist.forEach(System.out::println);
		System.out.println("==========================================");

		for(Item t:itemlist) {
			if(t.getCatagory().equalsIgnoreCase("Food"))
				t.setPrice(t.getPrice()+t.getPrice()*5/100);

			if(t.getCatagory().equalsIgnoreCase("Stationary"))
				t.setPrice(t.getPrice()+t.getPrice()*20/100);		
		}
		System.out.println("After Updation");		
		System.out.println();
		itemlist.forEach(System.out::println);
		System.out.println("============================================");

		ArrayList<Item> cart = new ArrayList<Item>();
		cart.add(i1);
		cart.add(i4);
		cart.add(i5);

		float bill = 0.0f;
		for(Item t1:cart) {
			bill = bill +t1.getPrice();
		}

		bill = bill - (bill*10/100);
		System.out.println("Content of cart");
		System.out.println();
		cart.forEach(s->System.out.print(s));
		System.out.println();
		System.out.println("Total bill "+ bill);

		System.out.println("==================================");
		ArrayList<ArrayList> al =  new ArrayList<ArrayList>();
		al.add(itemlist);  
		al.add(cart);

		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		System.out.println("data is written on the disk");
		System.out.println();
		oos.close(); 
		fos.close();

		System.out.println("==================================");			
		System.out.println("Reading data from the disk...");
		System.out.println();

		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = (Object) ois.readObject();
		
		ArrayList<ArrayList> t2 = (ArrayList<ArrayList>) obj;

		for(ArrayList temp:t2) {
			for(Object o:temp) {
				System.out.println(o);
			}
		}

	}
}