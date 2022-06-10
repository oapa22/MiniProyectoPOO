class Student:
    # Atributo de clase
    university = "UTPL"

    # Constructor
    def __init__(self, name: str = 'N/A', age: int = 0, semester: int = 0, career: str = 'N/A'):
        # Atributos de instancia
        self.__name = name
        self.__career = career
        try:
            # Validación de datos
            if age <= 0 or semester <= 0:
                raise Exception("\nDato incorrecto, introduzca número mayor a 0")
            self.__age = age
            self.__semester = semester
        except ValueError:
            print("")


    # Getters y setters de atributos de instancia

    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, name):
        self.__name = name

    @property
    def age(self):
        return self.__age

    @age.setter
    def age(self, age):
        self.__age = age

    @property
    def semester(self):
        return self.__semester

    @semester.setter
    def semester(self, semester):
        self.__semester = semester

    @property
    def career(self):
        return self.__career

    @career.setter
    def career(self, career):
        self.__career = career

    # Getters y setters de atributos de clase

    @classmethod
    def getUniversity(cls):
        return cls.university

    @classmethod
    def setUniversity(cls, university):
        cls.university = university
