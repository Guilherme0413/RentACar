package ooc.yoursolution;

import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author Danrlei
 */
public class Car implements CarInterface {

    //Attributes
    public String carMake;
    public double dailyRate;
    public int id;
    public Map calendar;

    //Constructor
    public Car(String carMake, int dailyRate) {
        this.carMake = carMake;
        this.dailyRate = dailyRate;
    }

    @Override
    public Map<Month, boolean[]> createAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Make getMake() {
        return Make.valueOf(carMake);
    }

    @Override
    public void setMake(Make make) {
        this.carMake = make.toString();
    }

    @Override
    public double getRate() {
        return dailyRate;
    }

    @Override
    public void setRate(double rate) {
        this.dailyRate = rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
