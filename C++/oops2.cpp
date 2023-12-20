#include<iostream>
using namespace std;

class student {
    private:
        string name;
    public:
        int age;
        int roll_no;

        void set_name (string s) {
            name = s;   //Accessing private attributes
        }

        //constructor

        student () {
            cout<<"Default constructor"<<endl;
        }
        student (string s,int a,int roll) {
            cout<<"parameterised constructor"<<endl;
            name = s;
            age = a;
            roll_no = roll;
        } //parameterised constructor

        student (student &st) {
            cout<<"copy constructor"<<endl;
            name = st.name;
            age = st.age;
            roll_no = st.roll_no;
        }//copy constructor

        //Destructor

        ~student () {
            cout<<"Destructor called"<<endl;
        }

        //Operator overloading

        bool operator == (student &a) {
            if(name==a.name && age==a.age && roll_no==a.roll_no)
                return true;
            return false;
        }

        void print_info() {
            cout<<"name : "<<name<<endl;
            cout<<"age : "<<age<<endl;
            cout<<"Roll No. : "<<roll_no<<endl;
        }
};

int main()
{
    //student s[2];
    /*for (int i=0;i<2;i++) {
        string temp;
        cin>>temp;
        s[i].set_name (temp); //Accesing private attributes by function call
        cin>>s[i].age;
        cin>>s[i].roll_no;
    }

    for (int i=0;i<2;i++) {
        s[i].print_info();
    }*/

    student a ("Akash",18,23006);
    //a.print_info();
    student b;
    student c = a;

    if(c==a)
        cout<<"same"<<endl;
    else
        cout<<"not same"<<endl;
    return 0;
}