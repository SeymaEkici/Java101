import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Değişkenlerin tanımlanması işlemi.

        int ay, gun;
        String burc = "";
        Boolean isError = false;

        //Ay ve Gün değerlerinin girilmesi işlemi.

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        gun = input.nextInt();

        //Burçun bulunması işlemi.

        switch (ay) {
            case 1:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;

            case 2:
                if (gun >= 1 && gun <= 28) {
                    if (gun < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
                break;

            case 3:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 21) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
                break;

            case 4:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 21) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
                break;

            case 5:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
                break;

            case 6:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 23) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
                break;

            case 7:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;

            case 8:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
                break;

            case 9:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 23) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
                break;

            case 10:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
                break;

            case 11:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 22) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
                break;

            case 12:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
                break;

            //Hatalı giriş işlemi yapılmışsa.

            default:
                isError = true;
        }
        if (isError) {
            System.out.println("Hatalı ay veya gün girişi yaptınız! Lütfen tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}