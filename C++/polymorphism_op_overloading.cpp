#include<iostream>
using namespace std;

class complex{
    private:
        int real,img;
    public:
        complex(int r,int i){
            real = r;
            img = i;
        }
        complex(){
                //default constructor
        };
        complex operator + (complex &c){
            complex result;
            result.real = real + c.real;
            result.img = img + c.img;
            return result;
        } //operator Overloading
        void display(){
            cout<<real<<"+"<<img<<"i"<<endl;
        }
};

int main()
{
    complex c1(2,5),c2(3,4);
    complex c3 = c1+c2;
    c3.display();
    return 0;
}