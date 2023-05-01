class Sistema {
    private String sistema_operativo;
    private double tamanio_pantalla;
    private double costo_inicial;
    private double iva_porcentaje;
    private double iva_costo_inicial;
    private double costo_final;
    private String direccion_mac ;
    private String informacion_IMEI;

    public Sistema(){}
    public Sistema(String sistema_operativo,double tamanio_pantalla
            ,double costo_inicial,double iva_porcentaje,String direccion_mac,String informacion_IMEI){
        this.sistema_operativo = sistema_operativo;
        this.tamanio_pantalla = tamanio_pantalla;
        this.costo_inicial = costo_inicial;
        this.iva_porcentaje = iva_porcentaje;
        this.direccion_mac = direccion_mac;
        this.informacion_IMEI = informacion_IMEI;
    }
    public void setSistema_Operativo(String sistema_operativo){
        this.sistema_operativo=sistema_operativo;
    }
    public String getSistema_Operativo(){
        return this.sistema_operativo;
    }
    public void setTamanio_Pantalla(double tamanio_pantalla){
        this.tamanio_pantalla=tamanio_pantalla;
    }
    public double getTamanio_Pantalla(){
        return this.tamanio_pantalla;
    }
    public void  setCosto_Inicial(double costo_inicial){
        this.costo_inicial=costo_inicial;
    }

    public double getCosto_Inicial() {
        return this.costo_inicial;
    }
    public void setIva_Porcentaje(double iva_porcentaje){
        this.iva_porcentaje=iva_porcentaje;
    }
    public double getIva_Porcentaje(){
        return this.iva_porcentaje;
    }
    public void setDirecion_Mac(String direccion_mac){
        this.direccion_mac = direccion_mac;
    }
    public String getDireccion_Mac(){
        return  this.direccion_mac;
    }
    public void setInformacion_IMEI(String informacion_IMEI){
        this.informacion_IMEI=informacion_IMEI;
    }
    public String getInformacion_IMEI(){
        return this.informacion_IMEI;
    }
    public void CalcularIvaCostoInicial(){
        this.iva_costo_inicial=costo_inicial*(iva_porcentaje/100);
    }
    public double getCalcularIvaCostoInicial(){
        return this.iva_costo_inicial;
    }
    public void CalcularCostoFinal(){
        this.costo_final =costo_inicial+iva_costo_inicial;
    }

    public double getCalcularCosFinal(){
        return this.costo_final;
    }
    public String toString(){
        return String.format("SISTEMAS DE EQUIPO CELULARES\n"
                        + "\nEl Sistema Operativo: %.10s"
                        + "\nEl Tamaño del Dispositivo: %.2fpul"
                        + "\nCosto Inicial: %.10s$"
                        + "\nIva: %.2s"
                        + "\nCosto Final: %.2f$"
                        + "\nDireccion Mac: %.100s"
                        + "\nInformacion_IMEI: %.10s"
                ,this.getSistema_Operativo()
                ,this.getTamanio_Pantalla()
                ,this.getCosto_Inicial()
                ,this.getIva_Porcentaje()
                ,this.getCalcularCosFinal()
                ,this.getDireccion_Mac()
                ,this.getInformacion_IMEI()
        );
    }
}
