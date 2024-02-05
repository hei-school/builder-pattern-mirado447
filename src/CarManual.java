public class CarManual {
    public final String type;
    public final String GPS;
    public final String tripComputer;
    public final int seats;
    public final String engine;

    public CarManual(String type, int seats,String engine,String tripComputer,String GPS){
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.GPS = GPS;
    }
    public String info(){
        return "MANUAL INFO : \n Car type : " + type + " \n Number of seats : " + seats + "\n Engine info : " + engine + " \n TripComputer info : " + tripComputer + " \n GPS info : "+ GPS ;
    }
}
