package GOF.Lab3.Decorater.FileDecorater;

public interface DataSource {
    void writeData(String data);

    String readData();
}