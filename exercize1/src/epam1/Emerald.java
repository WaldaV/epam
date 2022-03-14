package epam1;

class Emerald extends Precious{
    @Override
    public String toString() {
        return "Emerald{" +
                "processed=" + processed +
                ", transparency=" + transparency +
                ", massa=" + massa +
                ", price=" + price +
                '}';
    }

    @Override
    public double GetPrice() {
        double priсe1;
        if(processed==true){
            priсe1=20000*transparency*massa+300;
        }
        else
            priсe1=20000*transparency*massa;
        return priсe1;
    }
}
