package pl.pjatk.core;

import org.springframework.stereotype.Component;

@Component
public class MySecoundComponent {
    public MySecoundComponent(MyFirstComponent myFirstComponent){
        System.out.println("Hello form MySecoundComponent");

    }

    public void wypiszHello(){
        System.out.println("Coś fajnego");
    }
}


