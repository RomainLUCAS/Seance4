package org.example;

public class DataSourceDecoratorDot extends DataSourceDecorator{
    public DataSourceDecoratorDot(DataSource source) {
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
        data = data.replace(".", "\n");
        return new String(data);
    }

}
