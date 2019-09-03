package CountryOOP;

public class Country extends GeneralCountry {
        City city1 = new City(100, 50);

        @Override
        protected void haveClimate(Climate c) {
            super.haveClimate(c);
            System.out.println("It is warm and sunny");
        }

        @Override
        protected void developEconomics(GeneralCountry generalCountry) {
            super.developEconomics(generalCountry);
            System.out.println("Agriculture is developed");
        }

        @Override
        public String toString() {
            return "Country1{}";
        }

        public City findCity() {
            return new City(300, 300);
        }

    }
}
