public class Bebida {
    // POO: encapsulación = proteger los datos
    private String nombre;
    private int capacidad;
    private boolean tieneGas;
    private double precio;
    

    // crear el metodo constructor
    public Bebida(String nombre, int capacidad, boolean tieneGas, double precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tieneGas = tieneGas;
        this.precio = precio;
        System.out.println("nueva bebida creada!"); // opcional
    }

    public Bebida(String nombre,boolean tieneGas) {
        this.nombre = nombre;
        this.tieneGas = tieneGas;
    }

    // crear un metodo constructor vacio
    // POO: sobrecarga de métodos: con el mismo nombre, según la cantidad de parametros que se le pase al metodo, ejecuta uno u otro
    public Bebida() {
    }
   
    // crear getters y los setters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isTieneGas() {
        return this.tieneGas;
    }

    public boolean getTieneGas() {
        return this.tieneGas;
    }

    public void setTieneGas(boolean tieneGas) {
        this.tieneGas = tieneGas;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


  

    // crear el toString

    @Override
    public String toString() {
        // 'convertir' de boolean a string
        String gas = "";
        if(tieneGas){
            gas = ", tiene gas ";
        } else{
            gas = ", no tiene gas ";
        }

        return 
            " nombre: " + getNombre() + " " +
            ", capacidad: " + getCapacidad() + " " +
            gas + " " +
            ", precio: " + getPrecio() + " euros"; 
            
    }


    public String toString2() {
        // 'convertir' de boolean a string
        String gas = "";
        if(tieneGas){
            gas = ", tiene gas ";
        } else{
            gas = ", no tiene gas ";
        }

        return 
            " nombre: " + getNombre()  +
            gas;
            
    }


    // podemos añadir métodos extra
    public void esSaludable(boolean azucar) {
        if(azucar){
            System.out.println("no es tan saludable");
        } else{
            System.out.println("es saludable");
        }
    }

    // code generator for java, para construir objetos automaticamente
    // o source action (generico)
}
