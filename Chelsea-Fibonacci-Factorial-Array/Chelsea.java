import java.util.*;

public class Chelsea {
    public static Scanner scan = new Scanner(System.in);
    public static Random rand = new Random();
    public Chelsea(){}

    public static void ContinuePhrases(){
        String[] phrases =
                {"I'm so happy that you're stayed", "uwu we can conduct more time together", "yay what you want else"};
        for(int i = 0; i < 1; i++){
            int index = (int)(Math.random() * phrases.length);
            System.out.println(phrases[index] + " ");
        }
    }

    public static void FareWells(){
        String[] phrases =
                {"Good bye. Hope see ya later.", "See ya ;)", "Sayonara", "Adios friend", "Saw bol menim dosym c:"};

        for(int i = 0; i < 1; i++){
            int index = (int)(Math.random() * phrases.length);
            System.out.print(phrases[index] + " ");
        }
    }

    public static void PhrasesAnswer(){
        String[] phrases =
                {"That was interesting task and my answer is ", "It takes me several seconds and answer is ",
                        "Easy game, easy life. Answer is ", "Solution is easy, answer is simple. That's "
                };
        for(int i = 0; i < 1; i++){
            int index = (int)(Math.random() * phrases.length);
            System.out.print(phrases[index] + " ");
        }
    }

    public static void HelloPhrases(){
        String[] helloes =
                {"Hello. My name is Chelsea and i can help you to solve some tasks",
                        "Meow. Hahaha Joke. I'm Chelsea who can help you to solve some tasks and I'm not a cat :D ",
                        "Konichiwa. My name is Chelsea and I'm here to help you with solving some tasks",
                        "Ni Hao. Chelsea here. I will help you to solve some tasks"};
        for(int i = 0; i < 1; i++){
            int index = (int)(Math.random() * helloes.length);
            System.out.println(helloes[index] + " ");
        }
    }

    public static void Acquaintance(){
        System.out.println("(1)First task is Fibonacci number"); System.out.println("(2)Second task is Factorial number");
        System.out.println("(3)Third task: Create an integer array");
    }

    public static int fibonacci(int n){
        if(n == 0) return 0; if(n == 1) return 1; return  n = fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static int factorial(int num){
        if( num == 1) return 1; return num * factorial(num-1);
    }

    public static void Choose(){
        System.out.print("Write the number of task that you want to be solved: ");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                System.out.print("Write the index of number which you want to find in Fibonacci sequence: ");
                int n1 = scan.nextInt();
                PhrasesAnswer();
                System.out.println(fibonacci(n1));
                break;
            case 2:
                System.out.print("Write the number which factorial you want to find: ");
                int n2 = scan.nextInt();
                PhrasesAnswer();
                System.out.println(factorial(n2));
                break;
            case 3:
                IntegerArray();
                break;
        }
    }

    static void ArraySort(int[] arr, int id1, int id2) {
        int temp = arr[id1];
        arr[id1] = arr[id2];
        arr[id2] = temp;
    }

    public static void IntegerArrayContinue(){
        System.out.println("I can also sort this array :3 ");
        System.out.println("Do you want this to be sorted?!");
        System.out.println("(1)Yas");
        System.out.println("(2)Nope");
        int answer = scan.nextInt();
        switch(answer){
            case 1:
                Arrays.sort(array);
                System.out.println(Arrays.toString(array));
                break;
            case 2:
                System.out.println("Oki");
                break;
        }
    }
    public static int length1;
    public static int array[] = new int[length1];
    public static void IntegerArray(){
        System.out.println("What length it will be?");
        System.out.print("Write here: "); int length = scan.nextInt();
        int arr[] = new int[length];
        array = arr;
        System.out.println("Will you fill it by yourself or i can do it randomly");
        System.out.println("(1)Fill it by myself"); System.out.println("(2)Randomly");
        System.out.print("Write the answer here: "); int ans = scan.nextInt();
        length1 = length;
        switch(ans) {
            case 1:
                for(int i = 0; i < arr.length; i++){
                    System.out.print("Write the integer: "); arr[i] = scan.nextInt();
                }
                break;
            case 2:
                System.out.print("Write the range of number from 0 to ");
                int range = scan.nextInt();
                for(int i = 0; i < arr.length; i++){
                    arr[i] = rand.nextInt(range);
                }
                break;
        }
        System.out.println(Arrays.toString(arr));
        IntegerArrayContinue();
    }

    public static void Continue(){
        System.out.println("Do you want to continue?");
        System.out.println("(1)Yes");
        System.out.println("(2)No");
        int c = scan.nextInt();
        if(c == 1){
            InteractionContinue();
        }
        if(c == 2) FareWells();
    }
    public static void Interaction(){
        Face();
        HelloPhrases();
        Acquaintance();
        Choose();
        Continue();
    }

    public static void InteractionContinue(){
        ContinuePhrases();
        Acquaintance();
        Choose();
        Continue();
    }


    public static void Face(){
        System.out.println("░░░░░░░░░░▄");
        System.out.println("░░░░░░░░▄▐░▄▄█████▄▄");
        System.out.println("░░░░░░▄█████████████▄▀▄▄░▄▄▄");
        System.out.println("░░░░░█████████████████▄██████");
        System.out.println("░░░░████▐█████▌████████▌█████▌");
        System.out.println("░░░████▌█████▌█░████████▐▀██▀");
        System.out.println("░▄█████░█████▌░█░▀██████▌█▄▄▀▄");
        System.out.println("░▌███▌█░▐███▌▌░░▄▄░▌█▌███▐███░▀");
        System.out.println("▐░▐██░░▄▄▐▀█░░░▐▄█▀▌█▐███▐█");
        System.out.println("░░███░▌▄█▌░░▀░░▀██░░▀██████▌");
        System.out.println("░░░▀█▌▀██▀░▄░░░░░░░░░███▐███");;
        System.out.println("░░░░██▌░░░░░░░░░░░░░▐███████▌");
        System.out.println("░░░░███░░░░░▀█▀░░░░░▐██▐███▀▌");
        System.out.println("░░░░▌█▌█▄░░░░░░░░░▄▄████▀░▀");
        System.out.println("░░░░░░█▀██▄▄▄░▄▄▀▀▒█▀█░▀");
        System.out.println("░░░░░░░░░▀░▀█▀▌▒▒▒░▐▄▄");

    }
}
