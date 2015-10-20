package visitor.figure;

import java.util.ArrayList;
import java.util.Collection;

import upm.jbb.IO;

public final class VisitorMain {
    private Collection<Element> coleccion = new ArrayList<Element>();

    public VisitorMain() {
        coleccion.add(new ElementA());
        coleccion.add(new ElementA());
        coleccion.add(new ElementB());
        coleccion.add(new ElementA());
    }

    public void visitador1() {
        Visitor1 v1 = new Visitor1();
        for (Element elemento : coleccion) {
            elemento.accept(v1);
        }
    }
    
    public void visitador2() {
        Visitor2 v2 = new Visitor2();
        for (Element elemento : coleccion) {
            elemento.accept(v2);
        }
    }

    public static void main(String[] args) {
        IO.getIO().addView(new VisitorMain());
    }
}
