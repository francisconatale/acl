import inspect

# Ejemplo de jerarquía de clases
class A:
    def metodo_a(self):
        pass

class B(A):
    def metodo_b(self):
        pass

class C(B):
    def metodo_c(self):
        pass


# Funciones de introspección
def explorar(obj):
    print(f"¿Es una clase? {inspect.isclass(obj)}")
    print(f"¿Es un método? {inspect.ismethod(obj)}")
    print(f"¿Es una función? {inspect.isfunction(obj)}")
    print(f"¿Es un módulo? {inspect.ismodule(obj)}")
    print()

def jerarquia(clase):
    print(f"Jerarquía de {clase.__name__}:")
    for base in inspect.getmro(clase):  # MRO = Method Resolution Order
        print(" ->", base.__name__)
    print()

# Ejemplo de uso
explorar(A)                # verificamos si es una clase
explorar(A.metodo_a)       # verificamos si es un método
explorar(B.metodo_b)       # otro método
jerarquia(C)               # mostramos la jerarquía de clases
