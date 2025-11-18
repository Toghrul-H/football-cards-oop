package footballteam;

public class FootballMain {

    public static void main(String[] args) {
        MyClub myClub = new MyClub();
        
        Player player1 = new Player("Lopez", Nation.ENGLAND);
        Player player2 = new Player("Jafar", Nation.BRASIL);
        Player player3 = new Player("John", Nation.SPAIN);
        Player player4 = new Player("Bailey", Nation.ENGLAND);
        
        Card card1 = new Midfielder(800000, 70, 85, 60, player1, new POTY());
        Card card2 = new Defender(1200000, 90, 60, 50, player2, new POTW());
        Card card3 = new Attacker(2000000, 50, 40, 95, player3, new None());
        Card card4 = new Attacker(950000, 40, 45, 88, player4, new POTY());
        
        myClub.addCard(card1);
        myClub.addCard(card2);
        myClub.addCard(card3);
        myClub.addCard(card4);
        
        
        System.out.println("Average rating: " + myClub.averageRating());
        System.out.println("How many English players: " + myClub.englishPlayerCount());
        System.out.println("Is there expensive player than 1000000: " + myClub.expensivePlayer());
        System.out.println("Best spanish player: " + myClub.bestSpanishPlayer());
        
        String[] englishPlayers = myClub.allEnglishPlayers();
        System.out.println("All English Players:");
        for (String name : englishPlayers) {
            System.out.println("- " + name);
        }
        
        Card mostExpensiveSpecial = myClub.mostExpensiveSpecialCard();
            if (mostExpensiveSpecial != null) {
                System.out.println("Most expensive special card: " +
                    mostExpensiveSpecial.getPlayer().getName());
            } else {
                System.out.println("No special cards found.");
            }
        }
}
    

