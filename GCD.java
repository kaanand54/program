	
//I've used Euclid's algorithm to find the greatest common divisor of two numbers

//it can be iterated to obtain the GCD of a larger set of numbers.

private static long gcd(long a, long b)
{
    while (b > 0)
    {
        long temp = b;
        b = a % b; // % is remainder
        a = temp;
    }
    return a;
}

private static long gcd(long[] input)
{
    long result = input[0];
    for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
    return result;
}
