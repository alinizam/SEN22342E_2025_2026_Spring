package Week05Lab.Example03FactoryDecorator;

import java.sql.SQLOutput;

public class SportCarFactoryDecorator implements FactoryDecorator {
    FactoryDecorator f;
    public SportCarFactoryDecorator(FactoryDecorator f){
        this.f=f;
    }
    @Override
    public Car createCar(String type) {
        System.out.println("Car decorated as SportCar");
        return f.createCar(type);
    }
}
