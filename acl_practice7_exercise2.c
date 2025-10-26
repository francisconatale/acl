
/*
 Leer un entero positivo y averiguar si es perfecto. Un nÂ° es perfecto cuando
es igual a la suma de sus divisores excepto el mismo.
 */
#include <stdio.h>
#include <stdbool.h>
int *divisores;
int number;
int result;
int main() {
	printf("introduce the number: \n");
	scanf("%d", &number);
	divisores = malloc(number * sizeof(int));
	int registeredDivisors;
	for(int i = 0; i < number; i++){
		if(number % i == 0){
			divisores[registeredDivisors++] = i;
		}
	
	}	
	for(int i = 0; i < registeredDivisors; i++){
		result += divisores[i];
	}
	printf("%d", result);
}