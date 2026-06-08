public class NightInTheQADepartament {
    static void main() {
        int[] pipelineAutotests = new int[100];
        int countPass = 0;
        int countFlaky = 0;
        int countBug = 0;
        int countCritical = 0;

        for (int i = 1; i <= pipelineAutotests.length; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("Тест #" + i +":" + " Critical!");
                countCritical++;
            } else if (i%5 == 0) {
                System.out.println("Тест #" + i +":" + " Bug");
                countBug++;
            } else if (i%3 == 0) {
                System.out.println("Тест #" + i +":" + " Flaky");
                countFlaky++;
            } else {
                System.out.println("Тест #" + i +":" + " Pass");
                countPass++;
            }
        }

        System.out.println("===== ИТОГИ НОЧНОЙ СМЕНЫ ===== \n" +
                "Всего тестов: 100 \n" +
                "Pass: " + countPass + "\n" +
                "Flaky: " + countFlaky + "\n" +
                "Bug: " + countBug + "\n" +
                "Critical: " + countCritical
        );

    }
}