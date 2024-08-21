package LinkedList;

public class Place {

    private String town;
    private long distance;

    public Place(){
        this.town = "Sydney";
    }
    public Place(String town, long distance){
        this.town = town;
        this.distance = distance;
    }

    public String getTown() {
        return town;
    }

    public long getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", town, distance);
    }
}
