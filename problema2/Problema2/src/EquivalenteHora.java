class EquivalenteHora {
    private int horas;
    private int minutos;
    private int segundos;
    private int dias;
    public EquivalenteHora() {
    }
    public EquivalenteHora(int horas) {
        this.horas = horas;
    }
    public void setHoras(int horas){
        this.horas=horas;
    }
    public int getHoras() {
        return this.horas;
    }
    public void CalcularMinutos(){
        this.minutos=this.horas*60;
    }
    public void CalcularSegundos(){
        this.segundos=this.horas*3600;
    }
    public void CalcularDias(){
        this.dias=this.horas/24;
    }
    public int getCalcularMinutos(){
        return this.minutos;
    }
    public int getCalcularSegundos(){
        return this.segundos;
    }
    public int getCalcularDias() {
        return this.dias;
    }
    public String toString(){
        return String.format("LA EQUIVALENCIA EN HORA ES: \n"
                        + "\nHoras: %.2s"
                        + "\nMinutos: %.10s"
                        + "\nSegundos: %.10s"
                        + "\nDias: %.10s"
                ,this.getHoras()
                ,this.getCalcularMinutos()
                ,this.getCalcularSegundos()
                ,this.getCalcularDias()
        );
    }
}