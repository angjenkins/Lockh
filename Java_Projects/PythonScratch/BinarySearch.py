'''
Created on May 19, 2015

@author: PremanandPeddachetty
'''

def binarysearch(searchlist,item):
    first = 0
    last  = len(searchlist)
    found = False
    while first <= last and not found:
            middle = (first + last) / 2
            
            if searchlist[middle] == item:
                found = True
            else:
                if item < searchlist[middle]:
                    last = middle - 1
                else:
                    first = middle + 1
            
    return found
