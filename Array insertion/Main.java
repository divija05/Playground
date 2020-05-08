#include<iostream>
using namespace std;
int main()
{
  int n,a[20],l,v;//Type your code here.
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  cout<<"Enter the elements in the array"<<"\n";
  for(int i=0;i<n;i++)
  cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  cin>>l;
  if(l>n)
    cout<<"Invalid Input";
    else
    {
       cout<<"Enter the value to insert"<<"\n";
  cin>>v;
  int k;
      a[n]=a[n-1];
  k=a[l-1];
      for(int i=0;i<=n;i++)
  {
  if(i+1==l)
  {
    a[i]=v;
    a[l]=k;
   for(int j=l+1;j<=n;j++)
   {
     a[j+1]=a[j];
  }
    break;
 }
}
      cout<<"Array after insertion is \n";
  for(int i=0;i<=n;i++)
  cout<<a[i]<<"\n";
}
}