class Instituciones_Educativas {
    private String nombre;
    private String tipo_institucion;
    private int numeros_alumnos;
    private int numeros_docentes;
    private int numeros_sedes;
    private double gastos_estudiantes;
    private double calcular_presupuesto;

    public Instituciones_Educativas(){
    }
    public Instituciones_Educativas(String nombre,String tipo_institucion,int numeros_alumnos,int numeros_docentes,int numeros_sedes,double gastos_estudiantes ){
        this.nombre = nombre;
        this.tipo_institucion = tipo_institucion;
        this.numeros_alumnos = numeros_alumnos;
        this.numeros_docentes = numeros_docentes;
        this.numeros_sedes = numeros_sedes;
        this.gastos_estudiantes = gastos_estudiantes;
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTipo_Institucion(String tipo_institucion){
        this.tipo_institucion=tipo_institucion;
    }
    public String getTipo_Institucion(){
        return this.tipo_institucion;
    }
    public void setNumeros_Alumnos(int numeros_alumnos){
        this.numeros_alumnos=numeros_alumnos;
    }

    public int getNumeros_Alumnos() {
        return this.numeros_alumnos;
    }
    public void setNumeros_Docentes(int numeros_docentes){
        this.numeros_docentes=numeros_docentes;
    }
    public int getNumeros_Docentes(){
        return this.numeros_docentes;
    }
    public void setNumeros_Sedes(){
        this.numeros_sedes=numeros_sedes;
    }
    public int getNumeros_Sedes(){
        return this.numeros_sedes;
    }
    public void setGastos_Estudiantes(double gastos_estudiantes){
        this.gastos_estudiantes = gastos_estudiantes;
    }
    public double getGastos_Estudiantes(){
        return this.gastos_estudiantes;
    }
    public void CalcularPresupuesto(){
        this.calcular_presupuesto = this.gastos_estudiantes * this.numeros_alumnos;
    }
    public double getCalcularPresupuesto(){
        return this.calcular_presupuesto;
    }
    public String toString(){
        return String.format("EL PRESUPUESTO DE LA INSTITUCION \n"
                        + "\nNombre de la Institución: %.1000s"
                        + "\nTipo de la Institución: %.1000s"
                        + "\nNúmeros de Estudiantes: %.100s"
                        + "\nNúmeros de Docentes: %.100s"
                        + "\nNúmeros de Sedes: %.100s"
                        + "\nGasto de los Estudiantes: %.2f"
                        + "\nPresupuseto de la Institucion: %.2f"

                ,this.getNombre()
                ,this.getTipo_Institucion()
                ,this.getNumeros_Alumnos()
                ,this.getNumeros_Docentes()
                ,this.getNumeros_Sedes()
                ,this.getGastos_Estudiantes()
                ,this.getCalcularPresupuesto()
        );
    }
}