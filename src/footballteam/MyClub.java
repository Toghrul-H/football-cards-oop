package footballteam;

import java.util.*;
public class MyClub {
    private ArrayList<Card> cards;
    
    public MyClub() {
        cards = new ArrayList<>();
    }

    
    public void addCard(Card card){
        cards.add(card);
    }
    
    public double averageRating(){
        if (cards.size() == 0){
            return 0;
        }
       int s = 0;
       int c = 0;
       for (Card card: cards){
           s = card.rating() + s;
           c++; 
       }
       return s / c;
    }
    
    public int englishPlayerCount(){
        int count = 0;
        for (Card card: cards){
            if (card.getPlayer().getNationality() == Nation.ENGLAND){
                count++;
            }
        }
        return count;
    }
    public String[] allEnglishPlayers(){
        List<String> names = new ArrayList<>();
        for (Card card: cards){
            if (card.getPlayer().getNationality() == Nation.ENGLAND){
                names.add(card.getPlayer().getName());
            }
        }
        String[] result = new String[names.size()];
        for (int i = 0; i < names.size(); i++) {
            result[i] = names.get(i);
        }
        return result;
    }
    
    public String bestSpanishPlayer() {
        int maxRating = -1;
        String bestName = "";

        for (Card c : cards) {
            if (c.getPlayer().getNationality() == Nation.SPAIN && c.rating() > maxRating) {
                maxRating = c.rating();
                bestName = c.getPlayer().getName();
            }
        }

        if (bestName.isEmpty()) {
            return null;
        } else {
            return bestName;
        }
    }
    
    public boolean expensivePlayer(){
        boolean found = false;
        for (Card c : cards) {
            if (c.cost() > 1000000){
                found = true;
            }        
        }
        return found;
    }
    
     public Card mostExpensiveSpecialCard() {
        Card mostExpensive = null;
        int maxCost = -1;

        for (Card c : cards) {
            if (!(c.type() instanceof None)) {
                if (c.cost() > maxCost) {
                    maxCost = c.cost();
                    mostExpensive = c;
                }
            }
        }
        return mostExpensive;
    }
}
    
