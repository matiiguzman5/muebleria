import java.util.ArrayList;
import java.util.Date;

public class Venta {
    private String nombreVendedor;
    private Date fechaEntrega;
    private double descuento;
    private int cuotas;
    public ArrayList<objetoVender> objetos;


    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public ArrayList<objetoVender> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<objetoVender> objetos) {
        this.objetos = objetos;
    }

        Venta(String nombreVendedor,
              Date fechaEntrega, double descuento, int cuotas,boolean reserva){
                setNombreVendedor(nombreVendedor);
                setFechaEntrega(fechaEntrega);
                setDescuento(descuento);
                setCuotas(cuotas);
                setObjetos(new ArrayList<objetoVender>());

    }
}

