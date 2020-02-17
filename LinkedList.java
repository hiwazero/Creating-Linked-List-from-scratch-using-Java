public class LinkedList{
 Node head;
 Node tail;
 int count;
 
 //determine whether the list is empty
 public boolean isEmpty(){
  return count == 0;
 }
 
  //output the list - ok
 public String toString(){
  StringBuffer sb = new StringBuffer();
  sb.append("{");
  Node p = head;
  while(p != null){
   sb.append(p.getItem() + " ");
   p = p.getNext();
  }
  sb.append("}");
  return sb.toString();
 }
 
 public void addFirst(int item){
  Node temp = new Node(item,head);
  if(isEmpty())
   tail = head = temp;
  else
  head = temp;
  count++;
 }
 
 public void addLast(int item){
  if(isEmpty())
    addFirst(item);
  else {
    Node newNode = new Node(item);
    tail.setNext(newNode);
    tail = newNode;
  count++;
  }
 }

 //find the length of the list
 public int getLength(){
   return count++; 
}
 
 //retrieve the item contained in the first node
 public int getFirstElement(){
  if(!isEmpty())
   return head.getItem();
  return 0;
 }
 
 //retrieve the item contained in the last node
 public int getLastElement(){
  if(!isEmpty())
   return tail.getItem();
  return 0;
 }
 //search the list for a given item
 public boolean searchElement(int item){
   boolean isFound = true; 
   Node p = head;
   while (p!=null){
      if (p.getItem()==item){
         isFound = true;
         break;
      }
      p=p.getNext();
      }
      
      return isFound;      
   }
 
 
 //add element
 public int getSum(){
   int sum = 0;
   Node p = head;
   while(p!=null){
      sum+= p.getItem();
      p = p.getNext();
   }
    return sum;
 }
 
 //insert an item in the list
 
 
 //delete an item from the list
 public void deleteItem(int item){
   Node p = head;
   Node prev = null;
   
   while(p!=null){
      if(p.getItem()==item){
         if (prev==null)
         head = p.getNext();
         else
         prev.setNext(p.getNext());
      }
      else
      prev = p;
      p = p.getNext();
   }
 }


 public int getSmallest(){
   int small = 0;
   Node p = head;
   
   if(!isEmpty()){
   small = p.getItem();
   while(p!=null){
      if (p.getItem()<small){
         small = p.getItem();
         }
      p = p.getNext();
   }  
   }
   return small;  
}
 
 public int getLargest(){
   int large = 0;
   Node p = head;
   if(!isEmpty()){
     large = p.getItem();
       while (p!=null){
          if(p.getItem()>large){
             large = p.getItem();
          }
     p = p.getNext();
      }   
   } 
    return large;
   }

 public int sumOfEven(){
   int sum=0;
   Node p = head;
     while(p!=null){
     if(p.getItem()%2==0){
      sum+= p.getItem();
     } 
     p = p.getNext();
   }
      return sum;
 }

 //simple multiply the element with 2
   public void twiceItem(){
     Node p = head;
     int temp = 0;
      while(p!=null){
        temp = p.getItem()*2;
        p.setItem(temp);
        p = p.getNext();
      }
   }
   
 public static void main(String [] args){
  LinkedList list = new LinkedList();
  list.addFirst(5);
  list.addFirst(6);
  list.addFirst(7);
  list.addFirst(8);
  list.addLast(0);
  list.deleteItem(8);

  System.out.println("list contains: " + list);
  System.out.println("The first element is :  " + list.getFirstElement());
  System.out.println("The last element is :  " + list.getLastElement());
  System.out.println("Search: "+list.searchElement(5));
  System.out.println("Sum is: "+list.getSum());
  System.out.println("Smallest is: "+list.getSmallest());
  System.out.println("Largest is: "+list.getLargest());
  System.out.println("Sum of Even Number is: "+list.sumOfEven());
  list.twiceItem();
  System.out.println("List contains after doubling: "+list);
 }
}
 
 
