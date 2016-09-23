package ru.garf.model;


import ru.garf.controller.CalcController;
import ru.garf.view.swing.Window;

public class Calc {

    private static float arg1=0;
    private static boolean arg1Flag;
    private static float arg2=0;
    private static Metod metod;
    private static boolean metodFlag;
    public static int dotValue=0;
    public static boolean invert;


    public static float getArg1() {
        return arg1;
    }

    public static void setArg1(float arg1) {
        Calc.arg1 = arg1;
    }

    public static float getArg2() {
        return arg2;
    }

    public static void setArg2(float arg2) {
        Calc.arg2 = arg2;
    }

    public static Metod getMetod() {
        return metod;
    }

    public static void setMetod(Metod metod) {
        Calc.metod = metod;
    }

    public static boolean isMetodFlag() {
        return metodFlag;
    }

    public static void setMetodFlag(boolean metodFlag) {
        Calc.metodFlag = metodFlag;
    }

    public static float getResult(){
        return CalcController.doCalc(arg1,arg2,metod);
    }

    public static int getDotValue() {
        return dotValue;
    }

    public static void setDotValue(int dotValue) {
        Calc.dotValue = dotValue;
    }

    public static boolean isArg1Flag() {
        return arg1Flag;
    }

    public static void setArg1Flag(boolean arg1Flag) {
        Calc.arg1Flag = arg1Flag;
    }

    public static boolean isInvert() {
        return invert;
    }

    public static void setInvert(boolean invert) {
        Calc.invert = invert;
    }

    public Calc(){
        new Window();


    }

}
