#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	string fnum,flo;
	cin>>fnum;
  int found;
  found=fnum.find(".");
  if(found>=0)
  {
  for(int i=found+1;i<fnum.size();i++)
    flo += fnum[i];
  cout<<"Floating part is : "<<flo;
  }
  else
    cout<<"Floating part is : ";
    
}