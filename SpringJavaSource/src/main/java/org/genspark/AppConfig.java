package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration

public class AppConfig {
    @Bean("Student1")
    public Student getStudent() {
        List<Phone> l = new ArrayList<>(List.of(new Phone("1231237654")));
        Address x = new Address("Winter Springs", "Florida", "United States", "32708");
        return new Student(23,"James",l,x);
    }
    @Bean("Student2")
        public Student getStudent2(){
            List<Phone> p = new ArrayList<Phone>(List.<Phone>of(new Phone("0679842376")));
            Address a = new Address("Hell", "Michigan", "United States", "12344");
            return new Student(5, "Linda", p, a);
        }


    }

