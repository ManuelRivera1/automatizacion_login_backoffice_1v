package co.com.konex.cetificacion.login.backoffice.models;

public class TablaUsuarios {
    private String usuario;
    private String contrasenna;

    private String empresa;

    public TablaUsuarios(String usuario, String contrasenna, String empresa) {
        this.usuario = usuario;
        this.contrasenna = contrasenna;
        this.empresa = empresa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}

