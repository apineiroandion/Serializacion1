# Serializacion1

Crear unha clase chamada mclase que implemente a interfaz serializable  (implements Serializable). Dita clase debe ter tres atributos  :
unha variable String  (nome)  outra int (numero1) e outra double (numero2)

Dende  a  clase principal (a do proxecto) instanciar un obxecto da clase mclase
con tres valores:  "ola",-7, 2.7E10,   e almacenar dito obxecto  nun ficheiro denominado  'serial'
mediante o metodo writeObject(obxecto_a_grabar) da clase  ObjectOutputStream ( que debe recibir como parametro un obxecto da clase FileOutputStream("ruta do ficheiro a escribir”). Pecha o ficheiro .

Despois crea outro obxecto baleiro da clase mclase e carga posteriormente os seus atributos cos valores almacenados no ficheiro 'serial' anteriormente creado . Para isto debes usar o metodo readObject() da clase ObjectInputStream  non esquecendo que debes castealo a clase mclase.

se todo funciona correctamente facer un cambio (deixando comentados as lineas que modifiquedes para facer este cambio) e repetir a execucion do proxecto : o cambio consistirá en  marcar a variable tipo int da clase mclase
como 'transient'  e comprobar que poñamos  o valor que poñamos nese campo int do obxecto a gardar   o resultado devolto será '0' (sería un nullo se a
variable transient fora a de tipo String

execucion antes do cambio
object1: s=ola; i=-7; d=2.7E10

execucion despois do cambio
object2: s=ola; i=0; d=2.7E10
fin da comprobacion: recuperanse os  datos excepto i por ser transient
