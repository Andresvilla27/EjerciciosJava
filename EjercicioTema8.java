public class EjercicioTema8 {
    public static void main(String[] args) {
        //Objeto Persona en el Main
        Persona persona = new Persona();

        //utilizacion de gets y sets para persona
        persona.setNombre ("Andres");
        persona.setEdad ("37");
        persona.setTelefono ("54646813");
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
    public static class Persona{

        //Variables Privadas Nombre, Edad, y Telefono
        private String nombre;
        private String edad;
        private String telefono;

        //Creacion de Gets y Sets para cada propiedad
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setEdad(String edad){
            this.edad = edad;
        }
        public void setTelefono(String telefono){
            this.telefono = telefono;
        }
        public String getNombre(){
            return this.nombre;
        }
        public String getEdad(){
            return this.edad;
        }
        public String getTelefono(){
            return this.telefono;
        }
       }
       
}


