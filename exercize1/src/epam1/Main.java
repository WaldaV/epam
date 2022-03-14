package epam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int allPrice = 0, allMass = 0;
        List<Stone> stones = new ArrayList<>();

        Diamond diamond = new Diamond();
        diamond.massa = 1;
        diamond.transparency = 0.6;
        diamond.processed = true;
        diamond.price = diamond.GetPrice();
        stones.add(diamond);

        Amethyst amethyst = new Amethyst();
        amethyst.massa = 3;
        amethyst.transparency = 0.8;
        amethyst.price = amethyst.GetPrice();
        amethyst.color = "red";
        stones.add(amethyst);

        System.out.println(stones);
        Comp PriceComparator = new Comp();
        stones.sort(PriceComparator);
        System.out.println("Sorted stones by price:");
        for (Stone x : stones) {
            allPrice += x.price;
            allMass += x.massa;
            System.out.println(x);
        }
        System.out.println("Whole mass = " + allMass);
        System.out.println("Whole price = " + allPrice);

        System.out.println("Enter min transparency");
        double min = scanner.nextDouble();
        System.out.println("Enter max transparency");
        double max = scanner.nextDouble();
        for (Stone x : stones) {
            if(x.transparency>=min & x.transparency<=max)
                System.out.println(x);
        }
    }
    }

