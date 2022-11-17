import java.util.ArrayList;

public class Cliente {
    private int numeroCliente;
    private String nombreCliente;
    private int numeroTelefono;
    private boolean reservo;
    public ArrayList<objetoVender> objetos;


    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;}

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public boolean isReservo() {
        return reservo;
    }

    public void setReservo(boolean reservo) {
        this.reservo = reservo;
    }
    Cliente(String nombreCliente, int numeroCliente, int numeroTelefono, boolean reservo){
        setNombreCliente(nombreCliente);
        setNumeroCliente(numeroCliente);
        setNumeroTelefono(numeroTelefono);
        setReservo(reservo);
    }


}

