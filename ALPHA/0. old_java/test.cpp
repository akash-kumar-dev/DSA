#include<iostream>
using namespace std;

class complex{
    int real;
    int img;
    public:
        complex(int x,int y){
            real = x;
            img = y;
        }
        complex(){}

        complex operator + (complex const &obj) {
            complex result;
            result.real = real + obj.real;
            result.img = img + obj.img;
            return result;
        }

        void display() {
            cout<<real<<"+i"<<img<<endl;
        }
};

int main(){

    complex c1(4,8), c2(2,5);
    complex c3 = c1 + c2;
    c3.display();

    return 0;
}