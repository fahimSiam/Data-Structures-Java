public class Stack {
    public Stack() {

    }

    Node head;
    char[] a = new char[10];
    int s = 0;
    boolean b = false;

    public void arrayStack(String input) {

        for (int x = 0; x < input.length(); x++) {
            if (input.charAt(x) == '(' || input.charAt(x) == '{' || input.charAt(x) == '[') {
                apush(input.charAt(x));
                b = true;
            }
            if (b == true && (input.charAt(x) == ')' || input.charAt(x) == '}' || input.charAt(x) == ']')) {
                char er = input.charAt(x);
                int y = x + 1;
                char r = input.charAt(x);
                char e = a[s - 1];
                //System.out.println(e);
                // System.out.println(r);
                if (s != 0 && e == '(' && r == ')') {
                    apop(input.charAt(x));
                    //  System.out.println("jacche");
                } else if (s != 0 && e == '{' && r == '}') {
                    apop(input.charAt(x));
                } else if (s != 0 && e == '[' && r == ']') {
                    apop(input.charAt(x));
                } else {
                    System.out.println("This expression is NOT correct.");
                    if (input.charAt(x) == ')' || input.charAt(x) == '}' || input.charAt(x) == ']') {
                        System.out.println("Error at character #" + y + " '" + e + "'- not closed.");
                        break;
                    } else {
                        System.out.println("Error at character #" + y + " '" + e + "'- not opened.");
                        break;
                    }
                }
            } else if (b == false && (input.charAt(x) == ')' || input.charAt(x) == '}' || input.charAt(x) == ']')) {
                char er = input.charAt(x);
                int y = x + 1;
                System.out.println("This expression is NOT correct.");
                System.out.println("Error at character #" + y + " '" + er + "'- not opened.");
                break;
            }
        }
        //for (int z = 0; z < 9; z++) {
          //  System.out.println(a[z]);
        //}
        if (this.b == true && this.s == 0) {
            System.out.println("This expression is correct.");
        }

    }

    public void apush(char x) {
        this.a[this.s] = x;
        this.s++;
        // System.out.println(this.s);
    }

    public void apop(char x) {
        this.s--;
        this.a[this.s] = 0;
        //  System.out.println(this.s);

    }


    public Stack(char[] a) {
        head = new Node(a[0], null);
    }


    public void listStack(String input) {

        for (int x = 0; x < input.length(); x++) {
            if (input.charAt(x) == '(' || input.charAt(x) == '{' || input.charAt(x) == '[') {
                this.lpush(input.charAt(x));
                b = true;
            }
            else if (b == true && (input.charAt(x) == ')' || input.charAt(x) == '}' || input.charAt(x) == ']')) {
                char er = input.charAt(x);
                int y = x + 1;
                char r = input.charAt(x);
                char e = (char) head.val;
                //System.out.println(e);
                // System.out.println(r);
                if (s != 0 && e == '(' && r == ')') {
                    lpop(input.charAt(x));
                    //  System.out.println("jacche");
                } else if (s != 0 && e == '{' && r == '}') {
                    lpop(input.charAt(x));
                } else if (s != 0 && e == '[' && r == ']') {
                    lpop(input.charAt(x));
                } else {
                    System.out.println("This expression is NOT correct.");
                    if (input.charAt(x) == ')' || input.charAt(x) == '}' || input.charAt(x) == ']') {
                        System.out.println("Error at character #" + y + " '" + e + "'- not closed.");
                        break;
                    } else {
                        System.out.println("Error at character #" + y + " '" + e + "'- not opened.");
                        break;
                    }
                }
            }
            else if (b == false && (input.charAt(x) == ')' || input.charAt(x) == '}' || input.charAt(x) == ']')) {
                char er = input.charAt(x);
                int y = x;
                System.out.println("This expression is NOT correct.");
                System.out.println();
                System.out.println("Error at character #" + y + " '" + er + "'- not opened.");
                break;
            }
        }
        if(this.b==true&&this.s==0) {
            System.out.println("This expression is correct.");
        }




    }

    public void lpush(char x) {
        Node p = new Node(x, null);
        p.next=head;
        head = p;
        s++;
        //System.out.println("push"+ head.val);
    }

    public void lpop(char x) {
       // System.out.println("pop"+x);
        Node g = head;
        head = head.next;
        g.next = null;
        g = null;
        s--;
       // System.out.println("apop"+head.val);

    }



    }