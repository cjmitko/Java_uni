public class TV extends Stock implements ElectricalAppliance{


    String manufacturer;
    String model;
    int power;

    public TV(double price, int number,String manufacturer,String model,int power) {
        super(price, number);
        this.manufacturer = manufacturer;
        this.model = model;
        this.power = power;
    }


    @Override
    public double checkPromo() {
        Double oldprice = this.getPrice();
        Double newprice = oldprice - (oldprice*0.15);
        return newprice;
    }

    @Override
    public void Energydrain() {

    }
}

