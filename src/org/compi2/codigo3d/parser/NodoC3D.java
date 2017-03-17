package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones. Cuenta con un
 * único atributo de tipo String, pero pueden agregársele los atributos que se
 * consideren necesarios.
 *
 * @author esvux
 */
public class NodoC3D {

    private String cad, v, f, s;

    public NodoC3D(String cad) {
        this.cad = cad;
    }

    public NodoC3D(String cad, String ev, String ef) {
        this.cad = cad;
        this.v = ev;
        this.f = ef;
    }

    public NodoC3D(String cad, String ev, String ef, String es) {
        this.cad = cad;
        this.v = ev;
        this.f = ef;
        this.s = es;
    }

    public String getCad() {
        return cad;
    }

    public String getV() {
        return v;
    }

    public String getF() {
        return f;
    }

    public String getS() {
        return s;
    }

}
