#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char a[50],b[50];
  cin>>a>>b;
  if(strcmp(a,b)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}