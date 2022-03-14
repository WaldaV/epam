package epam1;

class Aquamarine extends Semiprecious{
    @Override
    public String toString() {
        return "Aquamarine{" +
                "color='" + color + '\'' +
                ", transparency=" + transparency +
                ", massa=" + massa +
                ", price=" + price +
                '}';
    }

    @Override
    public double GetPrice() {
        double priсe1=60*massa*transparency;
        return priсe1;
    }
}
