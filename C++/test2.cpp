#include<iostream>
using namespace std;

string isBalanced(string s) {
    int len = s.length();
    int count123 =0,count40 =0,count91 =0;
    int count125 =0,count41 =0,count93 =0;
    bool check = true;
    for(int i=0;i<len;i++){
        char t = s[i];
        int temp = (int)t;
        if(temp ==123){
            count123++;
        } else if(temp ==40){
            count40++;
        } else if(temp ==91){
            count91++;
        } else if(temp ==125){
            count125++;
        } else if(temp ==41){
            count41++;
        } else if(temp == 93) {
            count93++;
        }
    }
    if((count123 == count125 && count40 == count41) && count91 == count93){
        check = true;
    } else {
        check = false;
    }

    for(int i=0;i<len/2;i++){
        char t2 = s[i];
        int temp2 = (int)t2;
        if(temp2 ==125 || temp2 == 41 || temp2 == 93){
            check = false;
        }
    }
    if(check){
        return "YES";
    } else {
        return "NO";
    }

}

int main(){

    string s = "{(([])[])[]}";
    cout<<isBalanced(s);

    return 0;
}