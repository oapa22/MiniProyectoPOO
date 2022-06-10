from Student import Student

# Creación de objetos
student1 = Student("Juan", 23, 6)
student2 = Student("Pedro", 19, 2, "Artes Visuales")

# Creación de un atributo fuera de la clase Student (no recomendable)
student1.gender = "Male"

# ATRIBUTO DE INSTANCIA
# Haciendo uso del setter
student1.age = 24
# Haciendo uso del getter
print(student1.age)

# ATRIBUTO DE CLASE
# Haciendo uso del setter
# Desde la clase
Student.setUniversity("UNL")
# Desde el objeto creado
student1.setUniversity("UNL")

# Haciendo uso del getter
# Desde la clase
print(Student.getUniversity())
# Desde el objeto creado
print(student1.getUniversity())

# Ejemplo sobrecarga de constructores
print(student1.career)
print(student2.career)