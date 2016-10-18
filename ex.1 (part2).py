number=input('Give TIN:')
num=str(number)
tax=num[:8]
neo=tax[::-1]
print(neo)
j=1
sum=0
for i in neo :
    sum+= (int(i))*(2**j)
    j+=1
print(sum)    
kati=sum%11
epis=kati%10
print(epis)
if epis == int(num[8]):
   print('Great, you are correct')
else:
    print('Something is wrong')
