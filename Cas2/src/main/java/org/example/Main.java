package org.example;

public class Main {
    public static void main(String[] args) {
        String text = "hello.ceci. est. un. ;message;.avec. une. ponctuation. spécia le";

        System.out.println("- Input ----------------");
        System.out.println(text);
        System.out.println("- Post Treatment --------------");
        FileDataSource fd = new FileDataSource("D:\\Ecole\\MASI\\1\\Génie Logiciel\\Séance 4\\cas_2\\src\\main\\resources\\deco.txt");
        DataSourceDecorator dsd = new DataSourceDecoratorSpace(
                                    new DataSourceDecoratorSemiColon(
                                            new DataSourceDecoratorDot(fd)));
        System.out.println(dsd.readData());

        dsd.writeData(fd.readData());
    }
}