#include<iostream>
using namespace std;
int main()
{
  int e=0,o=0,n,a[15];
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  if(a[i]%2==0)
  e=e+a[i];
    else
      o=o+a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<e<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<o;
  
}