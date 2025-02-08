public class Test {

    public static void getMockData() {
        for (int i = 0; i < Model.data.length; i++) {
            Model.data[i] = "Sample data ke-" + (i + 1);
        }
    }

    public static void showTodolist() {
        Logic.showTodolist();
    }


    public static void addTodolist() {
        Logic.addTodolist("Melakukan hal ajaib");
        Logic.addTodolist(null);
        Logic.addTodolist("Mencintaimu");
    }

    public static void removeTodolist() {
        getMockData();
        Logic.removeTodolist(3);
    }
}
