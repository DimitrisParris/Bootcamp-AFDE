one=[]
two=[]
three=[]
a=[]
for i in range(3):
   n1=int(input('Enter a number with one digit: '))   
   a.append(n1)
   n2=int(input('Enter a number with two digits: '))
   a.append(n2)         
   n3=int(input('Enter a number with three digits: '))
   a.append(n3)

for i in range(9):          
    if len(str(a[i]))==1:
        one.append(a[i])
    elif len(str(a[i]))==2:
        two.append(a[i])
    else:
        three.append(a[i])
        
print("Enter numbers:",*a)    

    
for i in range(3):   
   print(" ",one[i],end="|")
print()
for i in range(3):
    print("",two[i],end="|")
print()
for i in range(3):
    print(three[i],end="|")
    
