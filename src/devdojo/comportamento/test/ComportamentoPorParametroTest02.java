package devdojo.comportamento.test;

import devdojo.comportamento.domain.Car;
import devdojo.comportamento.interfaces.CarPredicated;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("blue", 2025),
            new Car("black", 2011),
            new Car("red", 2019),
            new Car("green", 2017),
            new Car("green", 2014));

    public static void main(String[] args) {
//        List<Car> filterRedCars = filter(cars, new CarPredicated() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("red");
//            }
//        });

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> blueCars = filter(cars, car -> car.getColor().equals("blue"));

        List<Car> filterYearCars = filter(cars, car -> car.getYear() <= 2015);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(blueCars);
        System.out.println(filterYearCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicated carPredicated){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicated.test(car)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }


}
