package ru.garf.controller;



import ru.garf.model.Calc;
import ru.garf.model.Metod;


public class WindowListeners {

    public static void nums(int num){

        WindowController.pressNumButton(num);

    }


    public static void btnMetod(Metod metod){

        if(     metod.equals(Metod.sum) ||
                metod.equals(Metod.unsum) ||
                metod.equals(Metod.mult) ||
                metod.equals(Metod.dev)
        ){

            WindowController.pressMetodButton(metod);

        }

        switch (metod) {
            case result:
                WindowController.pressResultButton();
                break;

            case back:
                WindowController.pressBackButton();
                break;

            case clear:
                WindowController.pressClearButton();
                break;

            case clearAll:
                WindowController.pressClearAllButton();
                break;

            case dot:
                WindowController.pressDotButton();
                break;

            case invert:
                WindowController.pressInversButton();
                break;

        }


    }


}
