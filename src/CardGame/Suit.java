package CardGame;

public enum Suit {
    SPADE, DIAMOND, HEART, CLUB;
@Override
    public String toString(){
    return switch(this){
        case CLUB -> "Club";
        case HEART -> "Heart";
        case SPADE -> "Spade";
        case DIAMOND -> "Diamond";
};
}


        }