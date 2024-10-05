#include <stdio.h>
#include <iostream>
 
int main() {
    
    double a, b, c;
    std::cin >> a;
    std::cin >> b;
    std::cin >> c;
    
    a = a*2;
    b = b*3;
    c = c*5;
    
    double media = (a + b + c) / 10;
    
    printf("MEDIA = %.1f\n", media);
 
    return 0;
}