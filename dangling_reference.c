#include <stdio.h>
#include <stdlib.h>
int *q;
int res;
void main(){
    
}

void dangling(){
    int *p = (int*) malloc(sizeof(int));
    int **direccion = &p;
    *p = 42;
    free(p);
    if(**direccion == 42){
        printf("the value of p is 42");
    } else {
        printf("the value of p is not 42");
    }
}

