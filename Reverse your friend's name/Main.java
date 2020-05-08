#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
 string str;
  int i;
  getline(cin,str);
  for(i=str.size()-1;i>=0;i--)
    cout<<str[i];//Type your code here
}