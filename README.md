Java Assignment Questions 

Question 1 
Tree Product
Given a complete binary tree with the height of H, we index the nodes respectively top-down and left-right from 1. The i-th node stores a positive integer Vi. Define Pi as follows: Pi=Vi if the i-th node is a leaf, otherwise Pi=max(Vi*PL, Vi*PR), where L and R are the indices of the left and right children of i, respectively. Your task is to caculate the value of P1.

Input
There are several test cases (fifteen at most), each formed as follows:

The first line contains a positive integer H (H ≤ 15).
The second line contains 2H-1 positive integers (each having a value of 109 at most), the i-th integer shows the value of Vi.
The input is ended with H = 0.
Output
For each test case, output on a line an integer which is the respective value of P1 found, by modulo of 1,000,000,007.


QUESTION 2

Food Costs
You're a bit all over the place as a college student. You used to eat out at expensive restaurants almost every day until your parents gave you a talking-to about being irresponsible. Now, you've got to control your eating and spending habits.

So, here's the plan: you'll stick to the college mess for your meals every day, except Sundays. On Sundays, you're treating yourself to those fancy restaurant meals.
The cost is Rs. X for the mess food each day, and Rs. Y for the restaurant splurges.

Now, what's the cost of food per week? Note that you don't have to pay for the mess on Sundays.
A week has seven days, as usual.

Input Format
The first and only line of input contains 2 space-separated integers, 

X and Y.
Output Format
Output a single integer: the weekly cost of food.

Constraints
1≤<≤10001≤X<Y≤1000


QUESTION – 3

Chef and Red Black Tree
Read problems statements in Mandarin Chinese and Russian.
Chef likes trees a lot. Today he has an infinte full binary tree (each node has exactly two childs) with special properties. Chef's tree has the following special properties :

Each node of the tree is either colored red or black.
Root of the tree is black intially.
Both childs of a red colored node are black and both childs of a black colored node are red.
The root of the tree is labelled as 1. For a node labelled v, it's left child is labelled as 2*v and it's right child is labelled as 2*v+1.

Chef wants to fulfill Q queries on this tree. Each query belongs to any of the following three types:

Qi Change color of all red colored nodes to black and all black colored nodes to red.
Qb x y Count the number of black colored nodes on the path from node x to node y (both inclusive).
Qr x y Count the number of red colored nodes on the path from node x to node y (both inclusive).
Help chef accomplishing this task.
Input
First line of the input contains an integer Q denoting the number of queries. Next Q lines of the input contain Q queries (one per line). Each query belongs to one of the three types mentioned above.
Output
For each query of type Qb or Qr, print the required answer.
Constraints
1<=Q<=105 1<=x,y<=109
Scoring
Subtask #1: 1<=Q<=100 1<=x,y<=1000   : 27 pts
Subtask #2: 1<=Q<=103 1<=x,y<=105     :  25 pts
Subtask #3: 1<=Q<=105 1<=x,y<=109     :  48 pts
