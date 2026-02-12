package Lista;

public class App {

    public static void main(String[] args) {

        User[] users = new User[10];


        for(int i = 0; i < users.length; i++){
            User actual = new User();
            actual.setFirtName("Nome " + i);
            actual.setLastName("Sobrenome " + i);
            users[i] = actual;

        }

        System.out.println(users[2].getFirtName());
        System.out.println(users[2].getLastName());


    }
}
