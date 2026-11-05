# Java DSA Learning Repository

A personal Java-based study repository focused on mastering data structures, algorithms, and common coding interview problems.

This project is designed for hands-on learning: each topic is grouped into its own folder, and most solutions include a `main()` method so you can compile and run them immediately.

## Why this repository?

- Learn core Java data structures and their use cases
- Practice algorithmic thinking with common interview patterns
- Build confidence with short, executable examples
- Use the repository as a reference for revision and interview prep

## Repository Structure

```text
java-disco/
├── arraylists/           ArrayList practice problems and examples
├── arrays/               Array manipulation and patterns
├── sorting/              Sorting algorithms
├── stack/                Stack-based problems
├── deque/                Deque usage and examples
├── linkedlists/          Linked list implementations and operations
├── hashmaps/             HashMap patterns and use cases
├── hashsets/             HashSet examples and exercises
├── treemaps/             TreeMap examples
├── treesets/             TreeSet examples
├── vector/               Vector operations and comparisons
├── sliding_windows/      Sliding window problems
├── prefix_sum/           Prefix sum pattern problems
├── pyqs/                 Previous year questions and solutions
├── neetcode/             Interview problem sets
│   ├── easy/
│   └── medium/
├── .gitignore
├── README.md
└── LICENSE (if present)
```

## Topics Covered

### Data Structures
- Arrays
- ArrayList
- LinkedList
- Stack
- Deque
- HashMap
- HashSet
- TreeMap
- TreeSet
- Vector

### Algorithms and Patterns
- Sorting algorithms
- Rotation and array problems
- Sliding window
- Prefix sum
- Frequency counting
- Two-pointer and map-based optimization techniques

### Interview Problems
- NeetCode-style questions
- Easy and medium difficulty practice
- Common company/exam problem patterns

## Getting Started

### Prerequisites
- JDK 8 or newer
- Terminal or IDE such as IntelliJ IDEA, VS Code, or Eclipse

### Clone the repository

```bash
git clone https://github.com/maithilimukherjee/java-disco.git
cd java-disco
```

### Check Java installation

```bash
javac -version
java -version
```

## Running Examples

Each file is designed to be run independently.

### Single file example

```bash
javac arrays/RotateArray.java
java arrays.RotateArray
```

### Compile a folder

```bash
javac arrays/*.java
javac sorting/*.java
javac neetcode/easy/*.java
javac neetcode/medium/*.java
```

### Example: running NeetCode files

```bash
javac neetcode/easy/Anagrams.java
java neetcode.easy.Anagrams

javac neetcode/medium/GroupAnagrams.java
java neetcode.medium.GroupAnagrams
```

## Learning Path

### Beginner
1. Start with arrays and ArrayLists
2. Learn HashMap and HashSet usage
3. Practice stack and deque problems

### Intermediate
1. Study linked lists and trees
2. Work through sorting algorithms
3. Practice sliding window and prefix sum patterns

### Advanced
1. Solve NeetCode easy/medium problems
2. Analyze time and space complexity
3. Revisit optimization techniques and edge cases

## Key Concepts

### HashMap
HashMap is heavily used for:
- Count frequencies
- Store complement values for two-sum style problems
- Group items by category or key

### Stack
Stacks are useful for:
- Next greater/next smaller problems
- Expression evaluation
- Monotonic stack patterns

### Sorting
Sorting is frequently used to normalize data before grouping or comparison, especially for anagram-based problems.

## Code Style

- Files are organized by concept and directory
- Class names are descriptive and problem-focused
- Methods are written with readability in mind
- Example inputs are included in each file's `main()` method

## Useful Practice Tips

- Read the logic before copying code
- Try solving each problem without looking at the implementation
- Run examples with custom inputs to test edge cases
- Compare multiple approaches and analyze complexity

## Contribution

This repository is primarily for personal learning, but improvements, suggestions, and alternative solutions are welcome.

## Resources

- NeetCode
- LeetCode
- GeeksforGeeks
- Java Documentation
- Introduction to Algorithms

## License

This project is intended for educational and personal use.

---

Last Updated: 2026
Repository: https://github.com/maithilimukherjee/java-disco
