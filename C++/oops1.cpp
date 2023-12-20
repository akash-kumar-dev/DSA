#include<iostream>
using namespace std;

class student {
    public:
        string name;
        int age;
        int roll_no;

        void print_info() {
            cout<<"Name : "<<name<<endl;
            cout<<"Age : "<<age<<endl;
            cout<<"ROll No. : "<<roll_no<<endl;
        }
};

int main()
{
    student s[2];
    for(int i=0;i<2;i++) {
        cin>>s[i].name>>s[i].age>>s[i].roll_no;
    }

    for(int i=0;i<2;i++) {
        s[i].print_info();
    }

    return 0;
}