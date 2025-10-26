#include <stdio.h>
#include <stdlib.h>
int i;
void generateTrash();
int main(){
    while(i < 5){
     generateTrash();
     i++;
    }
}

void generateTrash(){
    int *p =  (int *) malloc(sizeof(int)); // esta direccion de memoria no puede ser referenciada mas
    printf("the %d direction of p is: %p \n", i, **p); // si haria &p en realidad siempre obtendria la misma direccion
    // ya que es la direccion estatica del bloque, ahi estoy imprimiendo a la direccion que genera en cada llamada 
}