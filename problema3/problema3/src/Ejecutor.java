
public class Ejecutor {
    public static void main(String[] args) {
        Instituciones_Educativas instituciones_educativas = new Instituciones_Educativas();
        Instituciones_Educativas instituciones_educativas1 = new Instituciones_Educativas("Unidad Educativa Fiscomicional San Francisco de Asís"
                ,"Fiscomicional",1560,50,1,28);
        /* Es para darle valores de parametros al objeto terreno
            String nombre = "Unidad Educativa Fiscomicional San Francisco de Asís";
            String tipo_institucion = "Fiscomicional";
            int numeros_alumnos = 2560;
            int numeros_docentes = 50;
            int numero_sedes = 1;
            double gastos_estudiantes = 30.3;
            instituciones_educativas1.CalcularPresupuesto();
             */
        instituciones_educativas1.CalcularPresupuesto();
        System.out.println(instituciones_educativas1);
  /*
            Otra manera de Presentarlos
            System.out.print("EL PRESUPUESTO DE LA INSTITUCION");
            System.out.print("Nombre de la Institución:\t"+instituciones_educativas1.getNombre()+"\n");
            System.out.print("Tipo de la Institución\t"+instituciones_educativas1.getTipo_Institucion()+"\n");
            System.out.print("Números de Estudiantes:\t"+instituciones_educativas1.getNumeros_Alumnos()+"\n");
            System.out.print("Números de Docentes:\t"+instituciones_educativas1.getNumeros_Docentes()+"\n");
            System.out.print("Números de Sedes:\t"+instituciones_educativas1.getNumeros_Sedes()+"\n");
            System.out.print("Gasto de los Estudiantes:\t"+instituciones_educativas1.getGastos_Estudiantes()+"$"+"\n");
            System.out.print("Presupuseto de la Institucion:\t"+instituciones_educativas1.getCalcularPresupuesto()+"$"+"\n");
            */

    }
}