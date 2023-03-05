/* Name:
   Lab 7.3 - SparseArray
*/

import java.util.*;

public class SparseArrayTester{
	public static void main( String[] args ){

	SparseArray array = new SparseArray();
	array.addEntry(new SparseArrayEntry(2, 0, 1));
	array.addEntry(new SparseArrayEntry(1, 1, 5));
	array.addEntry(new SparseArrayEntry(3, 1, -9));
	array.addEntry(new SparseArrayEntry(1, 4, 4));

	array.setNumRows(6);
	array.setNumCols(5);

	System.out.println("numRows: " + array.getNumRows() + "\nnumCols: " + array.getNumCols() + "\n\n" + array);

	System.out.println("Value at (3,1): " + array.getValueAt(3,1));
	System.out.println("Value at (3,3): " + array.getValueAt(3,3));

	array.removeColumn(1);

	System.out.println("\n\nRemove Column 1\nnumRows: " + array.getNumRows() + "\nnumCols: " + array.getNumCols() + "\n\n" + array);

	}
}

class SparseArray{
	private int numRows, numCols;
	private List<SparseArrayEntry> entries;

	public SparseArray(){
		entries = new ArrayList<SparseArrayEntry>();
	}

	public int getValueAt(int row, int col){
		// part a
		for(int r = 0; r < entries.size();r++){
			if(row == entries.get(r).getRow() && entries.get(r).getCol() == col){
			return entries.get(r).getValue();
			}
		}
	return 0;
	}

	public void removeColumn(int col){
		//part b
		for(int c = 0; c < entries.size();c++){
			if(entries.get(c).getCol() == col){
			   entries.remove(c);
			   c--;
		    }
		}

		for(int x = 0; x < entries.size();x++){
		    if(entries.get(x).getCol() > col){
				entries.set(x,new SparseArrayEntry(entries.get(x).getRow(),entries.get(x).getCol() - 1, entries.get(x).getValue()));
			}
		}
		setNumCols(getNumCols()-1);

	}

	public void setNumRows(int r){ numRows = r; }
	public void setNumCols(int c){ numCols = c; }

	public void addEntry(SparseArrayEntry x){
		entries.add(x);
		if (x.getRow() + 1 > numRows)
			numRows = x.getRow() + 1;
		if(x.getCol() + 1 > numCols)
			numCols = x.getCol() + 1;
	}

	public int getNumRows(){ return numRows; }
	public int getNumCols(){ return numCols; }

	public String toString(){
		String out = "";
		for (SparseArrayEntry x:entries){
			out += "row: " + x.getRow() + "\ncol: " + x.getCol() + "\nvalue: " + x.getValue() + "\n\n";
		}
		return out;
	}
}

class SparseArrayEntry{
	private int row, col, value;

	public SparseArrayEntry(int r, int c, int v){
		row = r;
		col = c;
		value = v;
	}

	public int getRow(){ return row; }
	public int getCol(){ return col; }
	public int getValue(){ return value; }
}

