package CountryOOP;

public class Europe {

        public static void main(String[] args) {
            Country country1 = new Country();
            country1.developEconomics(country1);// upcasting?

            country1.haveClimate(GeneralCountry.Climate.Tropical);
            country1.city1.haveArea(country1.city1);//composition???
            //ковариантность возвр. типов ст.258
            GeneralCountry g1 = new GeneralCountry();
            GeneralCity c1 = g1.findCity();
            System.out.println(c1);
            g1 = new Country();
            c1 = g1.findCity();
            System.out.println(c1);

            BuildingDelegation buildingDelegation = new BuildingDelegation();
            buildingDelegation.construction(10, 10, 10);


//
        }
    }

