#include<iostream>
using namespace std;

class base{
    public:
        virtual void print(){
            cout<<"base class print func."<<endl;
        }
        virtual void display(){
            cout<<"base class displat func."<<endl;
        }
};

class derived{
    public:
        void print(){
            cout<<"derived class print func."<<endl;
        }
        void display(){
            cout<<"derived class displat func."<<endl;
        }
};

int main(){
    base *btest;
    derived dtest;
    btest = &dtest;
    btest->print();
    btest->display();
    return 0;
}