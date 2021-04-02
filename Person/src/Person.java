public class Person extends BubbleSort {
    int age = 1;
    private String value[][];
    int allCol = 3;

    public Person(String v[][]) {
        this.value = v;
    }

    @Override
    void compareAge() {

        String temp[][] = new String[value.length][allCol];
        for (int j = 0; j < value.length; j++) {
            for (int i = j + 1; i < value.length; i++) {
                int zero = Integer.parseInt(value[j][age]);
                int one = Integer.parseInt(value[i][age]);
                if (zero > one) {
                    temp[j] = value[j];
                    value[j] = value[i];
                    value[i] = temp[j];
                }
            }
        }
        for (int a = 0; a < value.length; a++) {
            System.out.println(value[a][0] + " " + value[a][1] + " " + value[a][2]);
        }
    }

    @Override
    void compareGender() {
        int gen = 2;
        String temp[][] = new String[value.length][allCol];
        for (int j = 0; j < value.length; j++) {
            for (int i = j + 1; i < value.length; i++) {
                int zero = Integer.parseInt(value[j][age]);
                int one = Integer.parseInt(value[i][age]);
                if (zero == one){
                    if ((value[i][gen]).compareTo(value[j][gen]) < 0 ) {
                        temp[j] = value[j];
                        value[j] = value[i];
                        value[i] = temp[j];
                    }
                }
            }
        }
        for (int a = 0; a < value.length; a++) {
            System.out.println(value[a][0] + " " + value[a][1] + " " + value[a][2]);
        }
    }

}





