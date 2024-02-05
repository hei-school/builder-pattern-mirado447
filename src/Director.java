public class Director {
    public void makeSUV(Builder builder){
        builder.reset();
        builder.setType("SUV");
        builder.setGPS(null);
        builder.setEngine(null);
        builder.setSeats(6);
        builder.setTripComputer(null);
    }

    public void makeSportCar(Builder builder){
        builder.setType("SPORT_CAR");
        builder.reset();
        builder.setGPS(null);
        builder.setEngine(null);
        builder.setSeats(2);
        builder.setTripComputer("trip computer for sport car");
    }

}
