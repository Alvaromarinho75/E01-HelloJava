package parte_01;

public class BalancoTrimestral {

    public static void main(String[] args) {

        double gastosJaneiro = 15000;
        double gastosFevereiro = 23000;
        double gastosMarco = 17000;

        double gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);

        System.out.println("Gastos do Trimestre: " + gastosTrimestre);
        System.out.println("Media de gastos: " + (gastosTrimestre/3));

    }

}

