# Book Store System
![img_3.png](img_3.png)
Here, I showed the possible exceptions that can occur when buying books:
1-When an invalid ISBN is entered
2-When a user tries purchasing a demo book (they are not for sale)
3-When the user tries to buy more paper books than the ones available in stock
![img_4.png](img_4.png)
Here, the user buys 2 books, it shows the ShippingService message and total and decreases this book's stock by 2
![img_7.png](img_7.png)
Here, the user buys 1 Ebooks, it shows the mailService message and total
![img_6.png](img_6.png)
Here, the user asks to remove books that are outdated by 4 years, so they are removed and a list of the removed books is returned and displayed.
![img_8.png](img_8.png)
As you can see here, I purchased two books of "IGCSE O Level Chemistry", while there were 3 in stock.
So, when I removed books that are older than 4 years, it displayed that it got removed and only 1 was left in stock.
This shows how stocks are reduced for paper books