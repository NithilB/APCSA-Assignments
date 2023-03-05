public class SkyViewTester{
	public static void main(String[] args){
		double[] s1 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
		SkyView v1 = new SkyView(4,3,s1);
		System.out.println(v1 + "\n\n");

		double[] s2 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};
		SkyView v2 = new SkyView(3,2,s2);
		System.out.println(v2 + "\n\n");

		System.out.println("Calling getAverage: " + v1.getAverage(1,2,0,1));
	}
}

class SkyView{
	private double[][] view;
	public SkyView(int numRows, int numCols, double[] scanned){
		view = new double[numRows][numCols];
		int v = -1;
		int z = 0;
		int t = 0;
		for(int x = 0; x <= numCols; x++){
			v *= -1;
			for(int y = 0; y < numRows - 1; y++){
				if(v == 1){
					z = t;
					view[x][y] = scanned[z];
					z++;
					t = z;
				} else if (v == -1){
					view[x][y] = scanned[z];
					z--;
				}
			}
		if (v * -1 == -1){
			z += (numCols - 1);
			t = z + 1;
		}

		}
	}
	public double getAverage(int startRow, int endRow, int startCol, int endCol){
		double sum = 0;
		int cnt = 0;
		for(int x = startCol; x <= endCol; x++){
			for(int y = startRow; y <= endRow; y++){
				sum += view[y][x];
				cnt++;
			}
		}
		sum /= cnt;
		return sum;
	}

	public String toString( ){
		String out = "";
		for (int r = 0; r < view.length; r++){
			for (int c = 0; c < view[0].length; c++){
				out += view[r][c] + "\t";
			}
			out += "\n";
		}
		return out;
	}
}