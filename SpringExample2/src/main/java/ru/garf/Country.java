package ru.garf;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Country {
    private Capital capital;

//    public Country(){
//        capital = new Capital();
//    }

    public void setCapital(Capital c){
        capital = c;
    }

    public Capital getCapital(){
        return capital;
    }

    public static void main(String []args){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
        Country Russia = (Country) ac.getBean("country");

        System.out.println(Russia.getCapital().name);
    }
}

