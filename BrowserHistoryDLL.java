/*Project 2: Browser History using Doubly Linked List
Objective:
Implement a browser history system using a Doubly Linked List, where each node
represents a web page. Users can move forward and backward in the browsing
history, add new pages, and clear history.
Operations:
Visit Page: Add a new page at the end of the history.
Move Forward: Go to the next page.
Move Backward: Go to the previous page.
Clear History: Remove all pages from the history.
Display Current Page: Show the current page.*/

public class BrowserHistoryDLL
{
	Node head;    // start of history
    Node current;   // current page
	static class Node
	{
		String url;
		Node next;
		Node prev;
		
		Node(String url)
		{
			this.url=url;
			next=null;
			prev=null;
		}
	}
		//visit a page
		public void visitPage(String url)
		{
			Node new_node = new Node(url);
			if (head == null) 
			{
              head = new_node;
              current = new_node;
            }
			else
			{
				current.next=new_node;
				new_node.prev=current;
                current	= new_node;			
			}
			 System.out.println("Visited: " + url);
		}
		 // Move backward in history
        public void moveBackward() 
		{
           if (current != null && current.prev != null) 
		   {
            current = current.prev;
            System.out.println("Moved to previous page: " + current.url);
          } 
		  else 
		  {
            System.out.println("No backward page available.");
          }
        }
	 // Move forward in history
        public void moveForward() 
		{
          if (current != null && current.next != null) 
		  {
            current = current.next;
            System.out.println("Moved to next page: " + current.url);
          } 
		  else 
		  {
            System.out.println("No forward page available.");
          }
        }
		// Display the current page
        public void displayCurrentPage() 
		{
           if (current != null) 
		   {
             System.out.println("Current Page: " + current.url);
           } 
		   else 
		   {
             System.out.println("No page visited yet.");
           }
        }
		 // Clear history
        public void clearHistory() 
		{
           head = null;
           current = null;
           System.out.println("Browser history cleared.");
        }
		// Display all pages in history (forward & backward)
        public void displayHistory() 
		{
             if (head == null) 
			 {
               System.out.println("No history available.");
               return;
             }
             Node temp = head;
             System.out.println("\nFull Browser History:");
            while (temp != null) 
			{
              System.out.println(temp.url);
              temp = temp.next;
            }
        }
		// Main method 
    public static void main(String[] args) 
	{
        BrowserHistoryDLL history = new BrowserHistoryDLL();
        
        history.visitPage("www.google.com");
        history.visitPage("www.github.com");
        history.visitPage("www.openai.com");
        
        history.displayCurrentPage();
        
        history.moveBackward();
        history.displayCurrentPage();
        
        history.moveForward();
        history.displayCurrentPage();
        
        history.displayHistory();
        
        history.clearHistory();
        history.displayHistory();
    }	
	
}

/*D:\CDAC\ADS>javac BrowserHistoryDLL.java

D:\CDAC\ADS>java BrowserHistoryDLL
Visited: www.google.com
Visited: www.github.com
Visited: www.openai.com
Current Page: www.openai.com
Moved to previous page: www.github.com
Current Page: www.github.com
Moved to next page: www.openai.com
Current Page: www.openai.com

Full Browser History:
www.google.com
www.github.com
www.openai.com
Browser history cleared.
No history available.*/