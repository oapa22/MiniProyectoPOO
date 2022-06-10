package ec.edu.utpl.poo;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Juan",23,6);
        Student student2 = new Student("Pedro",19,2,"Artes Visuales");

        // ATRIBUTO DE INSTANCIA
        // Haciendo uso del setter
        student1.setAge(24);
        // Haciendo uso del getter
        System.out.println(student1.getAge());

        //  ATRIBUTO DE CLASE
        // Haciendo uso del setter
        // Desde la clase
        Student.setUniversity("UNL");
        // Desde el objeto creado
        student1.setUniversity("UNL");

        // Haciendo uso del getter
        // Desde la clase
        System.out.println(Student.getUniversity());
        // Desde el objeto creado
        System.out.println(student1.getUniversity());

        // Ejemplo sobrecarga de constructores
        System.out.println(student1.getCareer());
        System.out.println(student2.getCareer());
    }
}
