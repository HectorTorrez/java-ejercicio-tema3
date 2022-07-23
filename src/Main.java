public class Main {
    public static void main(String[] args) {
        Coche mycoche = new Coche();
        mycoche.SumarPuerta();
        System.out.println(mycoche.puertas);

        System.out.println(mate(10, 20, 30));
    }

    public static int mate(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        return resultado;
    }

}
class Coche {
    public int puertas = 4;


    public void SumarPuerta() {
        this.puertas++;
    }



}














