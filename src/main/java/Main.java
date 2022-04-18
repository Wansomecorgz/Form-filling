public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.phoneNumber = "+7(918)6753571";
        post.passport = "0312 667456";
        post.subscribe = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 01;
        post.birthday.year = 1993;

    }
}
