package GOF.Lab3.Decorater.FileDecorater;


import java.nio.charset.StandardCharsets;


public class Utf8Decorater extends DataSourceDecorator {

    public Utf8Decorater(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        byte[] utf8Bytes = data.getBytes(StandardCharsets.UTF_8);
        super.writeData(new String(utf8Bytes, StandardCharsets.UTF_8));
    }

    @Override
    public String readData() {
       
        return new String (super.readData().getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
    }
}
