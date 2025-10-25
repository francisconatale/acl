class Vehiculo:
    def __init__(self, marca, modelo, **kwargs):
        super().__init__(**kwargs)  # por si hay otra clase arriba en el MRO
        self.marca = marca
        self.modelo = modelo
        print("Init Vehiculo")

    def descripcion(self):
        return f"{self.marca} {self.modelo}"


class VehiculoCombustion(Vehiculo):
    def __init__(self, marca, modelo, capacidad_tanque, **kwargs):
        super().__init__(marca=marca, modelo=modelo, **kwargs)
        self.capacidad_tanque = capacidad_tanque
        self.litros_en_tanque = 0
        print("Init Combustion")

    def cargar_combustible(self, litros):
        self.litros_en_tanque = min(self.capacidad_tanque, self.litros_en_tanque + litros)


class VehiculoElectrico(Vehiculo):
    def __init__(self, marca, modelo, capacidad_bateria, **kwargs):
        super().__init__(marca=marca, modelo=modelo, **kwargs)
        self.capacidad_bateria = capacidad_bateria
        self.carga_actual = 0
        print("Init Electrico")

    def cargar_bateria(self, kwh):
        self.carga_actual = min(self.capacidad_bateria, self.carga_actual + kwh)


class VehiculoHibrido(VehiculoCombustion, VehiculoElectrico):
    def __init__(self, marca, modelo, capacidad_tanque, capacidad_bateria):
        super().__init__(
            marca=marca,
            modelo=modelo,
            capacidad_tanque=capacidad_tanque,
            capacidad_bateria=capacidad_bateria
        )
        print("Init Hibrido")

    def descripcion(self):
        return f"{self.marca} {self.modelo} híbrido ({self.litros_en_tanque}L / {self.carga_actual}kWh)"


auto = VehiculoHibrido("Toyota", "Prius", 40, 10)
auto.cargar_combustible(20)
auto.cargar_bateria(5)
print(auto.descripcion())
print(VehiculoHibrido.mro())
