# Java DSA Learning Repository

A comprehensive Java implementation repository for learning data structures, algorithms, and solving coding interview problems. This repo contains implementations of fundamental data structures, classic algorithms, and solutions to NeetCode problems organized by difficulty level.

## Table of Contents

- [Overview](#overview)
- [Repository Structure](#repository-structure)
- [Getting Started](#getting-started)
- [Contents by Category](#contents-by-category)
- [Data Structures](#data-structures)
- [Algorithms](#algorithms)
- [Interview Problems](#interview-problems)
- [How to Run](#how-to-run)
- [Learning Path](#learning-path)
- [Dependencies](#dependencies)

## Overview

This repository serves as a personal study guide for data structures and algorithms using Java. It includes:

- Implementations of core data structures (Arrays, LinkedLists, Stacks, Queues, HashMaps, TreeMaps, etc.)
- Classical sorting and algorithm implementations
- Technique-based problems (sliding windows, prefix sums, two pointers, etc.)
- LeetCode and NeetCode style interview problems
- Complete working examples with main() methods for immediate execution

The code is organized by topic, making it easy to navigate, study, and reference specific concepts.

## Repository Structure

```
java-disco/
├── arraylists/           ArrayList operations and exercises
├── arrays/               Array manipulation and array-based problems
├── sorting/              Sorting algorithms and implementations
├── stack/                Stack data structure problems
├── deque/                Double-ended queue operations
├── linkedlists/          LinkedList implementations and operations
├── hashmaps/             HashMap usage patterns and problems
├── hashsets/             HashSet operations and problems
├── treemaps/             TreeMap (sorted map) problems
├── treesets/             TreeSet (sorted set) problems
├── vector/               Vector collection usage and operations
├── sliding_windows/      Sliding window technique problems
├── prefix_sum/           Prefix sum technique problems
├── pyqs/                 Previous year question solutions
├── neetcode/             NeetCode interview problems
│   ├── easy/             Easy difficulty problems
│   └── medium/           Medium difficulty problems
├── .gitignore            Git configuration
└── README.md             This file
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed
- Basic command-line familiarity
- Text editor or IDE (IntelliJ IDEA, Visual Studio Code, Eclipse, etc.)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/maithilimukherjee/java-disco.git
   cd java-disco
   ```

2. Verify Java installation:
   ```bash
   javac -version
   java -version
   ```

## Contents by Category

### Data Structures

#### Collections Framework (java.util)

- **ArrayList** (`arraylists/`)
  - Dynamic array implementation practice
  - Common operations and use cases
  - Files: A1.java, A2.java, A3.java, A4.java

- **HashMap** (`hashmaps/`)
  - Key-value pair storage and retrieval
  - Collision handling
  - Frequency counting patterns

- **HashSet** (`hashsets/`)
  - Unique element storage
  - Set operations and queries

- **LinkedList** (`linkedlists/`)
  - Singly and doubly linked list implementations
  - Insertion and deletion operations

- **Stack** (`stack/`)
  - LIFO (Last-In-First-Out) data structure
  - Stack-based algorithm problems
  - Files: NextGreater.java, NextSmaller.java

- **Deque** (`deque/`)
  - Double-ended queue operations
  - Implementation and applications

- **TreeMap** (`treemaps/`)
  - Sorted key-value storage
  - Range queries and ordered operations

- **TreeSet** (`treesets/`)
  - Sorted unique element storage
  - Binary search tree implementation

- **Vector** (`vector/`)
  - Legacy dynamic array implementation
  - Comparison with ArrayList

### Algorithms

#### Sorting Algorithms

- **MergeSort** (`sorting/`)
  - Divide and conquer approach
  - Time complexity: O(n log n)
  - Space complexity: O(n)
  - Stable sort implementation

#### Array Algorithms

- **Array Rotation** (`arrays/`)
  - Rotating arrays by k positions
  - Different rotation approaches
  - File: RotateArray.java

### Technique-Based Problems

#### Sliding Window (`sliding_windows/`)

Problems that use a fixed or dynamic window moving through data:
- String matching problems
- Subarray/substring problems
- Optimal window finding

#### Prefix Sum (`prefix_sum/`)

Pre-computation technique for range queries:
- Range sum queries
- Subarray sum problems
- Two-dimensional prefix sum

## Interview Problems

### NeetCode Problems

#### Easy (`neetcode/easy/`)

1. **Anagrams.java**
   - Problem: Determine if two strings are anagrams
   - Approach: Character frequency counting with HashMap
   - Time Complexity: O(n)
   - Space Complexity: O(1) - fixed character set

2. **TwoSumMap.java**
   - Problem: Find two numbers that add up to a target
   - Approach: HashMap for complement lookup
   - Time Complexity: O(n)
   - Space Complexity: O(n)

3. **Dupes.java**
   - Problem: Detect duplicate elements in array
   - Approach: HashSet for duplicate detection
   - Time Complexity: O(n)
   - Space Complexity: O(n)

#### Medium (`neetcode/medium/`)

1. **GroupAnagrams.java**
   - Problem: Group strings by anagram groups
   - Approach: Sort characters as grouping key
   - Time Complexity: O(n * k log k) where k is average string length
   - Space Complexity: O(n * k)

2. **TopKFreq.java**
   - Problem: Find k most frequently occurring elements
   - Approach: Frequency map with heap/priority queue
   - Time Complexity: O(n log k)
   - Space Complexity: O(n)

### Previous Year Questions

The `pyqs/` directory contains solutions to frequently asked coding interview questions collected from various platforms and company coding rounds.

## How to Run

### Single File Execution

Each file contains a complete implementation with a main() method. Compile and run any file:

```bash
javac arrays/RotateArray.java
java arrays.RotateArray
```

### Compile Entire Directory

To compile all Java files:

```bash
javac arrays/*.java
javac sorting/*.java
javac neetcode/easy/*.java
javac neetcode/medium/*.java
```

### Example: Running NeetCode Problems

```bash
# Easy problems
javac neetcode/easy/Anagrams.java
java neetcode.easy.Anagrams
# Output will prompt for input or show sample execution

javac neetcode/easy/TwoSumMap.java
java neetcode.easy.TwoSumMap

javac neetcode/easy/Dupes.java
java neetcode.easy.Dupes

# Medium problems
javac neetcode/medium/GroupAnagrams.java
java neetcode.medium.GroupAnagrams
# Output: [[act, cat], [pots, tops, stop], [hat]]

javac neetcode/medium/TopKFreq.java
java neetcode.medium.TopKFreq
```

### Example: Running Sorting Algorithms

```bash
javac sorting/MergeSort.java
java sorting.MergeSort
# Output: Sorted array: 5 6 7 11 12 13
```

## Learning Path

### Beginner (Start Here)

1. Understand basic data structures
   - Arrays and ArrayLists
   - Basic operations on collections
   - Start with `arraylists/` and `arrays/`

2. Explore Collections Framework
   - HashSet and HashMap fundamentals
   - Practice with `hashmaps/` and `hashsets/`

3. Study Stack and Queue
   - LIFO behavior of stacks
   - FIFO behavior of deques
   - Study `stack/` and `deque/`

### Intermediate

1. LinkedList Implementation
   - Pointer manipulation
   - Insertion and deletion
   - Study `linkedlists/`

2. Sorting Algorithms
   - Merge Sort and other approaches
   - Time and space complexity analysis
   - Study `sorting/`

3. Technique-based Patterns
   - Sliding window approach
   - Prefix sum optimization
   - Study `sliding_windows/` and `prefix_sum/`

### Advanced

1. Interview Problem Solving
   - Easy NeetCode problems
   - Understand multiple approaches
   - Study `neetcode/easy/`

2. Optimization Techniques
   - Two-pointer technique
   - Hash maps for optimization
   - Study `neetcode/medium/`

3. Complex Data Structures
   - TreeMap and TreeSet
   - Sorted data structure operations
   - Study `treemaps/` and `treesets/`

## Dependencies

- Java Standard Library (java.util)
  - java.util.ArrayList
  - java.util.HashMap
  - java.util.HashSet
  - java.util.Stack
  - java.util.Deque
  - java.util.TreeMap
  - java.util.TreeSet
  - java.util.LinkedList
  - java.util.Arrays
  - java.util.Collections
  - java.util.Scanner

No external dependencies are required. All implementations use only the Java Standard Library.

## Key Concepts and Patterns

### HashMap Usage

HashMaps are frequently used for:
- Character/element frequency counting
- Complementary value lookup (e.g., Two Sum problem)
- Grouping and categorization

Example from Anagrams.java:
```java
HashMap<Character, Integer> maps = new HashMap<>();
for (char x : s.toCharArray()) {
    if (!maps.containsKey(x)) {
        maps.put(x, 1);
    } else {
        maps.put(x, maps.get(x) + 1);
    }
}
```

### Stack for Monotonic Problems

Stacks are used for:
- Finding next greater/smaller element
- Expression evaluation
- Depth-first traversal

Example from NextGreater.java:
Uses stack to efficiently find next greater element in O(n) time.

### Sorting for Grouping

Sorting characters in strings creates a canonical form for anagram grouping.

Example from GroupAnagrams.java:
```java
char[] chars = s.toCharArray();
Arrays.sort(chars);
String key = new String(chars);
```

## Code Style and Conventions

- Package names follow directory structure: `arrays`, `sorting`, `neetcode.easy`, `neetcode.medium`
- Class names are descriptive and problem-focused: `RotateArray`, `MergeSort`, `GroupAnagrams`
- Methods include clear logic with comments for complex sections
- Each file includes a working `main()` method with sample test cases
- Input/output is done via console for easy testing

## Tips for Using This Repository

1. Read the code thoroughly before running it
2. Understand the algorithm before memorizing the code
3. Trace through examples step by step
4. Modify the sample inputs to test edge cases
5. Try solving the problem yourself before looking at the solution
6. Compare your approach with the implemented solution
7. Analyze time and space complexity for each solution
8. Practice implementing variations of the same problem

## Contribution and Usage

This is a personal learning repository. Feel free to:
- Fork and adapt for your own learning
- Suggest improvements and optimizations
- Share alternative implementations
- Use as reference for your own studies

## Resources for Further Learning

- NeetCode (neetcode.io) - Interview problems and explanations
- LeetCode - Extensive problem practice platform
- GeeksforGeeks - Data structures and algorithms tutorials
- Java API Documentation - Official Java library documentation
- "Introduction to Algorithms" by Cormen, Leiserson, Rivest, and Stein

## Disclaimer

These implementations are for educational purposes. While they are correct and optimized, always understand the logic before using in production code. Test thoroughly with edge cases before deployment.

## License

This repository is open source and available for personal and educational use.

## Contact and Questions

If you have questions about any implementation or want to discuss alternative approaches, feel free to open an issue or fork the repository.

---

Last Updated: 2026
Repository: https://github.com/maithilimukherjee/java-disco
