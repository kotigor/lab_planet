import ru.planet.Planet;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите название планеты земной группы(на английском языке), чтобы получить ее краткое описание. " +
                "Доступные планеты: ");
        for (Planet planet:
             Planet.values()) {
            System.out.println(planet.name());
        }
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(Planet.valueOf(scanner.next().toUpperCase(Locale.ROOT)).getDescription());
        }
        catch (IllegalArgumentException e){
            System.out.println("Такой планеты нет!");
        }
    }
}
