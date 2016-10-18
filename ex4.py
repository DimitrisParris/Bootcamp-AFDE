import math

ca_a = input("Give me a: ")
ca_b = input("Give me b: ")
ca_c = input("Give me c: ")
a, b, c = int(ca_a), int(ca_b), int(ca_c)
d = b*b - 4 * a * c

if d < 0:
    print("No solutions")
elif d == 0:
    print ("double solution", -b / (2*a))
else:
    print("Positive discreminateso x1=", (-b+math.sqrt(d))/(2*a), "and x2=" ,(-b-math.sqrt(d))/(2*a) )
