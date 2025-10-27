#include <stdio.h>
#include <stdbool.h>

long int number;
int figuresOfTheNumber;
int figures[20]; 

void calculateFigures(long int number, int *figures, int *figuresOfTheNumber) {
    *figuresOfTheNumber = 0;

    while(number > 0){
        figures[*figuresOfTheNumber] = number % 10; 
        (*figuresOfTheNumber)++;
        number /= 10;
    }
}

int main() {
    figuresOfTheNumber = 0;
    bool isCapicua = true;
    
    printf("Introduce the number: ");
    scanf("%ld", &number);

    calculateFigures(number, figures, &figuresOfTheNumber);

    for(int i = 0, j = figuresOfTheNumber - 1; i < j; i++, j--) {
        if(figures[i] != figures[j]){
            isCapicua = false;
            break;
        }
    }

    if(isCapicua){
        printf("Es capicúa\n");
    } else {
        printf("No es capicúa\n");
    }

    return 0;
}
