public class CarManualBuilder implements Builder {
    public String type;
    public int seats;
    public String engine;
    public String tripComputer;
    public String gps;
    @Override
    public void reset() {
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setSeats(int number) {
        this.seats = number;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(String tripComputer) {
         this.tripComputer = tripComputer;
    }

    @Override
    public void setGPS(String gps) {
        this.gps = gps;
    }

    public CarManual getResult(){
        return new CarManual(type,seats,engine,tripComputer,gps);
    }
}
