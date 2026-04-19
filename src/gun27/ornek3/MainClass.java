package gun27.ornek3;

public class MainClass {
    public static void main (String[] args) {
        /**
         * bir evde kullanılan akıllı termostatın sıcaklık değeri tutuluyor.
         * sıcaklık dışarıdan doğrudan değiştirilmemeli.
         * sıcaklık sadece belirli sınırlar içinde artırılıp azaltılabilmeli.
         **/

        Termostat termostat = new Termostat(20);

        termostat.sicaklikArttir();
        System.out.println(termostat.getSicaklik());
        termostat.sicaklikArttir();
        System.out.println(termostat.getSicaklik());
        System.out.println(termostat.getSicaklik());

    }




}
