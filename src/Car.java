public class Car {
    public String type;
    public final String GPS;
    public final String tripComputer;
    public final int seats;
    public   final String engine;
    public Car(String type,int seats,String engine,String tripComputer,String GPS){
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.GPS = GPS;
    }
    public String getType(){
        return type;
    }
    public String getEngine(){
        return engine;
    }
    public String getTripComputer(){
        return tripComputer;
    }
    public String getGPS(){
        return GPS;
    }
    public int getSeats(){
        return seats;
    }
}
