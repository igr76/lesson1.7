public class Main {
    public static void main(String[] args) {
        ;
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName;
        fullName = firstName + "  " + middleName + "  " + lastName;
        System.out.println("ФИО сотрудника —  " + fullName);

        //перевод регистра
        System.out.println("Данные ФИО сотрудника для заполнения отчета" +
                " —  " + fullName.toUpperCase());
        //замена ё
        String fullName1 = "Иванов Семён Семёнович";
        if (fullName1.contains("ё")) {
        String[] words = fullName1.split("ё");
        for (int i = 0; i < words.length; i++) {
            if (i == 0){
                System.out.print(words[0]);
            } else
            System.out.print("е" + words[i]);
        }} else   System.out.print(fullName1);

    }
}