

public class Logic {

    public static void showTodolist() {
        String[] data = Model.data;
        for(int i = 0; i < data.length; i++) {
            if(data[i] == null) {
                continue;
            }
            System.out.println(i + 1 + ". " + data[i]);
        }
    }

    public static void addTodolist(String todo) {
//      cek apakah data di model penuh?
        boolean isFull = true;
        for(String data : Model.data) {
            if(data == null) {
                isFull = false;
                break;
            }
        }

//        jika penuh, resize 2x lipat
        if(isFull) {
            String[] tempData = Model.data;
            Model.data = new String[Model.data.length * 2];
            for (int i = 0; i < tempData.length; i++) {
                Model.data[i] = tempData[i];
            }
        }

//        tambah data
        for (int i = 0; i < Model.data.length; i++) {
            // cek data kosong
            if (Model.data[i] == null) {
                // cek apakah di index selanjutnya terdapat data
                if((i + 1) < Model.data.length && Model.data[i + 1] != null) {
                    Model.data[i] = Model.data[i + 1];
                    Model.data[i + 1] = null;
                } else {
                    Model.data[i] = todo;
                    break;
                }
            }
        }

    }

    public static void removeTodolist() {

    }
}
