package ru.garf.controller;


import ru.garf.model.Calc;
import ru.garf.model.Metod;
import ru.garf.view.swing.Window;

public class WindowController {

    public static void pressNumButton(int num){

        if(Calc.isMetodFlag()){
            Calc.setArg2(0);
            Calc.setInvert(false);
            Calc.setMetodFlag(false);
        }

        if(Calc.isInvert()) num*=-1;

        if(Calc.getDotValue()>0){
            Calc.setDotValue(Calc.getDotValue()*10);
            Calc.setArg2((Calc.getArg2()*Calc.getDotValue()+num)/Calc.getDotValue());
        } else {
            Calc.setArg2(Calc.getArg2()*10+num);
        }

        Window.dravLable();

    }

    public static void pressMetodButton(Metod metod){
        if(Calc.isArg1Flag()&&!Calc.isMetodFlag()){
            Calc.setArg1(Calc.getResult());
            Window.dravRuselt();
        } else if (!Calc.isMetodFlag()){
            Calc.setArg1(Calc.getArg2());
            Calc.setArg1Flag(true);
        }
        Calc.setMetodFlag(true);
        Calc.setMetod(metod);

    }

    public static void pressResultButton(){
        if(Calc.getMetod()!=null) Calc.setArg1(Calc.getResult());
        Window.dravRuselt();
        Calc.setMetodFlag(true);

    }


    public static void pressBackButton(){
        if(!Calc.isMetodFlag()) {
            if (Calc.getDotValue() >= 10) {
                Calc.setArg2(Calc.getArg2() - Calc.getArg2()*Calc.getDotValue() % 10/ Calc.getDotValue());
                Calc.setDotValue(Calc.getDotValue() / 10);
            } else{
                Calc.setArg2((Calc.getArg2() - Calc.getArg2() % 10) / 10);
            }
            if (Calc.getDotValue() == 1) Calc.setDotValue(0);
            Window.dravLable();
        }

    }
    public static void pressClearButton(){
        Calc.setArg2(0);
        Calc.setDotValue(0);
        Calc.setInvert(false);
        Window.dravLable();

    }
    public static void pressClearAllButton(){
        Calc.setMetod(null);
        Calc.setArg1Flag(false);
        Calc.setArg1(0);
        Calc.setArg2(0);
        Calc.setDotValue(0);
        Calc.setInvert(false);
        Window.dravLable();

    }
    public static void pressDotButton(){
        if (Calc.getDotValue()==0);{
            Calc.setDotValue(1);
            Window.dravLable();
        }

    }
    public static void pressInversButton(){
        Calc.setArg2(Calc.getArg2()*(-1));
        if(Calc.getArg2()<0){
            Calc.setInvert(true);
        } else{
            Calc.setInvert(false);
        }
        Window.dravLable();

    }

}
