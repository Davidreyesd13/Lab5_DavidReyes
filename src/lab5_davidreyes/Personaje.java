package lab5_davidreyes;

public class Personaje {

    String nombre, debilidad, universo, poder;
    int agilidadfisica, fuerza, agilidadmental, hp;

    public Personaje() {
    }

    public Personaje(String nombre, String debilidad, String universo, String poder, int agilidadfisica, int fuerza, int agilidadmental, int hp) {
        this.nombre = nombre;
        this.debilidad = debilidad;
        this.universo = universo;
        this.poder = poder;
        this.agilidadfisica = agilidadfisica;
        this.fuerza = fuerza;
        this.agilidadmental = agilidadmental;
        this.hp = hp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getAgilidadfisica() {
        return agilidadfisica;
    }

    public void setAgilidadfisica(int agilidadfisica) {
        this.agilidadfisica = agilidadfisica;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadmental() {
        return agilidadmental;
    }

    public void setAgilidadmental(int agilidadmental) {
        this.agilidadmental = agilidadmental;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String toStringn() {
        return nombre+"\nPoder ->" + poder + "\nFuerza->" + fuerza + "\nHabilidad->" + agilidadfisica + "\nMental->" + agilidadmental + "\nHp->" + hp;
    }
}
