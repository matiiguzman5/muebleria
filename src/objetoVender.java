public class objetoVender {
    private double peso;
    private Dimension dimension;
    private String name;
    private boolean fragil;
    private double precio;
    private boolean reserva;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;}
    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

        objetoVender(String name,double peso , Dimension dimension, boolean fragil,
                     double precio, boolean reserva){
            setName(name);
            setDimension(dimension);
            setFragil(fragil);
            setPeso(peso);
            setPrecio(precio);
            setReserva(reserva);
    }


}
