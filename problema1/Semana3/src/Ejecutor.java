import java.text.DecimalFormat;

public class Ejecutor {
    public static void main(String[] args) {

        Terreno terreno= new Terreno();
        Terreno terreno1= new Terreno(100.3,50.6,14);

            /* Es para darle valores de parametros al objeto terreno
            double ancho = 100.3;
            double largo =50.6;
            double valor_metro = 14;
            terreno1.setAnchoTerreno(ancho);
            terreno1.setLargoTerreno(largo);
            terreno1.setValorMetroCuadrado(valor_metro);
            terreno1.CalcularAreaTerreno();
            terreno1.CalcularCostoTerreno();
             */
        terreno1.CalcularAreaTerreno();
        terreno1.CalcularCostoTerreno();
        System.out.println(terreno1);

            /*
            Otra manera de Presentarlos
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.print("SU TERRENO CON LOS SIGUIENTES PARAMETROS:")
            System.out.print("Ancho del Terreno es:\t"+terreno1.getAnchoTerreno()+"m"+"\n");
            System.out.print("Largo del Terreno es:\t"+terreno1.getLargoTerreno()+"m"+"\n");
            System.out.print("Valor por cada Metro Cuadrado del Terreno es:\t"+terreno1.getValorMetroCuadrado()+"$"+"\n");
            System.out.print("Area del Terreno es:\t"+df.format(terreno1.getCalcularAreaTerreno())+"m²"+"\n");
            System.out.print("Costo del Terreno es:\t"+df.format(terreno1.getCalcularCostoTerreno())+"$");
            */
    }
}
