package ru.garf.controller;


import ru.garf.model.Calc;
import ru.garf.model.Metod;
import ru.garf.view.swing.Window;

public class Listeners {

    public static void nums(int num, Window window){

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

        window.lable.setText(Float.toString(Calc.getArg2()));

        System.out.println("Arg1 = " + Calc.getArg1());
        System.out.println("Arg2 = " + Calc.getArg2());

    }


    public static void btnMetod(Metod metod,Window window){

        if(     metod.equals(Metod.sum) ||
                metod.equals(Metod.unsum) ||
                metod.equals(Metod.mult) ||
                metod.equals(Metod.dev)
        ){

            if(Calc.isArg1Flag()&&!Calc.isMetodFlag()){
                Calc.setArg1(Calc.getResult());
                window.lable.setText(Float.toString(Calc.getArg1()));
            } else if (!Calc.isMetodFlag()){
                Calc.setArg1(Calc.getArg2());
                Calc.setArg1Flag(true);
            }

            Calc.setMetodFlag(true);
            Calc.setMetod(metod);

        }

        switch (metod) {

            case result:

                if(Calc.getMetod()!=null) Calc.setArg1(Calc.getResult());
                window.lable.setText(Float.toString(Calc.getArg1()));

//                System.out.println("Arg1 = " + Calc.getArg1());
//                System.out.println("Arg2 = " + Calc.getArg2());
                Calc.setMetodFlag(true);

                break;

            case back:
                if(!Calc.isMetodFlag()) {
                    if (Calc.getDotValue() >= 10) {
                        Calc.setArg2(Calc.getArg2() - Calc.getArg2()*Calc.getDotValue() % 10/ Calc.getDotValue());
                        Calc.setDotValue(Calc.getDotValue() / 10);
                        System.out.println(Calc.getDotValue() == 1);
                    } else{
                        Calc.setArg2((Calc.getArg2() - Calc.getArg2() % 10) / 10);
                    }

                    if (Calc.getDotValue() == 1) Calc.setDotValue(0);

                    window.lable.setText(Float.toString(Calc.getArg2()));

                }

                break;

            case clear:

                window.lable.setText("0.0");
                Calc.setArg2(0);
                Calc.setDotValue(0);
                Calc.setInvert(false);

                break;

            case clearAll:

                window.lable.setText("0.0");
                Calc.setMetod(null);
                Calc.setArg1Flag(false);
                Calc.setArg1(0);
                Calc.setArg2(0);
                Calc.setDotValue(0);
                Calc.setInvert(false);

                break;

            case dot:

                if (!window.lable.getText().contains(".")) window.lable.setText(window.lable.getText() + ".");
                Calc.setDotValue(1);

                break;

            case invert:
                Calc.setArg2(Calc.getArg2()*(-1));
                if(Calc.getArg2()<0){
                    Calc.setInvert(true);
                } else{
                    Calc.setInvert(false);
                }
                window.lable.setText(Float.toString(Calc.getArg2()));

                break;

        }
    }

}
