# LinkedList-based Book Shelf Application
A Java application for managing a collection of books, built using a custom LinkedList implementation. The program allows users to interactively add, display, find, and remove books, leveraging a lightweight and customizable data structure.

## Features
Add Books: Input and add books with details like title, author, and ISBN to the shelf.
Display Books: View all books in the shelf in a formatted list.
Remove Book: Remove the first book from the shelf.
Find a Book: Search for a book by its position in the list.
Duplicate Check: Avoid adding duplicate books to the collection.

## Prerequisites

To run this application, ensure you have the following installed:

Java Development Kit (JDK) version 8 or higher
A compatible IDE such as IntelliJ IDEA, Eclipse, or NetBeans (optional)
Installation

####
# Application Structure
## Main Class: BookShelfLinked
Purpose: Serves as the entry point for the application and provides book management features.
Key Methods:
inputBooks(): Prompts the user to add multiple books to the shelf.
displayBooks(): Displays the list of all books.
removeFirstBook(): Removes the first book from the shelf.
findABook(): Finds a book by its position in the shelf.
## Supporting Classes
Book

Represents a book with the following attributes:
title: The book's title
author: The author's name
isbn: The book's unique identifier
Includes a toString() method for formatted display.
LinkedList

A custom implementation of a singly linked list with methods for adding, removing, and searching for elements.
Key methods:
add(): Adds an element to the end of the list.
remove(): Removes and returns the first element.
contains(): Checks if an element is already in the list.
get(): Retrieves an element by index.
LinearNode

Defines a node in the linked list, storing:
element: The book object.
next: A reference to the next node.

## How to Use
Launch the Application: Run the BookShelfLinked class.
Add Books:
Enter details for each book (title, author, ISBN) when prompted.
The program will notify you if a duplicate is detected.
Display Books:
The entire book list is displayed after each operation.
Remove the First Book:
The first book in the list is removed, and the updated list is displayed.
Find a Book:
Specify the position of a book to retrieve its details.

## Contact
For any questions or suggestions, please contact:

Name: s.donnelly
Email: c23302301@mytudublin.ie
GitHub: shand1541
