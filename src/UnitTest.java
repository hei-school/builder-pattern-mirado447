import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnitTest {
    @Test
    public void car_type(){
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeSUV(carBuilder);
        Car carSUV = carBuilder.getResult();

        director.makeSportCar(carBuilder);
        Car carSport = carBuilder.getResult();

        String carTypeSUV = "SUV";
        String carTypeSportCar = "SPORT_CAR";

        assertEquals(carTypeSUV,carSUV.getType());
        assertEquals(carTypeSportCar,carSport.getType());
    }
    @Test
    public void car_manual(){
        Director director = new Director();
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.makeSUV(carManualBuilder);

        CarManual carManual = carManualBuilder.getResult();
        String info = carManual.info();
        System.out.println(info);
        assertTrue(info.contains("MANUAL INFO : \n Car type : SUV "));
    }
}
