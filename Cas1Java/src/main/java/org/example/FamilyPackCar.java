package org.example;

public class FamilyPackCar extends StandardPackCar {

    private String childSeatModel;

    private String mirrorsModel;

    public FamilyPackCar(String radioModel, String phoneSoftVersion, String childSeatModel, String mirrorsModel) {
        super(radioModel, phoneSoftVersion);
        this.childSeatModel = childSeatModel;
        this.mirrorsModel = mirrorsModel;
    }

    public FamilyPackCar(FamilyPackCar familyPackCar) {
        super(familyPackCar);
        this.childSeatModel = familyPackCar.getChildSeatModel();
        this.mirrorsModel = familyPackCar.getMirrorsModel();
    }

    public String getChildSeatModel() {
        return this.childSeatModel;
    }

    public String getMirrorsModel() {
        return this.mirrorsModel;
    }

    public void setChildSeatModel(String childSeatModel) {
        this.childSeatModel = childSeatModel;
    }

    public void setMirrorsModel(String mirrorsModel) {
        this.mirrorsModel = mirrorsModel;
    }

    @Override
    public String toString() {
        return "[FamilyPack] " + getRadioModel() + " (" + getPhoneSoftVersion() + ") " + getChildSeatModel() + " " + getMirrorsModel();
    }

    // HERE !
    // Clone
    public FamilyPackCar clone() {
        return new FamilyPackCar(this);
    }
}
