package personajes;

import java.util.ArrayList;
import java.util.List;
import armas.Arma;

public class Personaje {

    public String nombre;
    public int salud;
    public int stamina;

    public void atacar(Personaje victima, Arma arma) {
        victima.setSalud(victima.getSalud()-arma.getDanio());
    }

    public List<Arma> armas = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

   
}
