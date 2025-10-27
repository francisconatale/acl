from typing import TypeVar, Generic, List

# Definimos un tipo genérico T
T = TypeVar('T')
K = TypeVar('K')

# Creamos una clase genérica
class Caja(Generic[T, K]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, elemento: T):
        self.elementos.append(elemento)

    def obtener_ultimo(self) -> T:
        return self.elementos[-1]

# Uso con distintos tipos
caja_enteros = Caja[int]()
caja_enteros.agregar(10)
caja_enteros.agregar(20)
print(caja_enteros.obtener_ultimo())  # 20

caja_textos = Caja[str]()
caja_textos.agregar(hola)
print(caja_textos.obtener_ultimo())  # hola
