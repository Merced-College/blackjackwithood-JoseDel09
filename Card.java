public class Card {

    //  Felix oliveira-Machado
    //data variables
    //fields from the file heart,ace,11,ah.gif
    private String suit;
    private int value;
    private String rank;
    private String picName;
    //put other 3 data variables here as private

    //constructor
    public Card() {
        suit = "heart";
        value = 10;
        rank ="king";
        picName = "nopic.gif";
    }


    public Card (String suit, String rank, int value, String picName){
        this.suit = suit;
        this.value = value;
        this.rank = rank;
        this.picName = picName;
    }

    //setters
    public void setSuit(String suit){
        this.suit = suit;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public void setpicName(String picName){
        this.picName = picName;
    }

    //getters...........................
    public String getSuit(){ 
        return suit;
    }

    public int getValue(){
        return value;
    }

    public String getpicName(){
        return picName;
    }
    public void getRank(){
        this.rank = rank;
    }

    //Equals method.................
    public boolean equals(Card other) {
        return rank.equals(other.rank);
    }
    //too string method
    public String toString(){
        return "suit" + suit + " value" + value;
    }
    







    
}