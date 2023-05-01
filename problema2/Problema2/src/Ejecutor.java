import java.text.DecimalFormat;


public class Ejecutor {
    public static void main(String[] args) {
        EquivalenteHora horas = new EquivalenteHora();
        EquivalenteHora horas1 = new EquivalenteHora(96);
      /* Es para darle valores de parametros al objeto terreno
            int hora = 96;
            horas1.CalcularMinutos();
            horas1.CalcularSegundos();
            horas1.CalcularDias();
             */
        horas1.CalcularMinutos();
        horas1.CalcularSegundos();
        horas1.CalcularDias();
        System.out.println(horas1);
    }
                /*
            Otra manera de Presentarlos
            System.out.print("LA EQUIVALENCIA EN HORA ES:")
            System.out.print("En Horas:\t"+horas1.getHoras()+"horas"+"\n");
            System.out.print("En Minutos\t"+horas1.getMinutos()+"minutos"+"\n");
            System.out.print("En Segundos:\t"+horas1.getSegundos()+"segundos"+"\n");
            System.out.print("En Dias:\t"+(horas1.getDias())+"dias"+"\n");
            */
}
