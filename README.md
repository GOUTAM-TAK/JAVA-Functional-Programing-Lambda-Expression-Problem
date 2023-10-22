# JAVA-Functional-Programing-Lambda-Expression-Problem
Menu driven program based on following funtionality
Enter choice:                                "1)Publish New Book\n"
                                                +" 2)Publish New Tape \n "
						+ "3)List all books publications order by publish date in desc\n"
						+ "4)List Top 5 Publication of Current year based on Ratings \n "
						+ "5) Remove all Publications which are 5 Years old\n 0)Exit");
Condition - 1)Publisher can publish only one time(not duplicate publisher allowed)

Classes -       1)Publisher Class (super Class)
                2)Book Class (extends from Publish[is-a relationship]
                3)Tape Class(extends from Publish[is-a relationship]
                
Reference - only Publish class ref. create [both Book and Tape instances are refer by only Publish Class reference]

HighLights of this Program -                   1)Collection Frame Work use[Hash Map]
                                               2)Use Functional-Programing [Lambda Expression, High Order Method, Functional Interface]
                                               3)Stream API use
                                               4)Natural Ordering and Custom Ordering [date wise order, Rating wise order]
                                               5)Custom Exception Handling 
                                               6)Run Time Polymorphisim	
