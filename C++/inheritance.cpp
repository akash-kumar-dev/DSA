#include<iostream>
using namespace std;

class A{
    public:
        void Afunc(){
            cout<<"Function of class A."<<endl;
        }
};

class B{
    public:
        void Bfunc(){
            cout<<"Function of class B."<<endl;
        }
};

class C : public A,public B {           //Multiple Inheritance
    public:
        void Cfunc(){
            cout<<"Function of class C."<<endl;
        }
};

int main()
{
    C test;
    test.Afunc();
    test.Bfunc();
    test.Cfunc();

    return 0;
}