package pl.pjatk.core;

        import org.springframework.stereotype.Component;

@Component
public class MyTrzeciComponent {
    public MyTrzeciComponent(MySecoundComponent mySecoundComponent, MyFirstComponent myFirstComponent) {
        System.out.println("Hello form MyTrzeciComponent");
        myFirstComponent.printHelloFromMethod();
        mySecoundComponent.wypiszHello();
    }


}
