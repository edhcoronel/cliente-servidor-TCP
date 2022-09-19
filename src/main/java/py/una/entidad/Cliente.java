package py.una.entidad;

public class Cliente {
    
    Long idCliente;
    String cliente;
    String cotizacion;

    public Cliente(long i, String cliente, String j) {
        this.idCliente = (long) i;
        this.cliente = cliente;
        this.cotizacion = j;
    }

    public Cliente(){
    }

    public Long getIdCliente() {
		return idCliente;
	}
    public void setIdcliente(Long idcliente) {
		this.idCliente = idcliente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(String cotizacion) {
		this.cotizacion = cotizacion;
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"id=" + idCliente +
				", cliente='" + cliente + '\'' +
				", cotizacion=" + cotizacion +
				'}';
	}

}
