
public class App {

    public static int Adder(int num1, int num2, int num3) {

        int result = 0;
        return result = num1 + num2 + num3;
    }

    public static void main(String[] args) {
        int add = Adder(1, 2, 3);

        Coche miCoche = new Coche(4);

        System.out.println("Antes de incrementar el coche tiene " + miCoche.getDoors() + " puertas.");

        miCoche.addDoors();

        System.out.println("Después de incrementar el coche tiene " + miCoche.getDoors() + " puertas.");
    }
}
