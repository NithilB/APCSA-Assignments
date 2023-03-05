 //Programmers : Neil Ghugare & Nithil Balaji
 import java.util.*;

 public class Poker{

  private static String handType = "";
         public static void main(String [] args){
/*
             Scanner keyboard = new Scanner(System.in);
             int money = 20;
             while (money > 0){
                 money--;
                 ArrayList<Card> deck = Deck.getDeck();
                 shuffle(deck);
                 ArrayList<Card> hand = dealHand(deck, 5);
                 printCards(hand);
                 System.out.println("Which Cards Do You Want To Remove? (0-4, -1 For Done)");
                 int ans = 1;
                 while (ans != -1){
                     ans = keyboard.nextInt();
                     if (ans == -1){
                         continue;
                     }
                     hand.set(ans,deck.remove(0));
                 }
                 printCards(hand);
                 int earned = scoreHand(toID(hand));
                 System.out.println("Hand Type : " + handType);
                 System.out.println("Money Earned : $" + earned);
                 money += earned;
             }
*/
           ArrayList<Card> temp = new ArrayList<Card>();
           temp.add(new Card("bleh","bleh",0));
           temp.add(new Card("bleh","bleh",13));
           temp.add(new Card("bleh","bleh",26));
           temp.add(new Card("bleh","bleh",2));
           temp.add(new Card("bleh","bleh",15));
           System.out.println(isFullHouse(toID(temp)));

           ArrayList<Card> tem = new ArrayList<Card>();
           tem.add(new Card("bleh","bleh",0));
           tem.add(new Card("bleh","bleh",13));
           tem.add(new Card("bleh","bleh",26));
           tem.add(new Card("bleh","bleh",2));
           tem.add(new Card("bleh","bleh",15));
           System.out.println(isFourOfAKind(toID(tem)));

         }
         public static void shuffle(ArrayList<Card> deck){
             int rand = 0;
             Card temp = null;
             for (int num = deck.size() - 1; num > 0; num--){
                 rand = (int)(Math.random() * 52);
                 temp = deck.get(rand);
                 deck.set(rand, deck.get(num));
                 deck.set(num, temp);
             }
         }
         private static ArrayList<Card> dealHand(ArrayList<Card> deck, int n){
             ArrayList<Card> dealed = new ArrayList<Card>(n);
             for (int a = 0; a < n; a++){
                 dealed.add(deck.remove(a));
             }
             return dealed;
         }
         private static void printCards(ArrayList<Card> h){
             for (int i = 0; i < h.size(); i++)
             System.out.println("Card " + i + ": " + h.get(i));
         }
         private static ArrayList<Integer> toID(ArrayList<Card> hand){
             ArrayList<Integer> to = new ArrayList<Integer>();
             for (Card card : hand){
                 to.add(card.getID());
             }
             return to;
         }
         private static void reduceID(ArrayList<Integer> id){
             int temp = 0;
             for (int a = 0; a < id.size(); a++){
                 temp = id.get(a);
                 while (temp > 12){
                     temp -= 13;
                 }
                 id.set(a,temp);
             }
         }
         private static ArrayList<Integer> sort(ArrayList<Integer> id){
             ArrayList<Integer> sorted = new ArrayList<Integer>();
             int min = (int)id.get(0);
             for (int val : id){
                 if (val < min){
                     min = val;
                 }
             }
             for (int a = min; a < 52; a++){
                 for (int b = 0; b < id.size(); b++){
                     if ((int)id.get(b) == a){
                         sorted.add(id.get(b));
                     }
                 }
             }
             return sorted;
         }
         private static boolean isRoyalFlush(ArrayList<Integer> id){ //works
         	id = sort(id);
			int count = 0;
			for(int v = 0; v < id.size() - 1; v++){
				if(id.get(0) == 8 || id.get(0) == 21 || id.get(0) == 34 || id.get(0) == 47){
					if(id.get(v+1)== id.get(v) + 1){
					count++;
					}
				}
			}
            if (count == 4){
                return true;
            } else {
                return false;
            }

         }

         private static boolean isStraightFlush(ArrayList<Integer> id){ //works
             id = sort(id);
             for (int a = 1; a < id.size(); a++){
                 if (id.get(a)-1 != id.get(a-1)){
                     return false;
                 }
             }
             return true;
         }
         private static boolean isFourOfAKind(ArrayList<Integer> id){ //works
             id = sort(id);
             reduceID(id);
             int cnt = 0;
             for(int r = 0; r < id.size(); r++){
                 for(int c = r + 1; c < id.size() - 1; c++){
                 	if (id.get(r) == id.get(c)){
                    	cnt++;
                 	}
			 	 }
             }
             if (cnt == 3){
                 return true;
             } else {
                 return false;
             }
         }
         private static boolean isFullHouse(ArrayList<Integer> id){ //works
             if (isPair(id) == false){
                 return false;
             } else {
                 id = sort(id);
                 reduceID(id);
                 int cnt = 0;
                 for (int a = 1; a < id.size(); a++){
                     if (id.get(a) == id.get(a-1)){
                         cnt++;
                     }
                 }
                 if (cnt >= 3){
                     return true;
                 } else {
                     return false;
                 }
             }
         }
         private static boolean isFlush(ArrayList<Integer> id){ //works
             int min = id.get(0);
             for (int val : id){
                 if (val < min){
                     min = val;
                 }
             }
             int rangeChecker = 0;
             if (min < 13){
                 rangeChecker = 0;
             } else if (min < 26){
                 rangeChecker = 13;
             } else if (min < 39){
                 rangeChecker = 26;
             } else {
                 rangeChecker = 39;
             }
             for (int a = 0; a < id.size(); a++){
                 if (id.get(a) < rangeChecker || id.get(a) > rangeChecker + 12){
                     return false;
                 }
             }
             return true;
         }
         private static boolean isStraight(ArrayList<Integer> id){ //works
             id = sort(id);
             reduceID(id);
             int cnt = 0;
             //System.out.println(id.size());
             for (int a = 0; a < id.size() - 1; a++){
                 if (id.get(a+1)== id.get(a) + 1){
			//		 System.out.println(id.get(a));
                     cnt++;
                 }
             }
             //System.out.println(cnt);
             if (cnt == 4){
                 return true;
             } else {
                 return false;
             }
         }
         private static boolean isThreeOfAKind(ArrayList<Integer> id){ //works
             reduceID(id);
             id = sort(id);
             for (int a = 2; a < id.size(); a++){
                 if (id.get(a) == id.get(a-1) && id.get(a-1) == id.get(a-2)){
                     return true;
                 }
             }
             return false;
         }
         private static boolean isTwoPairs(ArrayList<Integer> id){ //works
			reduceID(id);
			id = sort(id);
			int cnt = 0;
			for(int r = 1; r < id.size(); r++){
				if(id.get(r) == id.get(r-1)){
					cnt++;
				}
			}

			if(cnt == 2){
				return true;
			} else {
				return false;
			}

         }
         private static boolean isPair(ArrayList<Integer> id){ //works
            reduceID(id);
            id = sort(id);
            for (int a = 1; a < id.size(); a++){
                if (id.get(a) == id.get(a-1)){
                    return true;
                }
            }
            return false;

         }
         private static int scoreHand(ArrayList<Integer> id){
            ArrayList<Boolean> check = new ArrayList<Boolean>(10);
            check.add(isPair(id)); check.add(isTwoPairs(id));
            check.add(isThreeOfAKind(id)); check.add(isStraight(id));
            check.add(isFlush(id)); check.add(isFullHouse(id));
            check.add(isFourOfAKind(id));
            check.add(isStraightFlush(id)); check.add(isRoyalFlush(id));
            int[] scores = {0,1,2,3,4,5,6,25,50,250};
            String[] types = {"None","Pair","Two Pairs", "Three-Of-A-Kind", "Straight", "Flush", "Full House", "Four-Of-A-Kind", "Straight Flush", "Royal Flush"};
            int hold = -1;
            for (int a = 0; a < check.size(); a++){
                if (check.get(a) == true){
                    hold = a;
                }
            }
            handType = types[hold+1];
            return scores[hold+1];
        }

 }



 class Deck{


  public static ArrayList<Card> getDeck(){
   ArrayList<Card> deck = new ArrayList<Card>(52);

   String[] suits = {"Spades","Clubs","Hearts","Diamonds"};
   String[] ranks = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};

   for (int i = 0; i < suits.length; i++){
    for (int j = 0; j < ranks.length; j++){
     deck.add(new Card(suits[i],ranks[j],i*ranks.length+j));
    }
   }

   return deck;
  }
 }

 class Card{
  private String suit, rank;
  private int id;

  public Card(String s, String r, int i){
   suit = s;
   rank = r;
   id = i;
  }
  public int getID(){
   return id;
  }

  public String toString(){
   return rank + " of " + suit;
  }
 }


