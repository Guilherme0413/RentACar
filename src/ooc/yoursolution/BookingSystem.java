/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

        String content = in.readLine();
        String data[];
        String carData;

        RentACarInterface cars = new RentACar();

        while (content != null) {
            carData = in.readLine();
            data = carData.split(":");

            Car vehicles = new Car(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            
            System.out.println(vehicles.toString());
            content = in.readLine();
        }

        in.close();

        return cars;

    }
}
