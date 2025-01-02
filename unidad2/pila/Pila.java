package unidad2.pila;

/**
 * Esta clase modela una estructura de datos linea de tipo pila.
 * El ultimo elemento en entrar es el primero en salir.
 * @author ?
 * @param <T>
 */
public class Pila<T> {
    
    private T[] datos;
    int tope;
    
    public Pila() {
        datos = (T[]) new Object[5];
        tope = -1;
    }
    
    public Pila(int máximo) {
        datos = (T[]) new Object[máximo];
        tope = -1;
    }
    
    public boolean pilaVacía() {
        if (tope == -1)
            return true;    // La pila esta vacía.
        return false;       // La pila no esta vacía.
    }
    
    public boolean pilaLlena() {
        if (tope == datos.length - 1)
            return true;    // La pila esta llena.
        return false;       // La pila no esta llena.
    }
    
    public void push(T dato) {
        if (pilaLlena())
            System.out.println("Desbordamiento - Pila llena");
        else {
            tope ++;
            datos[tope] = dato;
        }
    }
    
    public T pop() {
        T dato = null;
        if (pilaVacía()) 
            System.out.println("Subdesbordamiento - Pila vacía");
        else {
            dato = datos[tope];
            tope --;
        }
        return dato;
    }
    
    public static void main(String[] args) {
        Pila pila = new Pila(10);
        pila.pop();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
    }
}


