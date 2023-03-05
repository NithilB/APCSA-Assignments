public class LogMessage{
	private String machineId;
	private String description;

		public LogMessage(String message){
			int a = message.indexOf(":");
			machineId = message.substring(0,a+1);
			description = message.substring(a+1);
		}

		public boolean containsWord(String keyword){
			String e = " " + keyword;
			String k = " " + keyword + " ";
			int x = description.indexOf(e);

			if(description.substring(x+1).equals(keyword) || description.indexOf(k) != -1){
				return true;
			}
			//System.out.println(7 + 8 + (7 + 8) + "Hello" + 7 + 8 + (7 + 8));
			//System.out.println(0%5);
			//int c = 1, y = 3;
			//System.out.println((c+y) % 2 +"/n"+ (y + y) % 2);
			return false;
		}

		public String getMachineId(){
			return machineId;
		}

		public String getDescription(){
			return description;
		}

}