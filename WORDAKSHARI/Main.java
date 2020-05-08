#include<iostream>
#include<string>
using namespace std;
int main()
{
  string a,b;
  cin>>a;
  while(a!="####")
  {
    cin>>b;
    if(a.at(a.size()-1)==b.at(0))
    {
      cout<<a<<"\n";
      a=b;
    }
    else
      break;
  }  cout<<a;
  
}