# Objective:
Implement a browser history system using a Doubly Linked List, where each node
represents a web page. Users can move forward and backward in the browsing
history, add new pages, and clear history.
# Operations:
Visit Page: Add a new page at the end of the history.
Move Forward: Go to the next page.
Move Backward: Go to the previous page.
Clear History: Remove all pages from the history.
Display Current Page: Show the current page.
# Suggested Methods:
visitPage(String url)
moveForward()
moveBackward()
clearHistory()
displayCurrentPage()
# Output
D:\CDAC\ADS>javac BrowserHistoryDLL.java

D:\CDAC\ADS>java BrowserHistoryDLL

Visited: www.google.com
Visited: www.github.com
Visited: www.openai.com

Current Page: www.openai.com

Moved to previous page: www.github.com

Moved to next page: www.openai.com

Full Browser History:

www.google.com

www.github.com

www.openai.com

Browser history cleared.

No history available.
