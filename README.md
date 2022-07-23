# DSA-Problem

### DSA problem and Solution
* Q1 Simple Print Hello from User Input by taking Scanner Scanner class package Beleogs to java.util.Scanner
* Q2. check prime Number and Print all Prime Number In Between range of 1 to n.

* Q3. Array problem 
    *   Array opertion Itrrate Array data 
    *   sum,avg
    *   Finding  searching elements 
        *   1st Approch is Brute froce *searching one by one elements in array list if elements is match then return this elements 
        
                 Approch this Approched time compelxity is O(n) 
                Ex::[1,4,6,8,9] this is array and 1,4,6,8,9 is elements in 
                Array 
                    finding the 6 elements Is Presents or Not 
                step 1. tring to go one by one elements in Array list if elements is Match then return True Other Wise return false

                Worst time complexity is O(n) beacuse if Finding Last elements in array then goning one by one last Postion 

        *   2nd Approchec by using Binary searched 
                
                in Binary search apporched 
                    
                    Binary Search vaild for Sorting Element not Working for unsorted

                    If Sorted List then finding mid Elemets and taking Two pointer Firts From index 0 and ither From Last Index 

                    After That finding mid Elements and commparing mid elements and Which elements Search in List
                        if mid term Is Grater Than  elements then last Index Pointer is chaged to Mid ,after That finding agin mid term(First+last)Index first Index and Last Index will update according

                        if mid term is less than elements ,then Fist Index Pionter will update to mid and Last index   elements same after That finding agin mid term(First+last)Index first Index and Last Index will update according

                        if mid term index is Equal to searching elements then return true;

                        other wise fasle:

                        timie complexity is O(logn)
                        


