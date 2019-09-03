package CountryOOP;

public class BuildingDelegation {

        BuildingCreation buildingCreation = new BuildingCreation();

        public void construction(int h, int w, int l) {
            buildingCreation.hightCreation(h);
            buildingCreation.lengthCreation(l);
            buildingCreation.widthCreation(w);
            int volume = h * w * l;
            System.out.println("Volume" + volume);
        }
    }

