import math
date1 = input("Give me date 1, in dd/mm/yyyy form:")
date2 = input("Give me date 2, in dd/mm/yyyy form:")
print (date1, date2)
def calcudate(date):
    am = date.split('/')
    d = int(am[0])
    m = int(am[1])
    y = int(am[2])
    c = 365*y + math.floor(y/4) - math.floor(y/100) + math.floor(y/400) + (306*m + 5)//10 + (d-1)
    return c
teliko1 = calcudate(date1)
teliko2 = calcudate(date2)
Meres = abs(teliko1 - teliko2)
print("Meres:", Meres)

