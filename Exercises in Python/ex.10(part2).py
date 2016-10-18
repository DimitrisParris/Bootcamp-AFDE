number=input("Give me a binary number:")
sum=[]
sumA=0
sumB=0
for i in num:
    if i == '0'
        
i=0
met=0
while met<=len(number):
    while number[i] == number[i+1]:
        if number[i-1]=='0':
                sumA+=1
                print(sumA)
        elif number[i-1]== '1':
                sumB+=1
                print(sumB)
        i+=1
    met+=1  
if sumA > sumB:
    print("Longest run was zeros with length:", sumA)
elif sumA > sumB:
    print("Longest run was ones with length:", sumB)
else:
    print("Longest run was the same for zeros and ones with length:", sumA)
