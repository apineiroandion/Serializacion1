public class Serializacion1 {
    public static void main(String[] args) {
        //Creamos un objeto de la clase Mclase
        Mclase m1 = new Mclase("Objeto 1", 1, 1.1);
        //Serializamos el objeto
        m1.serializar();
        //Instanciamos un nuevo objeto de la clase Mclase
        Mclase m2 = new Mclase();
        //Damos a los atributos de m2 los valores del objeto serializado
        m2.deserializar();
    }
}
