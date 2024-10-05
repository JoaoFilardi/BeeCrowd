#include <stdio.h>

int main() {
    const double n = 3.14159; // Constante de Pi
    double area, raio;

    // Leitura do valor de raio (tipo double)
    scanf("%lf", &raio);

    // Cálculo da área
    area = n * (raio * raio);

    // Impressão do resultado com 4 casas decimais
    printf("A=%.4f\n", area);

    return 0;
}
