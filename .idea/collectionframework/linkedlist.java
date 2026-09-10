import java.util.LinkedList;
public class linkedlist{
public static void main(String[] args){
LinkedList<Integer> list=new LinkedList<>();
list.add(10);
list.add(20);
list.add(30);
System.out.println(list);

}
}
/*These are the methods you should remember:

Method	              Purpose
add()	              Add element
add(index, value)	  Add at index
get(index)	          Get element
set(index, value)	  Change element
remove(index)	      Remove by index
contains()	          Check whether element exists
size()	               Number of elements
clear()	               Remove everything
isEmpty()	           Check if empty*/
//LinkedList mein index hota hai, lekin internally elements index ke basis par store nahi hote.

//Isi wajah se get(index) possible hai, but ArrayList ke comparison mein slow hai.
/*Index:    0    1    2    3
         [10] [20] [30] [40]
                    ↑
              direct access

ArrayList directly index 2 par ja sakti hai → O(1).

LinkedList:

[10] ⇄ [20] ⇄ [30] ⇄ [40]
 ↑       ↑       ↑
 0       1       2

Agar get(2) karoge, LinkedList ko nodes ke through travel karke 2nd index tak pahunchna padega → O(n).*/