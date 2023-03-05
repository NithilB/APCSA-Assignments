public class WelcomeMessageTester{
	public static void main(String[] args){
		WelcomeEnglish a = new WelcomeEnglish();
		WelcomeSpanish b = new WelcomeSpanish();
		WelcomeFrench c = new WelcomeFrench();
		print(a);
		print(b);
		print(c);
	}
	public static void print(WelcomeMessage msg){
		System.out.println(msg.getWelcomeMessages());
	}

}

interface WelcomeMessage{

	String getWelcomeMessages();

}

class WelcomeEnglish implements WelcomeMessage{
	public String getWelcomeMessages(){
		return "Hello, Welcome";
	}

}

class WelcomeSpanish implements WelcomeMessage{
	public String getWelcomeMessages(){
		return "Hole, Bienvenidos";
	}

}

class WelcomeFrench implements WelcomeMessage{
	public String getWelcomeMessages(){
		return "Bonjour, Beinvenue";
	}

}