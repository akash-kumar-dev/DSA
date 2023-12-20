#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
        cin>>arr[i];
    
    int arr2[n];
    for(int i=0;i<n;i++){
        if(arr[i]<0){
            arr2[i]=-arr[i];
            continue;
        }
        arr2[i]=arr[i];
    }

    int min = arr2[0];
    for(int i=0;i<n;i++){
        if(min>arr2[i])
            min=arr2[i];
    }

    cout<<min;

    return 0;
}