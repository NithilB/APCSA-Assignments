import java.util.*;
public class NumberGroupTester {
    public static void main(String[] args) {

		List<NumberGroup> g = new ArrayList<NumberGroup>();
		g.add(new Range(5,8));
		g.add(new Range(10,12));
		g.add(new Range(1,6));
		MultipleGroups multiple1 = new MultipleGroups(g);

		System.out.println("multiple1.contains(2): " + multiple1.contains(2));
		System.out.println("multiple1.contains(9): " + multiple1.contains(9));
		System.out.println("multiple1.contains(6): " + multiple1.contains(6));

	}
}

interface NumberGroup{

	boolean contains(int i);

}

class Range implements NumberGroup{
	private int min;
	private int max;

	public Range(int r, int c){
		min = r;
		max = c;
	}

	public boolean contains(int i){
		if(i <= max && i >= min){
			return true;
		}
		return false;
	}
}


class MultipleGroups implements NumberGroup{
	private List<NumberGroup> groupList;

	public MultipleGroups(List<NumberGroup> g){
		groupList = g;
	}

	public boolean contains(int num){
		for(int r = 0; r < groupList.size(); r++){
			if(groupList.get(r).contains(num)){
				return true;
			}
		}
		return false;
	}

}