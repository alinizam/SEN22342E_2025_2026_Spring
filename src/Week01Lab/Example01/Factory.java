package Week01Lab.Example01;

public class Factory {
    Car[] cars=new Car[3];
    int getTotalPrice(){
        int sum=0;
        for (Car c:cars) {
            sum+=c.getPrice();
        }
        return sum;
    }

    int getAdditionalPriceofSportCar(){
        int sum=0;
        for (Car c:cars) {
            if (c instanceof SportCar)
                sum+=((SportCar)c).additionalEquipmentPrice();
        }
        return sum;

    }
}
