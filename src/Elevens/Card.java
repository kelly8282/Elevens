package Elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
        private int card;
        private String suit;
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	public Card( String s, int i)
  	{
  		s = suit;
                i = card;
  	}
        
        public void setCard(int i)
        {
            card = i;
        }
        
        public void setSuit(String s)
        {
            suit = s;
        }
        
        public String getSuit()
        {
            return suit;
        }
        
        public int getCard()
        {
            return card;
        }
        
        public String toString()
        {
            return FACES[card] + "of" + suit; 
        }
        
        
       
//instance variables
		//String suit
		//int face

  	//constructors


	// modifiers
		//set methods


  	//accessors
		//get methods


  	//toString

 }