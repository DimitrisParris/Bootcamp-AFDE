import math
a=input("give me the a:")
b=input("give me the b:")
c=input("give me the c:")
d=int(a)+int(b)+int(c)
e=(-1)*(int(a))+int(b)+int(c)
f=int(a)+(-1)*int(b)+int(c)
g=int(a)+int(b)+(-1)*int(c)
A = (1/4)*math.sqrt(d*f*e*g)
print(A)
