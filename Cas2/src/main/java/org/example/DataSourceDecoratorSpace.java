package org.example;

public class DataSourceDecoratorSpace extends DataSourceDecorator{
    public DataSourceDecoratorSpace(DataSource source) {
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
        data = data.replaceAll(" ", "");
        return new String(data);
    }
}
