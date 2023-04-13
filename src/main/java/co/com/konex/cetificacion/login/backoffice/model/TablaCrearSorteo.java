package co.com.konex.cetificacion.login.backoffice.model;

public class TablaCrearSorteo {

    private String numerosorteo;
    private String numeroincrementaldelsorteo;

    private String horasorteo;

    public TablaCrearSorteo(String numerosorteo, String numeroincrementaldelsorteo,String horasorteo) {
        this.numerosorteo = numerosorteo;
        this.numeroincrementaldelsorteo = numeroincrementaldelsorteo;
        this.horasorteo = horasorteo;
    }
    public String getHorasorteo() {
        return horasorteo;
    }

    public void setHorasorteo(String horasorteo) {
        this.horasorteo = horasorteo;
    }
       public String getNumerosorteo() {
        return numerosorteo;
    }

    public void setNumerosorteo(String nunerosorteo) {
        this.numerosorteo = numerosorteo;
    }

    public String getNumeroincrementaldelsorteo() {
        return numeroincrementaldelsorteo;
    }

    public void setNumeroincrementaldelsorteo(String numeroincrementaldelsorteo) {
        this.numeroincrementaldelsorteo = numeroincrementaldelsorteo;
    }



}
