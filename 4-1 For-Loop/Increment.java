public class Increment {
    public static void main(String[] args) {

        int n = 5;

        System.out.println(n++);
        System.out.println(n);
        System.out.println(++n);

    }
}

/*
Output: 
    n++:5
    n:6
    ++n:7 

Explaination:
    n is initialized to 5
    n++: prints 5 first, then n becomes 6.
    n: is now 6, so 6 is printed.
    ++n: increments n to 7 first, then prints 7.
*/