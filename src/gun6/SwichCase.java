package gun6;

public class SwichCase {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Pazaretesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;

            default:
                System.out.println("Gecersiz tarih araligi");
        }
        int seviye =1;
                switch (seviye) {
                    case 1:
                        System.out.println("Seviye 1");
                        break;
                    case 2:
                        System.out.println("Seviye 2");
                        break;
                       case 3:
                        System.out.println("Seviye 3");

                }

                System.out.println("-----------");
                char harf = 'p';

                switch (harf) {
                    case 'A':
                    case 'B':
                        case 'C':
                            System.out.println("Gecer not");
                        break;
                        case 'D':
                            case 'E':
                                System.out.println("Kaldi");
                                break;
                    default:
                        System.out.println("Sinava girmedi");
                }

                System.out.println("-----------");

                String brans = "QA";
                        switch (brans) {
                        case "DEV":
                            System.out.println("Developer");
                            break;
                        case "QA":
                            System.out.println("SDET");
                            break;
                            case "PM":
                                System.out.println("Project Manager");
                                break;

                                default:
                                    System.out.println("Yapay zeka yeni brans buldu");
                        }





                        }
}
