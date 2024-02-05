public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeSUV(carBuilder);

        Car car = carBuilder.getResult();

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.makeSUV(carManualBuilder);

        CarManual carManual = carManualBuilder.getResult();
        System.out.println(carManual.info());

        CarManualBuilder carManualBuilder1 = new CarManualBuilder();
        director.makeSportCar(carManualBuilder1);
        CarManual carManual1 = carManualBuilder1.getResult();
        System.out.println(carManual1.info());
    }
}