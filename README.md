# Data-Structure-Java

This repository contains following implementations of data structures using Java

## [Linked List](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/LinkedList/LinkedList_Element.java)

     Following operations are implemented for linked lists
         1 Add Elements to the list
         2 Add Elements at the end of the list
         3 Add Elements at given positions in the list
         4 Remove Elements from the list
         5 Remove Elements from the end of the list
         6 Remove Elements from the given positions in the list
         7 Reverse the list
         8 get head of the list
         9 check if the list is empty

### [Sort List](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/LinkedList/SortList.java)
    used merge sort algorithm to sort linked list

## [Stack](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/Stack/Stack_LinkedList.java)
    
     Following operations are implemented for Stack
         1 Add Element to Stack
         2 Remove Element from stack
         3 Check Whether stack is empty
         4 Return top element of stack

## [Queue](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/Queue/Queue_LinkedList.java)

     Following operations are implemented for Queue
         1 Insert an element to queue
         2 Remove Element from queue
         3 Check Whether queue is empty 

## [PriorityQueue](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/PriorityQueue/PriorityQueue.java)

     Following operations are implemented for PriorityQueue min/max
         1 Insert an element to PriorityQueue
         2 Remove Element from PriorityQueue
         3 Check Whether PriorityQueue is empty 
         4 Get min/max of the priorityQueue

## [Binary Search Algorithn](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/BinarySearch/BinarySearch.java)

## [Binary Search Tree](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/BST/BinarySearchTree.java)

     Following operations are implemented for BinarySearchTree
         1 Insert an element to BinarySearchTree
         2 Remove Element from Binary Search Tree
         3 Check Whether Binary Search Tree is empty 
         4 Get min of the Binary Search Tree
         5 Inorder Traversal of Binary Search Tree
         6 Get root of Binary Search Tree

## [Graph](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/Graph/Graph.java)

    Graph interface has following APIs
    1. Graph()     // creates an empty graph
    2. void addEdge(int v, int w)   // Add edge from v to w / w to v depending on whether the graph is directed or undirected
    3. ArrayList<Integer> adj(int v)   // returns all vertices adjacent to v
    4. int V()  // returns number of vertices
    5. int E()  // return number of edges

### [UndirectedGraph](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/Graph/UndirectedGraph.java)

    Undirected graph implements the Graph interface

### [DirectedGraph](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/Graph/DirectedGraph.java)

    Directed graph implements the Graph interface   
    The only different in directed and undirected graph is while adding an edge to graph

### [DepthFirstSearch](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/Graph/DepthFirstSearch.java)

    Display the depth first search traversal of graph

### [BreadthFirstSearch](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/Graph/BreadthFirstSearch.java)

    Display the Breadth first search traversal of graph

### [ConnectedComponents](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/Graph/ConnectedComponents.java)

    Count the number of connected components

### [StronglyConnectedComponents](https://github.com/nitr-dimple/Data-Structure-Java/blob/main/DataStructureUsingJava/src/main/java/edu/dimple/datastructure/Graph/StronglyConnectedComponents.java)

    Count the number of strognly connected components using Kosaraju-Sharir Algorithm