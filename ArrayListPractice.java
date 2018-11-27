import java.util.ArrayList;
public class ArrayListPractice{
	public static void main(String[]args){
		ArrayList <Integer> list1 = new ArrayList <> ();
		ArrayList <Integer> list2 = new ArrayList <> ();
		list1.add(1);	list2.add(6);
		list1.add(2);	list2.add(7);
		list1.add(3);	list2.add(8);
		list1.add(4);	list2.add(9);
		list1.add(5);	list2.add(10);
		System.out.println(combineLists(list1, list2));
	}
	public static ArrayList <Integer> combineLists(ArrayList <Integer> firstList, ArrayList <Integer> secondList){
		ArrayList <Integer> combinedList = new ArrayList <> ();
		for(int i = 0; i < firstList.size(); i++)
			combinedList.add(firstList.get(i));
		for(int i = 0; i < secondList.size(); i++)
			combinedList.add(secondList.get(i));
		return combinedList;
	}
}