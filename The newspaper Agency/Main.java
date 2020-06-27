#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
 	int w,x,y;
	int fc = 100;
	int profit;
	std::cin>>w>>x>>y;
	profit = ((w*x) -(y*w)) - fc;
	std::cout<<profit;
}