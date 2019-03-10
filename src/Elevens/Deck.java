package Elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck
{

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;
    
        public void DeckCard ()
        {
            cards =new ArrayList<Card>(52);
            for(int j=0; j < SUITS.length; j++)
            {
                for(int i = 1; i < FACES.length; i++)
                {
                    cards.add( new Card(SUITS[j],i));
                }
            }
            
        }
        public String dealCard()
        {
            String ret = cards.get(0).toString();
            cards.add(cards.get(0));
            cards.remove(0);
            return ret;
        }
}