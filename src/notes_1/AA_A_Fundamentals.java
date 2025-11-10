 package notes_1;

public class AA_A_Fundamentals {

//	OS is software that communicates between computer hardware and allows programs to run.
//	Process: a program in execution. process states: start, ready, running, waiting, terminated, Exit. (depending on the OS).
//	Thread: flow of execution within a process. threads share process resources but have their own stack, registers, and program counter.
//	Scheduling: process manager chooses which process to load/unload into cpu.
//  Memory Management: Memory management is the process of managing computer memory, which includes allocating and deallocating memory spaces as needed by programs.



//Java is a high-level, compiled, strongly typed (OOP) language.

//Classes are the blueprints for how to create objects. They are characterized by state and behavior.
//
//Objects are instances of class definitions.
	
//The Java Language Specification involves:
//    Syntax (grammar)
//    Semantics (meaning)
	
//	Compilation means transforming a program written in a high-level programming language from source code into object code.
//	Source code must go through several steps before it becomes an executable program.
//	    The first step is to pass the source code through a compiler, which translates the high-level language instructions into object code.
//	    The final step in producing an executable program — after the compiler has produced object code — is to pass the object code through a linker. 
//	    The linker combines modules and assigns real values to all symbolic addresses, thereby producing machine code.
//
//	Java, being a platform-independent programming language, doesn’t just have a single compilation step. Instead, it involves a two-step execution:
//	    The first step is through an OS-independent compiler.
//	    The second is in a virtual machine (JVM), which is custom-built for every operating system.

//	Programs that are written in Java are executed using the Java Virtual Machine (JVM). The JVM is a special program that knows how to execute the programs you write in Java.
//
	
	
	
	
	
	
	
	
	
	
	
//	The Java Virtual Machine is able to run our code because it runs our compiled bytecode. This is unique as it does this in a virtual environment that is the same across every platform. 
//	This is known as Write Once, Run Anywhere (WORA). However, the JVM that you use is specific to your operating system.
//
//	In order to run our code, it has something in it called the Just-In-Time Compiler (JIT). The JIT converts your bytecode into machine code, in most instances on a line-by-line basis.
//
//	Thus, programs in Java are technically compiled twice.
//
//	To run Java code, you also need a Java Runtime Environment (JRE), which contains all the runtime libraries that your code will be calling and using. The JRE contains the JVM within it, 
//	so if you want to run a Java program, all you need to install is the JRE.
//
//	But how do we actually compile the Java code that we write into bytecode that the JVM will understand? For that, you need a JDK - Java Development Kit, which provides developer tools like a 
//			compiler, debugger, documentation tools, and other command-line utilities. The JDK also includes a JRE, so if you install a JDK, you can compile your Java code as well as execute it.
//	This diagram illustrates how these components work together:
//
//	Image of JDK
//
//	Step 1: The developer writes the source code that the JDK compiles into bytecode.
//
//	Step 2: The JVM processes the bytecode line by line using the JIT.
//
//	Step 3: Finally, the JIT compiler turns the bytecode into machine code line by line.
//	Phases of the Process
//
//	    Compile time: This is when source code is converted at one time to bytecode.
//	    Runtime: This is when Java uses the JIT. The bytecode that the developer wrote is then turned into instructions for the JVM to execute.
//
//	Recap
//
//	The JDK contains tools for Java development as well as the JRE. The JRE contains the JVM, which actually executes the Java bytecode and runs it on the specific operating system on which it is installed.


//	A Java Development Kit (JDK) is used to create Java code.
//	The Java code is then compiled into bytecode for a particular Java Runtime Environment (JRE).
//	The JRE runs the bytecode in a Java Virtual Machine (JVM), which is specific to the machine and operating system.
//	Since every machine can implement its own JREs and JVMs, Java source code does not have to be rewritten to be machine-specific. This is known as Write Once, Run Anywhere (WORA).

	
//	"Hello, World!" programs are used to illustrate how the process of coding works, especially for introductory programmers.
//	Sometimes, more experienced programmers use "Hello, World!" programs as a "sanity test" to make sure the components of a language have been correctly installed.
//	"Hello, World!" can also be used to compare the executable file sizes of different programs.
//	The "Hello, World!" program has been implemented in nearly every programming language.
	
//	The Java main method is the entry point of any Java program.
//	The main method can also accept parameters that can be passed to the method during runtime.
//	
//	
//	Java is statically typed, meaning that when a variable is declared in Java, the type must be specified.
//	There are 8 primitive data types.
//	
//	
//	Primitive types are defined by the language itself and are stored directly in variables.
//	
//	Saying     	Primitive type   	Size      	Data type Usage    
//	bitter 	boolean 	1-bit 				true and false values
//	black 	byte 		1 byte (8 bits) 	numerical values
//	coffee 	char 		2 bytes (16 bits) 	1 character
//	sure 	short 		2 bytes (16 bits) 	numerical values
//	is 		int 		4 bytes (32 bits) 	numerical values
//	for 	float 		4 bytes (32 bits) 	floating-point value
//	long 	long 		8 bytes (64 bits) 	numerical values
//	days 	double 		8 bytes (64 bits) 	floating-point value	
	
	
//	There are different types of operators in Java:
//
//	    Arithmetic operators (+, -, *, /, %)
//	    Logical operators (&&, ||, !)
//	    Comparison operators (>, <, ==, >=, <=, !=)
//	    Assignment operators (=, +=, -=, *=, /=, %=)
//	    Increment and decrement operators (++, --). Postfix we first use the variable then increment/decrement. Prefix we first increment/decrement then use the variable.
//	    Ternary operators

	    
	    
	    
//	Debugging is a multi-step process in software development that involves identifying, isolating, and fixing code errors.
//	The main steps of debugging include identifying the problem, reproducing the issue, isolating the source, implementing a fix, and testing the revised implementation.
//	Various techniques are used in debugging, such as using print statements, interactive debugging tools, automated tests, and code reviews.
//	Effective debugging practices include compiling/running code frequently, using comments strategically, applying binary search for complex errors, and seeking help when needed.
//	The debugging process is often iterative and requires patience, systematic thinking, and sometimes creative problem-solving skills.    
	
	
//	Troubleshooting is a process that helps people identify issues or problems occurring in a system.
//	Troubleshooting tends to exist at a higher level than debugging and applies to many components of a system.
//	It is a process of parsing out the items that are causing problems.
	
	
	
} // end of class
