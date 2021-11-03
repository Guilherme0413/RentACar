package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Danrlei
 */
public class BookingSystem implements BookingSystemInterface {

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {

        RentACarInterface cars = new RentACar();

        in.readLine();

        String textFile = in.readLine();

        String[] data;

        while (textFile != null) {

            data = textFile.split(":"); //split String between ":" to separate data

            Car vehicles = new Car(data[0], Integer.parseInt(data[1])); //create a car object and store data

            cars.getCars();

            textFile = in.readLine();
        }

        in.close();

        return cars;

    }
}
