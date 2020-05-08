#include<iostream>
using namespace std;
int main()
{
  int i,n,s,a[10],sum=0;//Type your code here.
  cin>>n>>s;
 for(i=0;i<n;i++)
 {   cin>>a[i];
  sum=sum+a[i];
 }
if(sum<=s)
  cout<<"YES";
else
  cout<<"NO";
}
  
