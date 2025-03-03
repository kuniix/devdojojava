package devdojo.comportamento.test;

import devdojo.comportamento.domain.Car;
import devdojo.comportamento.interfaces.CarPredicated;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("blue", 2025),
            new Car("black", 2011),
            new Car("red", 2019),
            new Car("green", 2017),
            new Car("green", 2014));

    public static void main(String[] args) {

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> blueCars = filter(cars, car -> car.getColor().equals("blue"));

        List<Car> filterYearCars = filter(cars, car -> car.getYear() <= 2015);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(blueCars);
        System.out.println(filterYearCars);

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();

        for (T e : list) {
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
