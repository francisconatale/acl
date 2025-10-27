#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define SIZE 20
int matrix[SIZE][SIZE];
int *punteroSumMaxRow;
void fillMatrix(int matrix[SIZE][SIZE]);
int main(){
    srand(time(NULL));
    fillMatrix(matrix);
    int countersOfRows[20];
    for(int i = 0; i < SIZE; i++){
        int result = 0;
        printf("row %d", i);
        printf("\n");
        for(int j = 0; j < SIZE; j++){
            printf("%d ", matrix[i][j]);
            result += matrix[i][j];
        }
        printf("\n");
        countersOfRows[i] = result;
    }
    int max = countersOfRows[0];
    int indexOfMax = 0;
    for(int i = 1; i < SIZE; i++){
      if(max < countersOfRows[i]){
          max = countersOfRows[i];
          indexOfMax = i;
      }
      
        printf("count of row: %d ", countersOfRows[i]);
        printf("\n");
    }
    printf("the max sum of the row %d  is : %d \n", indexOfMax, max);
    punteroSumMaxRow = &matrix[indexOfMax][SIZE];
    for(int i = 0; i < SIZE; i++){
        printf("%d ", *(punteroSumMaxRow+i));
    }
}

void fillMatrix(int matrix[SIZE][SIZE]){
    for(int i = 0; i < SIZE; i++){
        for(int j = 0; j < SIZE; j++){
              matrix[i][j] = rand() % 10;
        }
    }
}