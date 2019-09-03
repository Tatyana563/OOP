package CountryOOP;

public class GeneralCountry {
    protected void haveClimate(Climate c) {
        System.out.println("The country has a" + " " + c + " " + "climate");
    }

    protected void developEconomics(GeneralCountry generalCountry) {
        System.out.println("Some branches are developed in" + " " + generalCountry);
    }

    public enum Climate {
        Tropical, Temperate, Dry, Continental, Polar;
    }

    public GeneralCity findCity() {
        return new GeneralCity(200, 200);
    }

    @Override
    public String toString() {
        return "GeneralCountry{}";
    }
}

