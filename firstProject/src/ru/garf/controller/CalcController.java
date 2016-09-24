package ru.garf.controller;

import ru.garf.model.Metod;

public class CalcController {

    public static float getSum(float arg1, float arg2){
        return arg1+arg2;
    }

    public static float getMult(float arg1, float arg2){
        return arg1*arg2;
    }

    public static float getDev(float arg1, float arg2){
        return arg1/arg2;
    }

    public static float doCalc(float arg1, float arg2, Metod metod){
        float result=0;
        switch (metod) {

            case sum:
                result=getSum(arg1,arg2);

                break;

            case unsum:
                result=getSum(arg1,(-1)*arg2);

                break;

            case mult:
                result=getMult(arg1,arg2);

                break;

            case dev:
                result=getDev(arg1,arg2);

                break;

        }

        return result;
    }

}
