package devdojo.comportamento.test;

import devdojo.comportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("blue", 2025),
            new Car("black", 2011),
            new Car("red", 2019),
            new Car("green", 2017),
            new Car("green", 2014));

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println(filterCarByYear(cars, 2017));
    }

//    private static List<Car> filterGreenCar(List<Car> cars) {
//        List<Car> greenCars = new ArrayList<>();
//
//        for (Car car : cars) {
//            if (car.getColor().equals("green")){
//                greenCars.add(car);
//            }
//        }
//
//        return greenCars;
//    }

    private static List<Car> filterCarByColor (List<Car> cars, String color){
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals(color)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterCarByYear(List<Car> cars, int year){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() <= year){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
