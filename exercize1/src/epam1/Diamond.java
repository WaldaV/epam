package epam1;

class Diamond extends Precious{
    @Override
    public String toString() {
        return "Diamond{" +
                "processed=" + processed +
                ", transparency=" + transparency +
                ", massa=" + massa +
                ", price=" + price +
                '}';
    }

    @Override
    public double GetPrice() {

        double price1;
        if(processed==true){
            price1=transparency*massa*600+300;
        }
        else
            price1=transparency*massa*600;
        return price1;
    }
}
