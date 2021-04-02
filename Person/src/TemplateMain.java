public class TemplateMain {
    public static void main(String[] args) {
        String person[][] = { {"Apple", "13", "Male"},
                {"Boy", "13", "Female"},
                {"Catie", "13","Male"},
                {"Smart", "39", "Male"},
                {"Soy", "25", "Female"},
                {"Gill", "29","Male"} ,
                {"Swift", "25","Male"},
                {"Wood", "29","FeMale"} };

        BubbleSort sorter = new Person(person);
        System.out.println("sort Age only");
        sorter.compareAge();
        System.out.println();
        System.out.println("if they have the same age then sort gender ");
        sorter.compareGender();






    }
}
