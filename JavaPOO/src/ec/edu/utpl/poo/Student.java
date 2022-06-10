package ec.edu.utpl.poo;

public class Student {
    // Atributo de clase
    public static String university;
    // Atributo de instancia
    private String name;
    private int age;
    private int semester;
    private String career;

    // Constructor

    public Student(String name, int age, int semester) {
        this.name = name;
        validarDato(age);
        this.age = age;
        validarDato(semester);
        this.semester = semester;
        setUniversity("UTPL");
    }

    public Student(String name, int age, int semester, String career) {
        this.name = name;
        validarDato(age);
        this.age = age;
        validarDato(semester);
        this.semester = semester;
        this.career = career;
        setUniversity("UTPL");
    }

    // Getters y setters atributos de instancia

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String carreer) {
        this.career = carreer;
    }

    // Getter y setter atributos de clase

    public static String getUniversity() {
        return university;
    }

    public static void setUniversity(String university) {
        Student.university = university;
    }

    // Validación de datos
    private void validarDato(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Denominador no puede ser 0 o negativo");
        }
    }
}
