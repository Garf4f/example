package ru.garf.view.console;

import ru.garf.model.Calc;
import ru.garf.model.Metod;

import java.util.Scanner;

/**
 * Created by ACER on 23.09.2016.
 */
public class ConsoleView {
    int metod;
    public ConsoleView(){
        Scanner IN = new Scanner(System.in);

        System.out.println("Введите первый агрумент:");
        try {
            Calc.setArg1(IN.nextFloat());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Введите второй агрумент:");
        try {
            Calc.setArg2(IN.nextFloat());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Выберите арифметическое действие:");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение");
        System.out.println("4 - деление");

        try {
            metod=IN.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        switch (metod){
            case 1:
                Calc.setMetod(Metod.sum);
                break;
            case 2:
                Calc.setMetod(Metod.unsum);;
                break;
            case 3:
                Calc.setMetod(Metod.mult);;
                break;
            case 4:
                Calc.setMetod(Metod.dev);;
                break;
            default:
                System.out.println("Вы ввели чушь!");
        }

        System.out.println(Calc.getResult());

    }

}
