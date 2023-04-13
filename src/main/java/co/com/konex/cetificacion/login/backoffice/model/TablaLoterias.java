package co.com.konex.cetificacion.login.backoffice.model;

public class TablaLoterias {

    private String codigo;
    private String nombrelargo;
    private String nombrecorto;
    private String telefono;

    public TablaLoterias(String codigo, String nombrelargo, String nombrecorto, String telefono) {
        this.codigo = codigo;
        this.nombrelargo = nombrelargo;
        this.nombrecorto = nombrecorto;
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombrelargo() {
        return nombrelargo;
    }

    public void setNombrelargo(String nombrelargo) {
        this.nombrelargo = nombrelargo;
    }

    public String getNombrecorto() {
        return nombrecorto;
    }

    public void setNombrecorto(String nombrecorto) {
        this.nombrecorto = nombrecorto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



}
