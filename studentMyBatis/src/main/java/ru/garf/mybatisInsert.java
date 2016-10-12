package ru.garf;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class mybatisInsert {

    public static void main(String args[]) throws IOException{

        Reader reader = Resources.getResourceAsReader("cfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();


//        Student student1 = new Student("Mohammad","It", 80, 984803322, "Mohammad@gmail.com" );
//        session.insert("Student.insert", student1);

//        Student std = session.selectOne("Student.getById",1);
//
//        std.setName("GARF");
//        session.update("Student.update", std);


        List<Student> student = session.selectList("Student.getAll");

        for(Student st : student ){
            System.out.println(st);
        }








        session.commit();
        session.close();

    }
}
