#include <stdio.h>
#include <iostream>
 
int main() {
 
    double A, B, media;
    
    std::cin >> A;
    std::cin >> B;
    
    A = A * 3.5;
    B = B * 7.5;
    
    media = (A + B) / 11;
    
    printf("MEDIA = %.5f\n", media);
    
    return 0;
}