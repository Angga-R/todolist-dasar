public class View {

    public static void showTodolist() {
        while (true) {
            System.out.println("--- My Todolist ---");// title
            Logic.showTodolist();

            System.out.println("1. Add Todolist");
            System.out.println("2. Delete Todolist");
            System.out.println("3. Exit");

            String chooseNumber;
            boolean repeatChooseInput = false;
            do {
                chooseNumber = Model.inputUser("choose");
                if (!chooseNumber.equals("1") && !chooseNumber.equals("2") && !chooseNumber.equals("3")) {
                    System.out.println("just input 1 / 2 / 3!");
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
        System.out.println("Add todolist");
    }

    public static void removeTodolist() {
        System.out.println("remove todolist");
    }
}
