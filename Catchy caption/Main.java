#include<iostream>
#include<string>
using namespace std;
int main ()
{
    string a;
    int count = 0, i; 
    getline(cin,a);
    for (i = 0; a[i] != '\0';i++)
    {
        if (a[i] == ' ')
            count++;    
    }
   if(count+1<=10)
     cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
}