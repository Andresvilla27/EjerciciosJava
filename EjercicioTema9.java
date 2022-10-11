
public class EjercicioTema9 {
    public static void main(String[] args) {
        System.out.println("Propiedades de persona: ");
        System.out.println("Nombre: " + Persona.getNombre());
        System.out.println("Edad: " + Persona.getEdad());
        System.out.println("N° de telefono: "+ Persona.getTelefono());
        System.out.println("**********************************************************");

        Cliente cliente = new Cliente();
        cliente.nombre = "Juan";
        cliente.edad = 25;
        cliente.telefono = 156485;

        System.out.println("Propiedades de Cliente: ");
        
        System.out.println("Nombre: "+Cliente.getNombre());
        System.out.println("Edad: "+Cliente.getEdad());
        System.out.println("Telefono: "+Cliente.getTelefono());
        System.out.println("Credito: "+Cliente.getCredito());

        System.out.println("**********************************************************");
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Pedro";
        trabajador.edad = 48;
        trabajador.telefono = 456666;
        
        System.out.println("Propiedades de Trabajador: ");
        System.out.println("Nombre: "+Trabajador.getNombre());
        System.out.println("Edad: "+Trabajador.getEdad());
        System.out.println("Telefono: "+Trabajador.getTelefono());
        System.out.println("Salario: "+Trabajador.getSalario());
    }

    static class Persona {

        static String nombre = "andres";
        static int edad = 37;
        static int telefono = 325654;

        

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public static String getNombre() {
            return nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public static int getEdad() {
            return edad;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public static int getTelefono() {
            return telefono;
        }
    }

    static class Cliente extends Persona {
        static double credito = 23.131;

        public void setCredito(double credito) {
            this.credito = credito;
        }

        public static double getCredito() {
            return credito;
        }
        
    }

    static class Trabajador extends Persona {
        static double salario = 15.544;

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public static double getSalario() {
            return salario;
        }
    }

}

/*
 * --Crea una clase Persona con las siguientes variables:
 * La edad
 * El nombre
 * El teléfono
 * --Una vez creada la clase, crea una nueva clase Cliente
 * que herede de Persona, esta nueva clase tendrá la variable
 * credito solo para esa clase.
 * --Crea ahora un objeto de la clase Cliente que debe tener
 * como propiedades la edad, el telefono, el nombre y el credito,
 * tienes que darles valor y mostrarlas por pantalla.
 * --Una vez hecho esto, haz lo mismo con la clase Trabajador
 * que herede de Persona, y con una variable salario que solo
 * tenga la clase Trabajador.
 */