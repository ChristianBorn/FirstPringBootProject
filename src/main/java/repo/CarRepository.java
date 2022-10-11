package repo;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private List<Car> carsList;

    public CarRepository() {
        this.carsList = new ArrayList<>();
    }

    public CarRepository(List<Car> initialCarList) {
        this.carsList = initialCarList;
    }

    public List<Car> getCars() {
        return carsList;
    }

    public void addCar(Car newCar) {
        carsList.add(newCar);
    }
}
