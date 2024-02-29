package Recursion;

public class InviteGuest {
    public static void main(String[] args) {
        System.out.println(printWaysToInvite(4));
    }

    static int printWaysToInvite(int n) {

        // Base case: If there is only one person, there is only one way to invite guests
        if (n <= 1) {
            return 1;
        }

        // Calculate the number of ways to invite the remaining (n-1) people individually
        int single = printWaysToInvite(n - 1);

        // There are (n-1) ways to choose a pair from (n-1) people
        // For each pair, recursively calculate the number of ways to invite the remaining (n-2) people
        int pair = (n - 1) * printWaysToInvite(n - 2);

        // Return the total number of ways to invite guests (sum of individual invitations and paired invitations)
        return single + pair;
    }
}


/*

I/P--->4
OP--->
        Pair (1, 2) and Pair (3, 4)
        Pair (1, 3) and Pair (2, 4)
        Pair (1, 4) and Pair (2, 3)
        Pair (2, 3) and Pair (1, 4)
        Pair (2, 4) and Pair (1, 3)
        Pair (3, 4) and Pair (1, 2)
        Pair (1, 2) and Single, Single, Single
        Pair (1, 3) and Single, Single, Single
        Pair (1, 4) and Single, Single, Single
        Pair (2, 3) and Single, Single, Single

*/
