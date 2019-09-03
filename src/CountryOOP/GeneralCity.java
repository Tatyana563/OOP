package CountryOOP;

public class GeneralCity {
    int population;
    double area;

    public void havePopulation(GeneralCity generalCity) {

    }

    public void haveArea(GeneralCity generalCity) {

    }

    public GeneralCity(int population, double area) {
        this.population = population;
        this.area = area;
    }

    @Override
    public String toString() {
        return "GeneralCity{" +
                "population=" + population +
                ", area=" + area +
                '}';
    }
}

