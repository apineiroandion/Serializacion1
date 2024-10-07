import java.io.*;

public class Mclase implements Serializable {
    private String nombre;
    private Integer numero1;
    private Double numero2;

    public Mclase() {
    }

    public Mclase(String nombre, Integer numero1, Double numero2) {
        this.nombre = nombre;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void serializar() {
        try {
            FileOutputStream fos = new FileOutputStream("serial.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserializar() {
        try {
            FileInputStream fis = new FileInputStream("serial.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Mclase m = (Mclase) ois.readObject();
            System.out.println(m.nombre);
            System.out.println(m.numero1);
            System.out.println(m.numero2);
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
