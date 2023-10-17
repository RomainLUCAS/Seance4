package org.example;

public class DataSourceDecoratorSemiColon extends DataSourceDecorator{
    public DataSourceDecoratorSemiColon(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(adaptedTreatment(data));
    }

    @Override
    public String readData() {
        return adaptedTreatment(super.readData());
    }

    private String adaptedTreatment(String data) {
        data = data.replaceAll(";", "");
        return data;
    }
}
