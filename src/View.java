public class View {

    public static void main() {
        while (true) {
            System.out.println("\n-------------------");
            System.out.println("|-- My Todolist --|");// title
            System.out.println("-------------------");
            Logic.showTodolist();
            System.out.println("-------------------");

            System.out.println("1. Add Todolist");
            System.out.println("2. Delete Todolist");
            System.out.println("3. Exit");

            String chooseNumber;
            boolean repeatChooseInput;
            do {
                chooseNumber = Model.inputUser("choose");
                if (!chooseNumber.equals("1") && !chooseNumber.equals("2") && !chooseNumber.equals("3")) {
                    System.err.println("just input 1 / 2 / 3!");
                    repeatChooseInput = true;
                } else {
                    repeatChooseInput = false;
                }
            } while (repeatChooseInput);

            if (chooseNumber.equals("1")) {
                addTodolist();
            } else if (chooseNumber.equals("2")) {
                removeTodolist();
            } else {
                System.out.println("Good bye!");
                break;
            }
        }
    }

    public static void addTodolist() {
        String newTodo = Model.inputUser("new Todolist (Input 0 to back)");
        if (!newTodo.equals("0")) {
            Logic.addTodolist(newTodo);
        }
    }

    public static void removeTodolist() {
        System.out.println("Input the number you want to remove ( input 0 to back)");
        do {
            try {
                int number = Integer.parseInt(Model.inputUser("number"));
                boolean isRemoved = Logic.removeTodolist(number);
                if (isRemoved) {
                    System.out.println("- Todo removed -");
                    break;
                } else if(number == 0) {
                    break;
                }else {
                    System.err.println("- Number not found! -");
                }
            } catch (Exception e) {
                System.err.println("Number only!");
            }
        } while (true);


    }
}
