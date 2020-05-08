#include<iostream>
using namespace std;
int main()
{
  int n,a[20],e=0,o=0;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
    cin>>a[i];//Type your code here.
if(a[i]%2==0)
  e++;
    else
      o++;
   }
  if(e==n)
    cout<<"The array is Even";
  else if(o==n)
    cout<<"The array is Odd";
  else
    cout<< "The array is Mixed";
}