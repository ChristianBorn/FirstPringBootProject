package service;

import model.Car;
import repo.CarRepository;

import java.util.List;

public class CarService {
    private CarRepository carPool;

    public CarService() {
        this.carPool = new CarRepository();
    }

    public CarService(CarRepository initialCarPool) {
        this.carPool = initialCarPool;
    }

    public void addCar(Car car) {
        carPool.addCar(car);
    }

    public List<Car> getCars() {
        return carPool.getCars();
    }
}
