#include <iostream>
#include<string>
using namespace std;
struct student
{
    string name;
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  getline(cin,s.name);
   cin>>s.roll>>s.marks;
  cout<<"\nStudent Details\n"<<"Name: "<<s.name<<"\nRoll: "<<s.roll<<"\nMarks: "<<s.marks;//Your code goes here
}