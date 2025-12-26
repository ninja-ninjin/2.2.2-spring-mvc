package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList = List.of(new Car("Porsche", "911", 1980),
            new Car("Volkswagen", "Beetle", 1987),
            new Car("Dodge", "Charger", 1970),
            new Car("Mitsubishi", "Eclipse", 2006),
            new Car("Porsche", "911 GTS", 2025));

    @Override
    public List<Car> getCarList(int count) {
        return carList.subList(0, count);
    }
}
