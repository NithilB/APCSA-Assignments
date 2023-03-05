public class GrayImageTester{
	public static void main(String[] args){
		int[][] p1 = {{255,184,178,84,129},{84,255,255,130,84},{78,255,0,0,78},{84,130,255,130,84}};

		GrayImage a = new GrayImage(p1);

		int m = pl[].length;
		for(int rows[] : m){
			for (int v: rows){
				System.out.print(p1[v] + " ");
			}
		}
		//System.out.println(a + "\nCall to count white pixels: " + a.countWhitePixels()+"\n\n");

		int[][] p2 = {{221,184,178,84,135},{84,255,255,130,84},{78,255,0,0,78},{84,130,255,130,84}};


		GrayImage b = new GrayImage(p2);
		System.out.println(b + "\nProcess Image: \n");
		b.processImage();
		System.out.println(b);


	}
}
class GrayImage{
	public static final int BLACK = 0;
	public static final int WHITE = 255;

	private int[][] pixelValues;

	public GrayImage(int[][] img){
		pixelValues = new int[img.length][img[0].length];
		for (int i = 0; i < img.length; i++){
			for (int j = 0; j < img[0].length; j++){
				pixelValues[i][j] = img[i][j];
			}
		}
	}

	public int countWhitePixels( ){
		int cnt = 0;
		for(int i = 0; i < pixelValues.length; i++){
			for(int v = 0; v < pixelValues[i].length; v++){
				if(pixelValues[i][v] == 255){
					cnt++;
				}
			}
		}
		return cnt;
	}
	public void processImage(){
		int y = 0;
		int x = pixelValues.length;
		for(int i = 0; i < pixelValues.length; i++){
			y = pixelValues[i].length;
			for(int v = 0; v < pixelValues[i].length; v++){
				if(i + 2 < x && v + 2 < y){
					if(pixelValues[i][v] < pixelValues[i+2][v+2]){
						pixelValues[i][v] = pixelValues[i+2][v+2];
					}
					pixelValues[i][v] -= pixelValues[i+2][v+2];
				}
			}
		}

	}

	public String toString(){
		String out = "";
		for (int i = 0; i < pixelValues.length; i++){
			for (int j = 0; j < pixelValues[0].length; j++)
				out += pixelValues[i][j] + "\t";
			out += "\n";
		}
		return out;
	}
}
