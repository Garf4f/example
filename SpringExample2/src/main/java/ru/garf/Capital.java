package ru.garf;

public class Capital{
    private static Capital instance = null;
    public String name;
    private Capital(String capital){
        name = capital;
//        System.out.println(name);
    }

    //фабричный метод
    public static Capital getInstance(String c){
        if(instance == null)
            instance = new Capital(c);
        return instance;
    }
}
