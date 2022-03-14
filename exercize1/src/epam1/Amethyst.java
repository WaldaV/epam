package epam1;

class Amethyst extends Semiprecious {
    @Override
    public String toString() {
        return "Amethyst{" +
                "color='" + color + '\'' +
                ", transparency=" + transparency +
                ", massa=" + massa +
                ", price=" + price +
                '}';
    }
    @Override
    public double GetPrice() {
        double priсe1=50*massa*transparency;
        return priсe1;
    }
}
