package CountryOOP;

public class City extends GeneralCity {


        @Override
        public void havePopulation(GeneralCity generalCity) {
            super.havePopulation(generalCity);
            System.out.println("Population: " + generalCity.population);
        }

        @Override
        public void haveArea(GeneralCity generalCity) {
            super.haveArea(generalCity);
            System.out.println("Area: " + generalCity.area);
        }

        public City(int population, double area) {
            super(population, area);
        }

        @Override
        public String toString() {
            return "City1{" +
                    "population=" + population +
                    ", area=" + area +
                    '}';
        }
    }

