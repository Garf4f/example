package ru.garf.controller;


import ru.garf.model.Calc;
import ru.garf.view.swing.Window;

public class WindowController {

    public static void addNum(int num, Window window){
        if(Calc.isInvert()) num*=-1;

        if(Calc.getDotValue()>0){
            Calc.setDotValue(Calc.getDotValue()*10);
            Calc.setArg2((Calc.getArg2()*Calc.getDotValue()+num)/Calc.getDotValue());
        } else {
            Calc.setArg2(Calc.getArg2()*10+num);
        }

        window.lable.setText(Float.toString(Calc.getArg2()));

//        System.out.println("Arg1 = " + Calc.getArg1());
//        System.out.println("Arg2 = " + Calc.getArg2());
    }



}
