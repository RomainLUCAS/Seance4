package org.example;

public class SportsPackCar extends StandardPackCar {

    private String suspensionModel;
    private String wheelsModel;

    public SportsPackCar(String radioModel, String phoneSoftVersion, String suspensionModel, String wheelsModel) {
        super(radioModel, phoneSoftVersion);
        this.suspensionModel = suspensionModel;
        this.wheelsModel = wheelsModel;
    }

    public SportsPackCar(SportsPackCar sportsPackCar) {
        super(sportsPackCar);
        this.suspensionModel = sportsPackCar.getSuspensionModel();
        this.wheelsModel = sportsPackCar.getWheelsModel();
    }

    public String getSuspensionModel() {
        return this.suspensionModel;
    }

    public String getWheelsModel() {
        return this.wheelsModel;
    }

    public void setSuspensionModel(String suspensionModel) {
        this.suspensionModel = suspensionModel;
    }

    public void setWheelsModel(String wheelsModel) {
        this.wheelsModel = wheelsModel;
    }

    @Override
    public String toString() {
        return "[SportsPack] " + getRadioModel() + " (" + getPhoneSoftVersion() + ") " + getSuspensionModel() + " " + getWheelsModel();
    }

    // HERE !
    // Clone
    public SportsPackCar clone() {
        return new SportsPackCar(this);
    }
}
