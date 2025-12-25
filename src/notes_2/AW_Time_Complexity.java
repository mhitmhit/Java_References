package notes_2;

public class AW_Time_Complexity {

}
/**
An asymptotic analysis of an algorithm's runtime looks at the question of how the runtime depends on 
the size of the problem. The analysis is asymptotic because it only considers what happens to the runtime as the 
size of the problem increases without limit; it is not concerned with what happens for problems of small size or, in 
fact, for problems of any fixed finite size. An asymptotic analysis is only a first approximation, but in practice, 
it often gives important and useful information.

Big O notation will always assume the upper limit where the algorithm will perform the maximum number of iterations
O(1): Constant time
O(N): Linear time
O(N²): Quadratic time
O(log(n)): Logarithmic time

we have mostly emphasized the correctness of programs. In practice, another issue is also important: efficiency.
There is a field of computer science dedicated to analyzing the efficiency of programs known as Analysis of Algorithms.
  The focus is on algorithms, rather than on programs as such, to avoid having to deal with multiple implementations of 
  the same algorithm written in different languages, 
  compiled with different compilers, and running on different computers.
One of the main techniques of analysis of algorithms is asymptotic analysis.
    The term "asymptotic" here means basically "the tendency in the long run, as the size of the input is increased."
    An asymptotic analysis is only a first approximation, but in practice, it often gives important and useful information.
Central to asymptotic analysis is Big-Oh notation. Using this notation, we might say, for example, that an algorithm has a 
running time that is O(n^2) or O(n) or O(log(n)).
Common Big O notations:

    O(1) : Constant time
    O(N) : Linear time
    O(N^2) : Quadratic time
    O(log(n)) : Logarithmic time




-----------Real-Life Big-O

Let’s assume I am standing at the front of a class of students, and one of them has my bag. Here are a few scenarios and 
ways in which I can find my bag, along with their corresponding order of notation.
O(n) — Linear Time:
Scenario: Only one student in my class who hid my bag knows about it.
Approach: I will have to ask each student individually in the class if they have my bag. If they don’t, I move on to ask 
the next student.
Worst-Case Scenario: In the worst case scenario, I will have to ask n questions.
public int findFirstIndexOfNumber(int number, int[] array) {
  for (int i = 0; i < array.length; i++) {
    if (array[i] == number) {
      return i;
    }
  }
  return -1;
}



O(1) — Constant Time
Scenario: The student who hid my bag is known to me.
Approach: Since I know Joe has my bag, I’ll directly ask him to give it to me.
public static String higherOrLower(int[] array) {
  if (array[array.length - 1] > array[0]) {
    return "Higher";
  } else if (array[array.length - 1] < array[0]) {
    return "Lower";
  } else {
    return "Neither";
  }
}



O(n²) — Quadratic Time:
Scenario: In the entire class, only one student knows on which student’s desk my bag is hidden.
Approach: I will start questioning each student individually and ask them about all the other students too. If I don’t 
get the answer from the first student, I will move on to the next one.
Worst-Case Scenario: In the worst case scenario, I will have to ask n² questions, questioning each student about other 
students as well.







O(log n) — Logarithmic time: (Halfing the data is a good indication that it is log n)
Scenario: Here, all the students know who has my bag but will only tell me if I guessed the right name.
Approach: I will divide the class in half, then ask: “Is my bag on the left side or the right side of the class?” Then 
I take that group and divide it into two and ask again, and so on.
Worst-Case Scenario: In the worst case, I will have to ask log n questions.
public int recursiveBinarySearch(int target, int[] array, int beginIndex, int endIndex) {
  int middleIndex = (int) Math.floor((beginIndex + endIndex)/2);
  if (array[middleIndex] == target) {
    return middleIndex;
  } else if (beginIndex > endIndex) {
    return -1;
  } else if (array[middleIndex] < target) {
    beginIndex = middleIndex + 1;
    return recursiveBinarySearch(target, array, beginIndex, endIndex);
  } else {
    endIndex = middleIndex - 1;
    return recursiveBinarySearch(target, array, beginIndex, endIndex);
  }
  
  return -1;
}








*/