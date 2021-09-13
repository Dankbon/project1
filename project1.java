public class project1 {
    public static void main(String[] args) {

        // While everything works correctly, I think the readability is a bit odd. It is
        // not bad in any way, but the words seem to
        // cluster together in a way that can make it a bit hard to read. Other than
        // that, great job, Tanner! I like the use of arrays for this project.

        boolean t = true;
        boolean f = false;
        boolean[] p = new boolean[] { t, t, f, f };
        boolean[] q = new boolean[] { t, f, t, f };
        System.out.print("p:             ");
        for (int i = 0; i < 4; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.print("\n" + "q:             ");
        for (int i = 0; i < 4; i++) {
            System.out.print(q[i] + " ");
        }
        boolean[] conjunction = new boolean[4];
        boolean[] disjunction = new boolean[4];
        boolean[] exclusiveOr = new boolean[4];
        boolean[] conditional = new boolean[4];
        boolean[] biconditional = new boolean[4];
        for (int i = 0; i < 4; i++) {
            if (p[i] == t && q[i] == t) {
                conjunction[i] = t;
                disjunction[i] = t;
                exclusiveOr[i] = f;
                conditional[i] = t;
                biconditional[i] = t;
            } else if (p[i] == t && q[i] == f) {
                conjunction[i] = f;
                disjunction[i] = t;
                exclusiveOr[i] = t;
                conditional[i] = f;
                biconditional[i] = f;
            } else if (p[i] == f && q[i] == t) {
                conjunction[i] = f;
                disjunction[i] = t;
                exclusiveOr[i] = t;
                conditional[i] = t;
                biconditional[i] = f;
            } else if (p[i] == f && q[i] == f) {
                conjunction[i] = f;
                disjunction[i] = f;
                exclusiveOr[i] = f;
                conditional[i] = t;
                biconditional[i] = t;
            }
        }
        System.out.print("\n" + "Conjunction:   ");
        for (int i = 0; i < 4; i++) {
            System.out.print(conjunction[i] + " ");
        }
        System.out.print("\n" + "Disjunction:   ");
        for (int i = 0; i < 4; i++) {
            System.out.print(disjunction[i] + " ");
        }
        System.out.print("\n" + "Exclusive or:  ");
        for (int i = 0; i < 4; i++) {
            System.out.print(exclusiveOr[i] + " ");
        }
        System.out.print("\n" + "Conditional:   ");
        for (int i = 0; i < 4; i++) {
            System.out.print(conditional[i] + " ");
        }
        System.out.print("\n" + "Biconditional: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(biconditional[i] + " ");
        }
    }
}
