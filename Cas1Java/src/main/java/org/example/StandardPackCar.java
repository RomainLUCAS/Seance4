package org.example;

public class StandardPackCar {
    private String radioModel;
    private String phoneSoftVersion;

    public StandardPackCar(String radioModel, String phoneSoftVersion) {
        this.radioModel = radioModel;
        this.phoneSoftVersion = phoneSoftVersion;
    }

    public StandardPackCar(StandardPackCar standardPackCar) {
        this.radioModel = standardPackCar.getRadioModel();
        this.phoneSoftVersion = standardPackCar.getPhoneSoftVersion();
    }

    public String getRadioModel() {
        return this.radioModel;
    }

    public String getPhoneSoftVersion() {
        return this.phoneSoftVersion;
    }

    public void setRadioModel(String radioModel) {
        this.radioModel = radioModel;
    }

    public void setPhoneSoftVersion(String phoneSoftVersion) {
        this.phoneSoftVersion = phoneSoftVersion;
    }

    @Override
    public String toString() {
        return "[StandardPack] " + getRadioModel() + " (" + getPhoneSoftVersion() + ')';
    }

    // HERE !
    // Clone
    public StandardPackCar clone() {
        return new StandardPackCar(this);
    }
}
