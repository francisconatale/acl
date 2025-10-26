#include <stdio.h>
#include <stdbool.h>
bool failed;
char _operator;
int number1, number2;
int res;
int main() {
	failed = false;
	res = 0;
	printf("introduce the first number: \n");
	scanf("%d", &number1);
	printf("introduce the second number: \n");
	scanf("%d", &number2);
	printf("introduce the operator: \n");
	scanf(" %c", &_operator);
	
	switch(_operator) {
	case '-':
		res = number1 - number2;
		break;
	case '+':
		res = number1 + number2;
		break;
	case '*':
		res = number1 * number2;
		break;
	case '/':
		res = number1 / number2;
		break;

	default:
		failed = true;
		break;
	}
	
	if(!failed) {
		printf("%d", res);
	} else {
    printf("the operator introduced is invalid");
  }
	return 0;
}